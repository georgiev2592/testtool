/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtool.model.administration;

/**
 *
 * @author ian
 */
public class UserPermission {
    private final boolean isTeacher;
    private final boolean isStudent;
    private final boolean isGrader;
    private final boolean isSysAdmin;
    
    public UserPermission(boolean isTeacher,
                          boolean isStudent,
                          boolean isGrader,
                          boolean isSysAdmin) {
        this.isTeacher  = isTeacher;
        this.isStudent  = isStudent;
        this.isGrader   = isGrader;
        this.isSysAdmin = isSysAdmin;
    }
    
    public boolean isTeacher() {
        return isTeacher;
    }
    
    public boolean isStudent() {
        return isStudent;
    }
    
    public boolean isGrader() {
        return isGrader;
    }
    
    public boolean isSysAdmin() {
        return isSysAdmin;
    }
    
    public static String[] getTypeStrings() {
        return new String[] {"Teacher", "Student", "Grader", "SysAdmin"};
    }
    
}
