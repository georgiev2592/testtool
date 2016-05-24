package testtool.database;

import testtool.database.selection.Tuple;
import testtool.database.selection.Attribute;
import testtool.model.administration.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import testtool.database.selection.Selection;

/**
 * The TestToolDb is the top-level data class for the Test Tool. It encapsulates
 * the following structures: a reference to each database object (QuestionDB,
 * CourseDB, etc), and an ActiveUserData object, containing all data relevant to
 * the active user.
 * 
 * @author Ian Smith-Grove
 */
public class TestToolDB {

    /** Raw, editable question data */
    public QuestionDB questionBank;
    /**  Raw, editable test data */
    public TestDB testBank;
    /** Registered users */
    public UserDB userBank;
    /** Registered courses */
    public CourseDB courseBank;
    /** Registered published tests */
    public PublishedTestDB publishedTestBank;
    /** Information about the current user */
    public User activeUser;

    /** Connection to the database */
    private Connection connect = null;
    /** Query submitted to the database (SELECT) */
    private Statement statement = null;
    /** Statement executed for the database (ALTER, INSERT, DELETE, etc) */
    private PreparedStatement preparedStatement = null;
    /** Results of query performed on the database */
    private ResultSet resultSet = null;

    /**
     * Initialize all components.
     */
    public TestToolDB() {
        questionBank = new QuestionDB(this);
        testBank = new TestDB();
        userBank = new UserDB(this);
        courseBank = new CourseDB(this);
        publishedTestBank = new PublishedTestDB(this);
        // user is null until login
        activeUser = null;
    }

    /**
     * Connect to the MySQL database server.
     */
    private void connect() throws ClassNotFoundException, SQLException {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql:"
                    + "//testtool.cytvwijmz1je.us-west-2.rds.amazonaws.com:"
                    + "3306/TestToolDB?"
                    + "user=wreckingball&password=patricksux");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Missing driver: com.mysql.jbdc.Driver");
            throw cnfe;
        } catch (SQLException sqle) {
            System.err.println(sqle.getMessage());
        }
    }

    /**
     * Disconnect from MySQL database server.
     */
    private void disconnect() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            // No need to handle errors on close.
        }
    }

    /**
     * Performs query on the database returns the results.
     *
     * @param query query for the database
     */
    public Selection executeQuery(String query) {
        Selection results = new Selection();
        try {
            connect();
            System.out.println(query);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            results = new Selection(getResults(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
            return results;
        }
    }

    /**
     * Executes statement to modify the contents of the database.
     *
     * @param statement statement executed on the database
     */
    public int executeUpdate(String statement) {
        int id = -1;
        try {
            connect();
            System.out.println(statement);
            preparedStatement = connect.prepareStatement(statement, Statement.RETURN_GENERATED_KEYS);
            int affectedRows = preparedStatement.executeUpdate();
            
            if (affectedRows == 0) {
                throw new SQLException();
            }
            
            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    id = generatedKeys.getInt(1);
                }
                else {
                    //throw new SQLException();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
        return id;
    }

    /**
     * Print the names of each column in the selected table.
     * For testing!!
     * @param resultSet
     * @throws SQLException 
     */
    private void printMetaData(ResultSet resultSet) throws SQLException {
        //   Now get some metadata from the database
        // Result set get the result of the SQL query
        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
            System.out.println("Column " + i + " " + resultSet.getMetaData().getColumnName(i));
        }
    }

    /**
     * Print out all attributes for each entry in the selected table.
     * For testing!!
     * @param resultSet
     * @throws SQLException 
     */
    private void printResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                System.out.println(resultSet.getMetaData().getColumnName(i)
                                    + ": " + resultSet.getString(i));
            }
        }
    }
    
    /**
     * 
     */
    private Collection<Tuple> getResults(ResultSet resultSet) {
        Collection<Tuple> results = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Collection<Attribute> attributes = new ArrayList<>();
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    String columnName   = resultSet.getMetaData().getColumnName(i);
                    String columnValue  = resultSet.getString(i);
                    attributes.add(new Attribute(columnName, columnValue));
                }
                results.add(new Tuple(attributes));
            }
        } catch (SQLException sqle) {
                    
        } finally {
            return results;        
        }
    }
}
