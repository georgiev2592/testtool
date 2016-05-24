package testtool.view;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import testtool.TestTool;
import testtool.model.administration.UserPermission;
import testtool.view.administration.AddCourseOfferingUI;
import testtool.view.administration.AddCourseUI;
import testtool.view.administration.AddUserUI;
import testtool.view.administration.ManageCourseOfferingUI;
import testtool.view.grademanager.GradeTestUI;
import testtool.view.questionmanager.AddQuestionUI;
import testtool.view.questionmanager.ManageQuestionsUI;
import testtool.view.testmanager.CreateTestUI;
import testtool.view.administration.ManageCoursesUI;
import testtool.view.administration.ManageUsersUI;
import testtool.view.testmanager.ManageTestsUI;



/**
 * The UI for the Administrator menu (Home Screen).
 * 
 * @author Robert Mitsuda
 */
public class AdministratorUI extends TestToolScreen {
   
    /**
     * Reference to model methods
     */
    private TestTool testtool;
    
    /**
     * Creates new form TeacherUI
     */
    public AdministratorUI(TestTool testtool) {
        super("Test Tool / Home");
        
        initComponents();
        
        this.testtool = testtool;
        
        UserPermission p = testtool.database.activeUser.type;

        System.out.println("Teacher - " + p.isTeacher());
        System.out.println("Student - " + p.isStudent());
        System.out.println("Grader - " + p.isGrader());
        System.out.println("Admin - " + p.isSysAdmin());
        
        ButtonAdministration.setEnabled(p.isSysAdmin());
        ButtonQuestionManager.setEnabled(p.isTeacher());
        ButtonTestManager.setEnabled(p.isTeacher());
        ButtonGradeManager.setEnabled(p.isTeacher() || p.isStudent() || p.isGrader());
        ButtonTestTaking.setEnabled(p.isStudent());   
    }
   
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupQuestionManager = new javax.swing.JPopupMenu();
        PopupTestManager = new javax.swing.JPopupMenu();
        PopupTestTaking = new javax.swing.JPopupMenu();
        PopupAdministration = new javax.swing.JPopupMenu();
        PopupGradeManager = new javax.swing.JPopupMenu();
        ButtonQuestionManager = new javax.swing.JButton();
        ButtonTestManager = new javax.swing.JButton();
        ButtonTestTaking = new javax.swing.JButton();
        ButtonGradeManager = new javax.swing.JButton();
        ButtonAdministration = new javax.swing.JButton();

