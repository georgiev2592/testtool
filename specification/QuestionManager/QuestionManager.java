package QuestionManager;

public abstract class QuestionManager {

	private QuestionBank questions;

	/**
	 * Create a question based on input specified in the UI
	 */
        /*
            post:
                exists(Question new);
        */
	public abstract void createQuestion();

	/**
	 * Edit a question based on input specified in the UI
	 */
        /*
            pre:
                exists(Question q);
        */
	public abstract void editQuestion();

	/**
	 * Delete a question based on input specified in the UI
	 */
        /*
            pre:
                exists(Question q);
        */
	public abstract void deleteQuestion();
}
