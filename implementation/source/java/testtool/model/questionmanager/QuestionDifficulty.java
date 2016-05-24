
package testtool.model.questionmanager;

/**
 * Corresponds to possible difficulty ratings for questions as defined in the database.
 * 
 * @author Ian Smith-Grove
 */
public enum QuestionDifficulty {
    
    VeryEasy ("Very Easy"),
    Easy ("Easy"),
    Moderate ("Moderate"),
    Hard ("Hard"),
    VeryHard ("Very Hard");
    
    /**
     * 
     */
    private final String val;

    /**
     * Initiate values.
     */
    QuestionDifficulty(String val) {
        this.val = val;
    }
    
    /**
     * Get difficulty rating for difficulty.
     * @return difficulty rating, as defined in the database
     */
    public int getRating() {
        return this.ordinal() + 1;
    }
    
    /**
     * 
     */
    @Override
    public String toString() {
        return val;
    }
}
