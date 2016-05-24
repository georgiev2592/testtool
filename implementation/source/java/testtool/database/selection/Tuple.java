package testtool.database.selection;

import testtool.database.selection.Attribute;
import java.util.Collection;

/**
 * Represents an entry in a relational database table.
 * @author Ian Smith-Grove
 */
public class Tuple {
    
    /** All data associated with the table entry. */
    Collection<Attribute> attributes;
    
    /**
     * Initialize values.
     */
    public Tuple(Collection<Attribute> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * Grabs the value of a specified attribute.
     * @param column the name of the column for the attribute
     * @return value if attribute exists, empty string otherwise
     */
    public String getValue(String column) {
        for (Attribute attribute : attributes) {
            if (attribute.column.equals(column)) {
                return attribute.value;
            }
        }
        return "";
    }
    
    /**
     * 
     * @param column
     * @return 
     */
    public int getValueInt(String column) {
        return Integer.parseInt(this.getValue(column));
    }
    
    /**
     * 
     * @param column
     * @return 
     */
    public boolean getBooleanValue(String column) {
        return Boolean.parseBoolean(this.getValue(column));
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Attribute attribute : attributes) {
            result += attribute.toString();
        }
        return result;
    }
}
