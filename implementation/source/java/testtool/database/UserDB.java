package testtool.database;

import testtool.database.selection.Tuple;
import java.util.ArrayList;
import java.util.Collection;
import testtool.database.query.Query;
import testtool.database.selection.Attribute;
import testtool.database.selection.Selection;
import testtool.model.administration.User;
import testtool.model.administration.UserPermission;

/**
 * Front-end for database of registered users.
 */
public class UserDB {
    private final TestToolDB database;

    public UserDB(TestToolDB database) {
        this.database = database;
    }
    
    public void updateUser(int id,
                           String username, 
                           String password, 
                           String email, 
                           String firstname, 
                           String lastname, 
                           UserPermission p) {
        Query query = new Query("User");
        query.addItem("username", username);
        query.addItem("password", password);
        query.addItem("email", email);
        query.addItem("firstname", firstname);
        query.addItem("lastname", lastname);
        
        Collection<Attribute> temp = new ArrayList<>();
        temp.add(new Attribute("id", id));
        database.executeUpdate(query.buildUpdate(temp));
    }
    
    public void removeUser(int id) {
        Query query = new Query("User");
        query.addItem("id", id);
        database.executeUpdate(query.buildDelete());
    }
    
    /**
     * Insert a new entry with the passed attributes into the User table.
     */
    public void insertUser(String username,
                           String password,
                           String email,
                           String firstname,
                           String lastname,
                           UserPermission p) {
        Query query = new Query("User");
        query.addItem("username", username);
        query.addItem("password", password);
        query.addItem("email", email);
        query.addItem("firstname", firstname);
        query.addItem("lastname", lastname);     
        
        int uid = database.executeUpdate(query.buildInsert());
        
        if (p.isTeacher()) {
            query = new Query("Teacher");
            query.addItem("id", uid);
            database.executeUpdate(query.buildInsert());
        }
        if (p.isStudent()) {
            query = new Query("Student");
            query.addItem("id", uid);
            database.executeUpdate(query.buildInsert());           
        }
        if (p.isGrader()) {
            query = new Query("Grader");
            query.addItem("id", uid);
            database.executeUpdate(query.buildInsert());            
        }
        if (p.isSysAdmin()) {
            query = new Query("SysAdmin");
            query.addItem("id", uid);
            database.executeUpdate(query.buildInsert());            
        }
    }
    
    /**
     * Grabs the user with matching id.
     */
    public User selectUser(int id) {
        Query query = new Query("User");
        query.addItem("id", id);
        Collection<User> users = buildUsers(query.build());
        if (!users.isEmpty()) {
            return (User) users.toArray()[0];
        } else {
            return null;
        }        
    }
      
    /**
     * Grabs the user with matching email.
     */
    public User selectUser(String email) {
        Query query = new Query("User");
        query.addItem("email", email);
        Collection<User> users = buildUsers(query.build());
        if (!users.isEmpty()) {
            return (User) users.toArray()[0];
        } else {
            return null;
        }
    }
    
        /**
     * Grabs the user with matching username.
     */
    public ArrayList<User> selectUserByName(String username) {
        ArrayList<User> users = new ArrayList<User>();
        users.add((User)(selectUser(0, username, "", "", "", "").toArray())[0]);
        if (!users.isEmpty()) {
            return users;
        } else {
            return null;
        }
    }
    
    /**
     * Grabs the user with matching username and password.
     */
    public User selectUser(String username, String password) {
        Query query = new Query("User");
        query.addItem("username", username);
        query.addItem("password", password);

        Collection<User> users = buildUsers(query.build());
        if (!users.isEmpty()) {
            return (User) users.toArray()[0];
        } else {
            return null;
        }
    }
    
    /**
     * Builds a Collection of User objects using the data results of a query
     *  built from the passed attributes.
     */
    public Collection<User> selectUser(int id,
                                       String username,
                                       String password,
                                       String email,
                                       String firstname,
                                       String lastname) {  
        Collection<User> users = new ArrayList<>();
        
        Query query = new Query("User");
        query.addItem("id", Integer.toString(id));
        query.addItem("username", username);
        query.addItem("password", password);
        query.addItem("email", email);
        query.addItem("firstname", firstname);
        query.addItem("lastname", lastname);
                
        return buildUsers(query.build());
    }
    
    public Collection<User> selectAllTeachers() {
        return buildUsers("SELECT * FROM User NATURAL JOIN Teacher;");
    }
    
    /**
     * 
     * @param query
     * @return 
     */
    private Collection<User> buildUsers(String query) {
        Collection<User> users = new ArrayList<>();
        Selection results = database.executeQuery(query);
        for (Tuple tuple : results) {
            users.add(buildUser(tuple));
        }
        return users;
    }
    
    /**
     * 
     * @param tuple
     * @return 
     */
    private User buildUser(Tuple tuple) {
        int id = Integer.parseInt(tuple.getValue("id"));
        String username = tuple.getValue("username");
        String password = tuple.getValue("password");
        String email = tuple.getValue("email");
        String firstname = tuple.getValue("firstname");
        String lastname = tuple.getValue("lastname");
        UserPermission type = buildUserPermission(id);
        return new User(id, username, password, email, firstname, lastname, type);
    }
    
    /**
     * 
     */
    private UserPermission buildUserPermission(int uid) {
        Selection queryResult;
        String [] types = {"Teacher", "Student", "Grader", "SysAdmin"};
        boolean[] permissions = {false, false, false, false};
        
        for (int i = 0; i < types.length; ++i) {
            queryResult = database.executeQuery(
                    "SELECT * FROM " + types[i] + " WHERE id = " + uid + ";"
            );
            permissions[i] = !queryResult.isEmpty();
        }
        return new UserPermission(permissions[0], permissions[1], permissions[2], permissions[3]);
    }
}
