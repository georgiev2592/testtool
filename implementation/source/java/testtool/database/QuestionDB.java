package testtool.database;

import testtool.database.selection.Tuple;
import testtool.model.administration.User;
import testtool.model.administration.Course;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.Date;
import java.sql.Time;
import testtool.database.query.Query;
import testtool.database.selection.Attribute;
import testtool.database.selection.Selection;
import testtool.model.questionmanager.Answer;
import testtool.model.questionmanager.Question;
import testtool.model.questionmanager.QuestionDifficulty;
import testtool.model.questionmanager.QuestionType;

/****
 * Class QuestionDB provides a front-end for the database of raw question data.
 * It provides method to add, remove, and modify the question data within the database.
 *
 * @author Ian Smith-Grove (ismithgr@calpoly.edu)
 *
 */
public class QuestionDB {
      
    /**
     * 
     */
    private final TestToolDB database;
   
    /**
     * Initialize components.
     */
    public QuestionDB(TestToolDB database) {
        this.database = database;    
    }
    
    /**
     * 
     * @param keywords
     * @return 
     */
    public Collection<Question> selectQuestions(String[] keywords) {
        Collection<Question> selection = new ArrayList<>();
        
        for (String keyword: keywords) {
            selection.addAll(this.selectQuestions(keyword));
        }
        return selection;
    }
    
    /**
     * 
     * @param keyword
     * @return 
     */
    private Collection<Question> selectQuestions(String keyword) {        
        String query = "SELECT DISTINCT Question.*"
                       + " FROM Question, Keyword"
                       + " WHERE Question.id = Keyword.question"
                       + " && (Keyword.word = " + "\'" +  keyword + "\'"
                       + " || Question.prompt LIKE (" + "\'%" + keyword + "%\'" + "));";
        return buildQuestions(database.executeQuery(query));
    }
    
    /**
     * 
     * @param queryResult
     * @return 
     */
    private Collection<Question> buildQuestions(Selection selection) {
        Collection<Question> questions = new ArrayList<>();
        for (Tuple tuple : selection) {
            questions.add(buildQuestion(tuple));
        }
        return questions;
    }
    
    /**
     * 
     * @param tuple
     * @return 
     */
    private Question buildQuestion(Tuple tuple) {
        int id = tuple.getValueInt("id");
        QuestionType type = QuestionType.values()[tuple.getValueInt("type")];
        Course course = database.courseBank.selectCourse(tuple.getValueInt("course"));
        String prompt = tuple.getValue("prompt");
        QuestionDifficulty difficulty = QuestionDifficulty.values()[tuple.getValueInt("difficulty")];
        // TIME TO COMPLETE NOT IMPLEMENTED
        // TIME TO COMPLETE NOT IMPLEMENTED
        // TIME TO COMPLETE NOT IMPLEMENTED
        User createdBy = database.userBank.selectUser(tuple.getValueInt("created_by"));
        Date createdOn = Date.valueOf(tuple.getValue("created_on"));

        return new Question(id, type, course, prompt, difficulty, 0, createdBy, createdOn, null, null); // keywords        
    }   
    
    /** Builds a collection of Question objects from the data of any number
     *   of questions in the database with attributes matching those of the
     *   argument.
     *
     * @return 
     */
    public Collection<Question> selectQuestions(QuestionType type,
                                                String[] keywords,
                                                Course course,
                                                User author, 
                                                QuestionDifficulty difficulty, 
                                                int timeToComplete) {
        Collection<Question> questions = new ArrayList<>();
        
        Query query = new Query("Question");
        if (type != null)
            query.addItem("type", type.ordinal());
        // keywords NOT IMPLEMENTED
        // keywords NOT IMPLEMENTED
        // keywords NOT IMPLEMENTED
        if (course != null) {
            query.addItem("course", course.id);
            System.out.println("buil query for course");
        }
        // author NOT IMPLEMENTED
        // author NOT IMPLEMENTED
        // author NOT IMPLEMENTED
        if (difficulty != null)
            query.addItem("difficulty", difficulty.getRating());
        if (timeToComplete > 0) {
            query.addItem("time_to_complete", timeToComplete);
        }
        
        Selection result = database.executeQuery(query.build());
        
        return buildQuestions(result);
    }
    
    /** 
     * Inserts entry into Question table using data from Question object.
     * @param data  container for data needed for query
     * 
       @pre
           //
           //
           //
       @post
           //
           //
           //
     */
    public void insertQuestion (QuestionType type, 
                                Course course,
                                String prompt,
                                Collection<Answer> answers,
                                String[] keywords,
                                QuestionDifficulty difficulty,
                                Time timeToComplete,
                                User createdBy,
                                java.sql.Date createdOn ) {
        
        int type_id = type.ordinal();
        int course_id = course.id;
        int difficulty_id = difficulty.ordinal() + 1;
        int user_id = createdBy.id;
        
        Query query = new Query("Question");
        query.addItem("type", type.ordinal());
        query.addItem("course", course.id);
        query.addItem("prompt", prompt);
        query.addItem("time_to_complete", timeToComplete.toString());
        query.addItem("difficulty", difficulty.getRating());
        query.addItem("created_by", createdBy.id);
        query.addItem("created_on", createdOn.toString());
        
        int qid = database.executeUpdate(query.buildInsert());
        
        if (qid == -1) {
            System.out.println("Error: Question could not be created.");
            return;
        }
        
        insertAnswers(qid, answers);
        insertKeywords(qid, keywords);
    }
    
