package testtool.view.grademanager;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import testtool.TestTool;
import testtool.model.administration.Course;
import testtool.view.misc.SelectCourseUI;
import testtool.view.TestToolScreen;
import testtool.model.testmanager.PublishedQuestion;

/****
 *
 * GradeTestUI holds the UI for the Grade Test flow.
 * Call pressedGradeTest with the original JPanel as well as the testtool in order to start the process.
 *
 * @author Patrick Riordan (psriorda@calpoly.edu)
 *
 */
public class GradeTestUI {
    SelectCourseUI selectCourse;
    SelectPublishedTestUI selectTest;
    TestTool tool;
    TestToolScreen top;
    /**
     * Call this method with a valid JPanel and TestTool to
     * start the Grade Test flow.
     * 
     * @param top Menu bar
     * @param testtool TestTool object
     */
    public void pressedGradeTest(TestToolScreen top, TestTool testtool) {
       tool = testtool;
       this.top = top;
       Window window = SwingUtilities.getWindowAncestor(top);
       JFrame frame = (JFrame) window;

       JDialog test = new JDialog(frame, Dialog.ModalityType.DOCUMENT_MODAL);
       test.getContentPane().setLayout(new FlowLayout());
       test.setTitle("Grade Test");
       ActionListener onSelect = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OnSelectPressed();
            }
        };


       selectCourse = new SelectCourseUI(testtool.database, null, onSelect);
       test.getContentPane().add(selectCourse, BorderLayout.EAST);

       test.setResizable(false);

       test.pack();
       test.setVisible(true);
    }

    /**
     * method called when grade test is pressed and will call corresponding
     * method in the model class.
     */
    private void OnSelectPressed() {
        System.out.println("CourseOffering was selected");
        tool.grademanager.GetTestList(selectCourse.selectedCourse);
        ActionListener onSelect = new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            OnSelectTestPressed();
          }
        };
        ActionListener onSwitchCourse = new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            pressedGradeTest(top, tool);
          }
        };
        selectTest = new SelectPublishedTestUI(tool.grademanager.testList, onSelect, onSwitchCourse);
        top.displayNewDialog(selectTest);
    }

    private void OnSelectTestPressed() {
      tool.grademanager.GradeTest(selectTest.selectedTest);
      GradeSubmissionsUI gradeSubmissions = new GradeSubmissionsUI(top, tool.grademanager, this);
      top.displayNewDialog(gradeSubmissions);
    }
    public void GradeByStudent() {
      GradeAnswerSubmissionUI answerSubmission = 
              new GradeAnswerSubmissionUI(tool.grademanager.activeTest.activeQuestion,
                tool.grademanager.activeTest);
      top.displayNewDialog(answerSubmission);
    }
}
