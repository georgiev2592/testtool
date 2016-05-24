package testtool.model.questionmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;
import testtool.model.administration.Course;
import testtool.database.TestToolDB;
import testtool.model.administration.User;

/**
 * Module of the Test Tool containing all functionality related to managing the
 * question database.
 * 
 */
public class QuestionManager {
    
    /** Reference to the Test Tool database */
    TestToolDB database;
    
    /** List of questions built from search results */
    Collection<Question> questionList;

    public QuestionManager(TestToolDB database) {
        this.database = database;
        this.questionList = new HashSet<>();
    }
    
    /** Adds a new question (entry) to the question bank (database)
     * @param type        question type; determines answer(s) interpretation
     * @param course      subject question was created for
     * @param prompt      question prompt/instructions
     * @param answers     possible responses to the question
     * @param keywords    keywords associated with the question (for search)
     * @param difficulty  difficulty rating for the question
     * @param time        estimated time to complete the question
     *  <pre>
       pre:
          //
          // All inputs are valid.
          //
       post:
          //
          // Question is entered into database.
          //
     * </pre>
     */
    public void createQuestion(
                                QuestionType type,
                                Course course,
                                String prompt,
                                Collection<Answer> answers,
                                String[] keywords,
                                QuestionDifficulty difficulty,
                                int time
                              ) {
        System.out.println("In QuestionManager.createQuestion");
        User createdBy = database.activeUser;
        Time timeToComplete = new Time(time);
        Date createdOn = new Date(new java.util.Date().getTime());
        database.questionBank.insertQuestion(
                type, course, prompt, answers, keywords, difficulty, timeToComplete, createdBy, createdOn );
    }
    
    /**
     * Edit a question based on input specified in the UI
     */
    /*
      pre:
         exists(Question q);
         exists(QuestionBank questions);
     */
    public void editQuestion(Question q) {

    }

    /**
     * Delete a question based on input specified in the UI
     */
    public void deleteQuestion(Question q) {
    
    }
    
    /**
     * Perform search query (using keywords) on database and return results.
     */
    public void searchQuestion(String[] keywords) {
        questionList = database.questionBank.selectQuestions(keywords);
    }
    
    /**
     * Perform search query (using attributes) on database and return results.
     */
    public void searchQuestion(String[] keywords,
                               QuestionType type,
                               Course course,
                               QuestionDifficulty difficulty,
                               User author) {
        questionList = database.questionBank.selectQuestions(type, keywords, course, author, difficulty, 0);
        
        if (type != null) {
            System.out.println("HIT!");
        }  
    }
    
    /**
     * 
     */
    public Collection<Question> getQuestionList() {
        return this.questionList;
    }

    
    /**
     * 
     */
    public Course[] buildCourseList() {
        Collection<Course> selection = database.courseBank.selectAllCourses();
        Course[] result = new Course[selection.size()];
        return selection.toArray(result);
    }
    
    /**
     * 
     */
    public User[] buildTeacherList() {
        Collection<User> selection = database.userBank.selectAllTeachers();
        User[] result = new User[selection.size()];
        return selection.toArray(result);
    }
}
