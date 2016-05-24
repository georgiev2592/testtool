package QuestionManager;

import java.util.List;

public abstract class QuestionBank {

	private List<Question> questions;

	/**
	 * 
	 * @param q  the question to be added to the bank
	 */
	public abstract void addQuestion(Question q);

	/**
	 * 
	 * @param i  the index of the question to be deleted
	 */
	public abstract void deleteQuestion(int i);

	/**
	 * 
	 * @param i  the index of the question to be retrieved
	 * @return the question at the given index in the bank
	 */
	public abstract Question get(int i);

	/**
	 * 
	 * @return the number of questions in the bank
	 */
	public abstract int getSize();

}
