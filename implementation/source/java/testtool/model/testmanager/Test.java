
package testtool.model.testmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import testtool.model.administration.Course;
import testtool.model.administration.User;
import testtool.model.questionmanager.Question;

/**
 * Encapsulates the data representing an entry in the Test table of the database.
 * 
 * @author Peter Georgiev
 */
public class Test {
   /**
    * unique id of the test
    */
   public int id;

   /**
    * the collection of collections that makes up the test
    */
   public Collection<Question> questions;

   /**
    * the title of the test
    */
   public String title;

   /**
    * introductory statement for the test
    */
   private String introduction;

   /**
    * course the test belongs to
    */
   private Course course;

   /**
    * user that created the test
    */
   private User createdBy;

   /**
    * the date the test was created on
    */
   private Date createdOn;
   
   public Test () {
      
   }
   
   /**
    * constructor for the test
    * @param title
    * @param introduction
    * @param course
    * @param createdBy
    */
   public Test(String title, String introduction, Course course, User createdBy) {
      this.id = 0;
      this.title = title;
      this.introduction = introduction;
      this.course = course;
      this.createdBy = createdBy;
      this.createdOn = new Date();
      this.questions = new ArrayList<Question>();
   }
   
   /**
    * returns the id
    */
   public int getId () {
      return this.id;
   }
   
   /**
    * set the id of the test
    * @param id
    pre:
       exists(int id; id > 0);
    */
   public void setId(int id) {
      this.id = id;
   }
   
   /**
    * get the collection of questions
    */
   public Collection<Question> getQuestions() {
      return this.questions;
   }
   
   /**
    * set the collection.
    * @param questions 
    pre:
       exists(int i; questions.size() > 0);
    */
   public void setQuestions(Collection<Question> questions) {
      this.questions = questions;
   }
   
   /**
    * get the title of the test
    */
   public String getTitle() {
      return this.title;
   }
   
   /**
    * set the title of the test
    * @param title
    pre:
       exists(String title; title.length() > 0);
    */
   public void setTitle(String title) {
      this.title = title;
   }
   
   /**
    * get the test introduction
    */
   public String getIntroduction() {
      return this.introduction;
   }
   
   /**
    * set the test introduction
    * @param introduction
    pre:
       exists(String introduction; introduction.length() > 0);
    */
   public void setIntroduction(String introduction) {
      this.introduction = introduction;
   }
   
   /**
    * get the course the test belongs to
    */
   public Course getCourse() {
      return this.course;
   }
   
   /**
    * set the course the test belongs to
    * @param course
    pre:
       exists(Course course; course != null);
    */
   public void setCourse(Course course) {
      this.course = course;
   }
   
   /**
    * get the user that created the test
    */
   public User getCreatedBy() {
      return this.createdBy;
   }
   
   /**
    * set the user that created the test
    * @param createdBy
    pre:
       exists(User createdBy; createdBy != null);
    */
   public void setCreatedBy(User createdBy) {
      this.createdBy = createdBy;
   }
   
   /**
    * get the date the test was created on
    */
   public Date getCreatedOn() {
      return this.createdOn;
   }
   
   /**
    * set the date the test was created on
    * @param createdOn
    pre:
       exists(Date createdOn; createdOn != null);
    */
   public void setCreatedOn(Date createdOn) {
      this.createdOn = createdOn;
   }
   
   public int getNumQuestions() {
      return questions.size();
   }
   
   public int getTimeToComplete() {
      int time = 0;
      
      for(Question q : questions)
         time = q.timeToComplete;
      
      return time;
   }
   
   /**
    * get a string representation of the test
    */
   @Override
   public String toString() {
      return "Test.toString --> id: " + this.id + ", title: " + this.title + ", course: " + this.course + ", createdBy: " + this.createdBy + ", createdOn: " + this.createdOn;
   }
   
   /**
    * put the test information into an array
    */
   public Object[] toArray() {
      return new Object[] {this.title, this.course, this.questions.size(), this.introduction, this.createdBy, this.createdOn};
   }
}
