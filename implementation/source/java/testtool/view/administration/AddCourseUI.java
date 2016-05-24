package testtool.view.administration;

import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import testtool.model.administration.Course;
import testtool.database.CourseDB;
import testtool.model.administration.Administration;
import testtool.view.TestToolDialog;

/**
 * The view class for the add course dialog.
 * 
 * @author Robert Mitsuda
 */
public class AddCourseUI extends TestToolDialog {

    /**
     * 
     */
    private Administration model;
    
    /**
     * Creates new form CourseUI
     */
    public AddCourseUI(Administration model) {
	super("Add Course");
        this.model = model;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createButton = new javax.swing.JButton();
        titleInput = new javax.swing.JTextField();
        deptInput = new javax.swing.JTextField();
        numberInput = new javax.swing.JTextField();
        LabelHeader = new javax.swing.JLabel();
        LabelTitle = new javax.swing.JLabel();
        LabelDept = new javax.swing.JLabel();
        LabelNumber = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        createButton.setText("OK");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        LabelHeader.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelHeader.setText("Add Course");

        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setText("Course Title:");

        LabelDept.setForeground(new java.awt.Color(255, 255, 255));
        LabelDept.setText("Department:");

        LabelNumber.setForeground(new java.awt.Color(255, 255, 255));
        LabelNumber.setText("Course Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(titleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelNumber)
                                    .addComponent(LabelDept))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deptInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numberInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelHeader)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createButton)
                        .addGap(173, 173, 173))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTitle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDept))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNumber))
                .addGap(28, 28, 28)
                .addComponent(createButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * will add the course to the courseDB if the information entered
     * is applicable to a valid course.
     * @param evt 
     */
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // Need to refactor this to make both a courseOffering and a course?
        String title  = titleInput.getText();
        String dept   = deptInput.getText();
        String number = numberInput.getText();
        
        if (inputsAreValid(title, dept, number)) {
            model.addCourse(title, dept, Integer.parseInt(number));
            cleanup();
        } else {
            JOptionPane.showMessageDialog(null,
              "Missing information: please fill out all fields",
              "Warning",
              JOptionPane.WARNING_MESSAGE);      
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private boolean inputsAreValid(String title, String dept, String num) {
        boolean result = true;
        if (title.isEmpty()) {
            System.out.println("Course must have a title.");
            result = false;
        }
        if (dept.isEmpty()) {
            System.out.println("Course must have a department (i.e. CPE).");
            result = false;
        }
        try {
            Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            System.out.println("Course must have a number (i.e. 101).");
            result = false;            
        }
        return result;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDept;
    private javax.swing.JLabel LabelHeader;
    private javax.swing.JLabel LabelNumber;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField deptInput;
    private javax.swing.JTextField numberInput;
    private javax.swing.JTextField titleInput;
    // End of variables declaration//GEN-END:variables
}
