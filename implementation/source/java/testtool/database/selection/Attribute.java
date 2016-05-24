package testtool.database.selection;

/**
 * Represents an attribute (column) of a relational database table.
 * @author Ian Smith-Grove
 */
public class Attribute {
    /** name of the column */
    public String column;
    
    /** value of the column */
    public String value;
    
    /**
     * Initialize values.
     */
    public Attribute(String column, String value) {
        this.column = column;
        this.value  = value;
    }
    
    public Attribute(String column, int value) {
        this(column, Integer.toString(value));
    }
    
    @Override
    public String toString() {
        return "(" + column + " : " + value + ")";
    }
}
