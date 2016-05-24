package QuestionManager;

public abstract class QuestionType {
	
	private String label;

	/**
	 * 
	 * @return the question type label
	 */
	public abstract String getLabel();

	/**
	 * 
	 * @param label  the question type label
	 */
	public abstract void setLabel(String label);

	/**
	 * 
	 * @param obj  another question type
	 * @return true if the given question type equals this, else false
	 */
	public abstract boolean equals(Object obj);
}
