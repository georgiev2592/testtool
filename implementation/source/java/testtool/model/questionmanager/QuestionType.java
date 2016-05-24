
package testtool.model.questionmanager;

import java.util.ArrayList;

/**
 * Corresponds to possible question types as defined in the database.
 * 
 * @author Ian Smith-Grove
 */
public enum QuestionType {

    ShortAnswer ("Short Answer"), 
    MultipleChoice ("Multiple Choice"),
    Essay ("Free Response");
    
    /**
     * the string value of the questiontype
     */
    private final String val;
    
    /**
     * constructor for the questiontype -- each questiontype is assigned
     * string value
     */
    QuestionType(String val) {
        this.val = val;
    }
    
    /**
     * questiontype is printed as the string
     */
    @Override
    public String toString() {
        return val;
    }   
}