    /** 
     * Inserts entries into Answer table for each item in passed Collection.
     * @param qid      id for associated question
     * @param answers  list of answers to be associated
     *                                                                     <pre>
       pre:
        //
        // A question with the passed question id exists in the database.
        //
        selectQuestion(qid) != null;

       post:
        //
        // For each answer in the passed collection, there exists a
        //   corresponding entry in the Answer table of the database that is
        //   associated with the passed question id.
        //
        forall (Answer a;
                answers.contains(a); 
                    exists(Answer b;
                           selectAnswers(qid).contains(b);
                               a.response.equals(b.response) &&
                               a.isCorrect == b.isCorrect));
     * </pre>
     */
    private void insertAnswers(int qid, Collection<Answer> answers) {
        for (Answer answer : answers) {
            Query query = new Query("Answer");
            query.addItem("question", qid);
            query.addItem("val", answer.response);
            query.addItem("is_correct", answer.isCorrect);
        }
    }
    
    /** 
     * Inserts entries into Keywords table for each item in passed Collection.
     * @param qid       id of the associated question entry
     * @param keywords  list of keywords to be associated
     *                                                                     <pre>
       pre:
        //
        // A question with the passed question id exists in the database.
        //
        selectQuestion(qid) != null;

       post:
        //
        // For each keyword in the passed collection, there exists a
        // corresponding entry in the Keyword table of the database that is
        // associated with the passed question id.
        //
        forall (Keyword a;
                keywords.contains(a); 
                    exists(Keyword b;
                           selectKeywords(qid).contains(b);
                               a.equals(b)));
     * </pre>
     */
    private void insertKeywords(int qid, String[] keywords) {
        for (String keyword : keywords) {
            Query query = new Query("Keyword");
            query.addItem("word", keyword);
            query.addItem("question", qid);
            database.executeUpdate(query.buildInsert());
        }
    }
    
    /**
     * Removes entry from Question table with the passed question id.
     * @param qid  question id of the Question table entry to be removed
     * 
     * <pre>
       pre:
        //
        // A question with the passed question id exists in the database.
        //
        selectQuestion(qid) != null;

       post:
        //
        // The question with the passed question id has been removed.
        //
        selectQuestion(qid) == null;
     * </pre>
     */
    public void removeQuestion(int qid) {
        Query query = new Query("Question");
        query.addItem("id", qid);
        database.executeUpdate(query.buildDelete());
    }
    
    /**
     * Builds a Question object from the data of the question in the
     *  database with a matching question id.
     * param qid  question id corresponding to an entry in the question table
     * return     object representation of data corresponding to table entry
     *                                                                     
     * <pre>
       pre:
        //
        // A question with the passed question id exists in the database.
        //
        selectQuestion(qid) != null;

       post:
        //
        // The Question object was built from data in the question table entry
        //   with the same question id.
        //
        return.qid == qid;
     * </pre>
     */
    public Question selectQuestion(int qid) {
        Query query = new Query("Question");
        query.addItem("id", qid);
        Selection results = database.executeQuery(query.build());
        Collection<Question> questions = buildQuestions(results);
        if (!questions.isEmpty()) {
            return (Question) questions.toArray()[0];
        } else {
            return null;
        }
    }
    
    /**
     * Builds a collection of Answers encapsulating the data from entries in
     * the answer table of the database corresponding to the passed question id.
     * @param qid  question id corresponding to entry in question table
     * @return     collection of objects corresponding to answer table entries
     *                                                                     <pre>
       pre:
        //
        // A question with the passed question id exists in the database.
        //
        selectQuestion(qid) != null;

       post:
        //
        // Each answer has non-null fields and a question id matching that of
        //   the argumentand non-null fields.
        //
        forall (Answer a;
                return.contains(a);
                    a.qid == qid
                     && a.response  != null
                     && a.isCorrect != null);
     */
    private Collection<Answer> selectAnswers(int qid) {
        Collection<Answer> selection = new ArrayList<Answer>();
        
        Query query = new Query("Answer");
        query.addItem("question", qid);
        Selection results = database.executeQuery(query.build());
        
        return buildAnswers(results);
    }
    
    /**
     * 
     * @param queryResult
     * @return 
     */
    private Collection<Answer> buildAnswers(Selection queryResult) {
        Collection<Answer> answers = new ArrayList<>();
        
        for (Tuple result : queryResult) {
            answers.add(buildAnswer(result));
        }
        return answers;
    }
    
    /**
     * Creates an answer object from the data in the formatted result string.
     * Each attribute is comma-separated, in order of columns in the table.
     * @param queryResult
     * @return encapsulation of the answer data
     */
    private Answer buildAnswer(Tuple tuple) {
        String val = tuple.getValue("val");
        boolean isCorrect = tuple.getBooleanValue("is_correct");
        return new Answer(val, isCorrect);
    }
    
    /**
     * Builds a collection of strings corresponding to entries in the Keyword 
     *   table of the database associated with the passed question id.
     * @param qid  question id corresponding to entry in question table
     * @return     collection of objects corresponding to answer table entries
     *                                                                     <pre>
       pre:
        //
        // A question with the passed question id exists in the database.
        //
        selectQuestion(qid) != null;

       post:
        //
        // There is at least one keyword and no keywords are duplicates.
        //
        !return.isEmpty()
         && forall (String s;
                    return.contains(s);
                        a.qid == qid
                         && a.response  != null
                         && a.isCorrect != null);
     */    
    private Collection<String> selectKeywords(int qid) {
        Collection<String> selection = new ArrayList<String>();
        
        Query query = new Query("Answer");
        query.addItem("question", qid);
        Selection results = database.executeQuery(query.build());

        for (Tuple result : results) {
            selection.add(result.getValue("word"));
        }
        return selection;
    }    
}
