package testtool.model.administration;

import static java.lang.Double.NaN;

/**
 * It encapsulates the data representing an entry in the Course table of the database.
 * 
 * @author Robert Mitsuda
 */
public class Course {
    
    /**
     * represents the id of the course
     */
    public int id;
    
    /**
     * represents the name of the course
     */
    public String title;

    /**
     * represents the department the course belongs to
     */
    public String department;

    /**
     * represents the course number of the course offering
    */
    public int number;
    
    /**
     * course constructor that initializes all the fields of the course
     * @param id
     * @param title
     * @param department
     * @param number 
     */
    public Course(int id, String title, String department, int number) {
        this.id = id;
        this.title = title;
        this.department = department;
        this.number = number;
    }
    
    public Course(String a) {
       this.title = a;
       this.department = "";
       this.number = 0;
    }
    
    @Override
    public String toString() {
       return this.department + " " + this.number;
    }
    
    @Override
    public boolean equals(Object o) {
        Course other = (Course) o;
        return o != null && this.id == other.id;
    }
    
    public Object[] toArray() {
      return new Object[] {this.title, this.department, this.number};
    }
}