        ButtonQuestionManager.setText("Question Manager");
        ButtonQuestionManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQuestionManagerActionPerformed(evt);
            }
        });

        ButtonTestManager.setText("Test Manager");
        ButtonTestManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTestManagerActionPerformed(evt);
            }
        });

        ButtonTestTaking.setText("Test Taking");
        ButtonTestTaking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTestTakingActionPerformed(evt);
            }
        });

        ButtonGradeManager.setText("Grade Manager");
        ButtonGradeManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGradeManagerActionPerformed(evt);
            }
        });

        ButtonAdministration.setText("Administration");
        ButtonAdministration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdministrationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonQuestionManager, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTestManager, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonGradeManager, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAdministration, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonTestTaking, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonGradeManager, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonQuestionManager, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonAdministration, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonTestManager, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTestTaking, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * provides menu options for the administrative options
     * @param evt
     */
    private void ButtonAdministrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdministrationActionPerformed
        
        // Action Listener for AddUser Option of the Dropdown Menu for Administration
        ActionListener actionListenerAddUser = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedAddUser();
            }
        };
        
        // Action Listener for ManageUser Option of the Dropdown Menu for Administration
        ActionListener actionListenerManageUsers = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedManageUsers();
            }
        };

        // Action Listener for AddCourses Option of the Dropdown Menu for Administration
        ActionListener actionListenerAddCourse = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedAddCourses();
            }
        };

        // Action Listener for ManageCourses Option of the Dropdown Menu for Administration
        ActionListener actionListenerManageCourses = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedManageCourses();
            }
        };
       
        ActionListener actionListenerAddCourseOffering = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedAddCourseOffering();
            }
        };
        
        ActionListener actionListenerManageCourseOfferings = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedManageCourseOfferings();
            }
        };
        
        // Initialize the dropdown if it hasn't been initialized before
        if (!buttonAdministrationPressed) {
            JMenuItem pasteMenuItem = new JMenuItem("Add User");
            pasteMenuItem.addActionListener(actionListenerAddUser);
            PopupAdministration.add(pasteMenuItem);

            JMenuItem pasteMenuItem2 = new JMenuItem("Manage Users");
            pasteMenuItem2.addActionListener(actionListenerManageUsers);
            PopupAdministration.add(pasteMenuItem2);

            JMenuItem pasteMenuItem3 = new JMenuItem("Add Course");
            pasteMenuItem3.addActionListener(actionListenerAddCourse);
            PopupAdministration.add(pasteMenuItem3);

            JMenuItem pasteMenuItem4 = new JMenuItem("Manage Courses");
            pasteMenuItem4.addActionListener(actionListenerManageCourses);
            PopupAdministration.add(pasteMenuItem4);
            
            JMenuItem pasteMenuItem5 = new JMenuItem("Add Course Offering");
            pasteMenuItem5.addActionListener(actionListenerAddCourseOffering);
            PopupAdministration.add(pasteMenuItem5);
            
            JMenuItem pasteMenuItem6 = new JMenuItem("Manage Course Offerings");
            pasteMenuItem6.addActionListener(actionListenerManageCourseOfferings);
            PopupAdministration.add(pasteMenuItem6);

            buttonAdministrationPressed = true;
        }

        PopupAdministration.show(ButtonAdministration, ButtonAdministration.getWidth() / 2, ButtonAdministration.getHeight() / 2);

    }//GEN-LAST:event_ButtonAdministrationActionPerformed

    /**
     * creates the popup menu when the grade manager button is pressed
     * from the menu screen.
     * @param evt
     */
    private void ButtonGradeManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGradeManagerActionPerformed
        // TODO add your handling code here:
         final TestToolScreen self = this;
        // Action Listener for CreateTest Option of the Dropdown Menu for TestManager
        ActionListener actionListenerGradeTest = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                GradeTestUI ui = new GradeTestUI();
                ui.pressedGradeTest(self, testtool);
            }
        };


        // Initialize the dropdown if it hasn't been initialized before
        if (!buttonGradeManagerPressed) {
            JMenuItem pasteMenuItem = new JMenuItem("Grade Test");
            pasteMenuItem.addActionListener(actionListenerGradeTest);
            //pasteMenuItem.setEnabled(true);
            PopupGradeManager.add(pasteMenuItem);

            buttonGradeManagerPressed = true;
        }

        PopupGradeManager.show(ButtonGradeManager, ButtonGradeManager.getWidth() / 2, ButtonGradeManager.getHeight() / 2);

    }//GEN-LAST:event_ButtonGradeManagerActionPerformed

    private void ButtonTestTakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTestTakingActionPerformed
        

        PopupTestTaking.show(ButtonTestTaking, ButtonTestTaking.getWidth() / 2, ButtonTestTaking.getHeight() / 2);
    }//GEN-LAST:event_ButtonTestTakingActionPerformed

    /**
     * when the test manager button is pressed, create the popup menu.
     * @param evt
     */
    private void ButtonTestManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTestManagerActionPerformed

        // Action Listener for CreateTest Option of the Dropdown Menu for TestManager
        ActionListener actionListenerCreate = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedCreateTest();
            }
        };

        // Action Listener for EditTest Option of the Dropdown Menu for TestManager
        ActionListener actionListenerManage = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedManageTest();
            }
        };

        // Initialize the dropdown if it hasn't been initialized before
        if (!buttonTestManagerPressed) {
            JMenuItem pasteMenuItem = new JMenuItem("Create Test");
            pasteMenuItem.addActionListener(actionListenerCreate);
            //pasteMenuItem.setEnabled(true);
            PopupTestManager.add(pasteMenuItem);

            JMenuItem pasteMenuItem2 = new JMenuItem("Manage Test");
            pasteMenuItem2.addActionListener(actionListenerManage);
            //pasteMenuItem.setEnabled(true);
            PopupTestManager.add(pasteMenuItem2);

            buttonTestManagerPressed = true;
        }

        PopupTestManager.show(ButtonTestManager, ButtonTestManager.getWidth() / 2, ButtonTestManager.getHeight() / 2);
    }//GEN-LAST:event_ButtonTestManagerActionPerformed

    /**
     * When the Question manager button is pressed from the main menu, make
     * the popup menu.
     * @param evt
     */
    private void ButtonQuestionManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQuestionManagerActionPerformed
        
        // Action Listener for QM Option of the Dropdown Menu for QestionManager
        ActionListener actionListenerQM = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedQM();
            }
        };

        // Action Listener for AQ Option of the Dropdown Menu for QestionManager
        ActionListener actionListenerAdd = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pressedAQ();
            }
        };

        // Initialize the dropdown if it hasn't been initialized before
        if (!buttonQuestionManagerPressed) {
            JMenuItem pasteMenuItem2 = new JMenuItem("Create a Question");
            pasteMenuItem2.addActionListener(actionListenerAdd);
            PopupQuestionManager.add(pasteMenuItem2);

            JMenuItem pasteMenuItem3 = new JMenuItem("Manage Questions");
            pasteMenuItem3.addActionListener(actionListenerQM);
            PopupQuestionManager.add(pasteMenuItem3);

            buttonQuestionManagerPressed = true;
        }

        PopupQuestionManager.show(ButtonQuestionManager, ButtonQuestionManager.getWidth() / 2, ButtonQuestionManager.getHeight() / 2);
    }//GEN-LAST:event_ButtonQuestionManagerActionPerformed
   
    /**
     * display the question manager screen if button is pressed
     */
   private void pressedQM() {
      displayNewScreen(new ManageQuestionsUI(testtool.questionmanager));
   }
   
   /**
    * display the add question screen when the button is pressed
    */
   private void pressedAQ() {
      displayNewDialog(new AddQuestionUI(testtool.questionmanager));
   }
   
   /**
    * create the new dialog when the create test is pressed
    *
    */   
   private void pressedCreateTest() {
      displayNewDialog(new CreateTestUI(testtool.testmanager));
   }
   
   /**
    * create the manage test dialog when the manage test button is pressed
    */
   private void pressedManageTest() {
      displayNewScreen(new ManageTestsUI(testtool));
   }
               
   /**
    * when add user is pressed, make a popup menu to add the user
    */
   private void pressedAddUser() {       
       Window window = SwingUtilities.getWindowAncestor(this);
       JFrame frame = (JFrame) window;
       
       JDialog test = new JDialog(frame, Dialog.ModalityType.DOCUMENT_MODAL);
       test.getContentPane().setLayout(new FlowLayout());
       test.setTitle("Add User");
       
       AddUserUI panel = new AddUserUI(testtool.administration);
       test.getContentPane().add(panel, BorderLayout.EAST);
       
       test.setResizable(false);
       
       test.pack();
       test.setVisible(true);
   }
   
   private void pressedManageUsers() {
       Window window = SwingUtilities.getWindowAncestor(this);
       JFrame frame = (JFrame) window;
       
       JDialog test = new JDialog(frame, Dialog.ModalityType.DOCUMENT_MODAL);
       test.getContentPane().setLayout(new FlowLayout());
       test.setTitle("Manage User");
       
       ManageUsersUI panel = new ManageUsersUI(testtool.administration);
       test.getContentPane().add(panel, BorderLayout.EAST);
       
       test.setResizable(false);
       
       test.pack();
       test.setVisible(true);
   }
   
   /**
    * When add courses is pressed from the administration menu, make a new
    * dialog that allows user to add a new course
    */
   private void pressedAddCourses() {
       Window window = SwingUtilities.getWindowAncestor(this);
       JFrame frame = (JFrame) window;
       
       JDialog test = new JDialog(frame, Dialog.ModalityType.DOCUMENT_MODAL);
       test.getContentPane().setLayout(new FlowLayout());
       test.setTitle("Add Course");
       
       AddCourseUI panel = new AddCourseUI(testtool.administration);
       test.getContentPane().add(panel, BorderLayout.EAST);
       
       test.setResizable(false);
       
       test.pack();
       test.setVisible(true);
   }
   
   private void pressedManageCourses() {
       displayNewScreen(new ManageCoursesUI(testtool.administration));
   }
   
   private void pressedManageCourseOfferings() {
       displayNewScreen(new ManageCourseOfferingUI(testtool.administration));
       
   }
   
    private void pressedAddCourseOffering() {
        Window window = SwingUtilities.getWindowAncestor(this);
        JFrame frame = (JFrame) window;

        JDialog test = new JDialog(frame, Dialog.ModalityType.DOCUMENT_MODAL);
        test.getContentPane().setLayout(new FlowLayout());
        test.setTitle("Add Course Offering");

        AddCourseOfferingUI panel = new AddCourseOfferingUI(testtool.administration);
        test.getContentPane().add(panel, BorderLayout.EAST);

        test.setResizable(false);

        test.pack();
        test.setVisible(true);
    }
   
   
   /**
    * boolean that keeps track if button is pressed
    */
   private boolean buttonQuestionManagerPressed = false;

   /**
    * boolean that keeps track if button is pressed
    */
   private boolean button2Init = false;

   /**
    * boolean that keeps track if button is pressed
    */
   private boolean button3Init = false;

   /**
    * boolean that keeps track if button is pressed
    */
   private boolean buttonTestManagerPressed = false;

   /**
    * boolean that keeps track if button is pressed
    */
   private boolean buttonAdministrationPressed = false;

   /**
    * boolean that keeps track if button is pressed
    */
   private boolean buttonGradeManagerPressed = false;

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdministration;
    private javax.swing.JButton ButtonGradeManager;
    private javax.swing.JButton ButtonQuestionManager;
    private javax.swing.JButton ButtonTestManager;
    private javax.swing.JButton ButtonTestTaking;
    private javax.swing.JPopupMenu PopupAdministration;
    private javax.swing.JPopupMenu PopupGradeManager;
    private javax.swing.JPopupMenu PopupQuestionManager;
    private javax.swing.JPopupMenu PopupTestManager;
    private javax.swing.JPopupMenu PopupTestTaking;
    // End of variables declaration//GEN-END:variables
}
