package QuestionManager;

public abstract class Question {
	
	private QuestionType type;
	private String prompt;

	/**
	 * 
	 * @return the question type
	 */
	public abstract QuestionType getType();

	/**
	 * 
	 * @return the question prompt
	 */
	public abstract String getPrompt();

	/**
	 * 
	 * @param prompt  the question prompt
	 */
	public abstract void setPrompt(String prompt);

	/**
	 * 
	 * @param obj  another question
	 * @return true if the given question equals this, else false
	 */
	public abstract boolean equals(Object obj);
}
