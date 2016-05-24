package testtool.view.administration;

import testtool.model.administration.Administration;

import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import testtool.model.administration.UserPermission;

/**
 * Class AddUserUI provides the administrator with a interface to add a User to the test tool.
 *
 * @author Ian Smith-Grove (ismithgr@calpoly.edu)
 */
public class AddUserUI extends javax.swing.JPanel {

    private final Administration admin;

    /**
     * This method creates new form AddUserUI_new
     * @param ad is the model class used to add a user to the testtool.
     */
    public AddUserUI(Administration ad) {
        initComponents();
        admin = ad;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelPermissions = new javax.swing.JLabel();
        TeacherCheckBox = new javax.swing.JCheckBox();
        LabelEmail = new javax.swing.JLabel();
        StudentCheckBox = new javax.swing.JCheckBox();
        LastNameField = new javax.swing.JTextField();
        LabelNameFirst = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        LabelUsername = new javax.swing.JLabel();
        PasswordField = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LabelName = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        LabelNameLast = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        GraderCheckBox = new javax.swing.JCheckBox();
        AdminstratorCheckBox = new javax.swing.JCheckBox();

        LabelPermissions.setText("Permissions");

        TeacherCheckBox.setText("Teacher");

        LabelEmail.setText("Email");

        StudentCheckBox.setText("Student");

        LabelNameFirst.setText("First");

        LabelUsername.setText("Username");

        LabelPassword.setText("Password");

        LabelName.setText("Name");

        LabelNameLast.setText("Last");

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        GraderCheckBox.setText("Grader");

        AdminstratorCheckBox.setText("Adminstrator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(OKButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelUsername))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StudentCheckBox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(TeacherCheckBox))
                                .addComponent(LabelPermissions)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelName)
                                    .addComponent(LabelEmail))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameField)
                                    .addComponent(LastNameField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelNameFirst)
                                        .addGap(13, 13, 13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(LabelNameLast)
                                        .addContainerGap())))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdminstratorCheckBox)
                                    .addComponent(GraderCheckBox))
                                .addGap(60, 60, 60)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                .addComponent(UsernameField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNameFirst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNameLast))
                .addGap(12, 12, 12)
                .addComponent(LabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelPermissions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeacherCheckBox)
                    .addComponent(GraderCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminstratorCheckBox)
                    .addComponent(StudentCheckBox))
                .addGap(18, 18, 18)
                .addComponent(OKButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Check to see if the fields are filled out properly, if not then an 
     * error message will appear, but if correct call addUser method of admin
     * @param evt
     */
    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        boolean correct = true;
        if (EmailField.getText().isEmpty()) {
          System.out.println("Email field is empty");
          correct = false;
        } else if (!EmailField.getText().matches("^([a-zA-Z0-9_.+-])+\\@(([a-zA-Z0-9-])+\\.)+([a-zA-Z0-9]{2,4})+$")) {
          System.out.println("Email field not valid");
          correct = false;
        }
        if (PasswordField.getText().isEmpty()) {
          System.out.println("Password field is empty");
          correct = false;
        }
        if (FirstNameField.getText().isEmpty()) {
          System.out.println("First name field is empty");
          correct = false;
        }
        if (LastNameField.getText().isEmpty()) {
          System.out.println("Last name field is empty");
          correct = false;
        }
        if (UsernameField.getText().isEmpty()) {
          System.out.println("Username field is empty");
          correct = false;
        }
        if (!AdminstratorCheckBox.isSelected() && !GraderCheckBox.isSelected() && !StudentCheckBox.isSelected() && !TeacherCheckBox.isSelected()) {
          System.out.println("No box was checked");
          correct = false;
        }
        if (correct) {
          admin.addUser(UsernameField.getText(), PasswordField.getText(), EmailField.getText(), 
             FirstNameField.getText(), LastNameField.getText(), 
             new UserPermission(StudentCheckBox.isSelected(), TeacherCheckBox.isSelected(), 
             GraderCheckBox.isSelected(), AdminstratorCheckBox.isSelected()));// TODO add your handling code here:
          close();
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    /**
     * Method that closes the current jdialog
     */
    private void close() {
      Window window = SwingUtilities.getWindowAncestor(this);
      JDialog dialog = (JDialog) window;
      dialog.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AdminstratorCheckBox;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JCheckBox GraderCheckBox;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelNameFirst;
    private javax.swing.JLabel LabelNameLast;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelPermissions;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JButton OKButton;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JCheckBox StudentCheckBox;
    private javax.swing.JCheckBox TeacherCheckBox;
    private javax.swing.JTextField UsernameField;
    // End of variables declaration//GEN-END:variables
}
