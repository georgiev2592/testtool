package testtool.view;

import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import testtool.model.administration.Login;

/**
 *
 * @author PetarGeorgiev
 */
public class ForgotPasswordUI extends TestToolDialog {

   /**
    * Creates new form ForgotPasswordUI
    */
   public ForgotPasswordUI() {
      super("TestTool / Forgot Password");
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT
    * modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      EmailAddress = new javax.swing.JTextField();
      SubmitButton = new javax.swing.JButton();

      jLabel1.setText("Email Address");

      EmailAddress.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            EmailAddressActionPerformed(evt);
         }
      });

      SubmitButton.setText("Submit");
      SubmitButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            SubmitButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(83, 83, 83)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(SubmitButton)
               .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(94, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(59, 59, 59)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel1))
            .addGap(18, 18, 18)
            .addComponent(SubmitButton)
            .addContainerGap(62, Short.MAX_VALUE))
      );
   }// </editor-fold>//GEN-END:initComponents

   private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
      Window window = SwingUtilities.getWindowAncestor(this);
      JDialog dialog = (JDialog) window;
        
      boolean correct = true;
      
      if (EmailAddress.getText().isEmpty()) {
         System.out.println("Email field is empty");
          correct = false;
      } else if (!EmailAddress.getText().matches("^([a-zA-Z0-9_.+-])+\\@(([a-zA-Z0-9-])+\\.)+([a-zA-Z0-9]{2,4})+$")) {
         System.out.println("Email field not valid");
         correct = false;
      }
      
      if (correct) {
         Login.forgotPassword(EmailAddress.getText());
         
         JOptionPane.showMessageDialog(null,
            "If your email address exist in our database, you will receive a password recovery instructions at your email address in a few minutes.",
            "Attention",
            JOptionPane.PLAIN_MESSAGE);
         
         dialog.dispose();
      } 
      else {
         JOptionPane.showMessageDialog(null,
            "The email address that you have entered in invalid.",
            "Problem",
            JOptionPane.WARNING_MESSAGE);
      }
   }//GEN-LAST:event_SubmitButtonActionPerformed

   private void EmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_EmailAddressActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextField EmailAddress;
   private javax.swing.JButton SubmitButton;
   private javax.swing.JLabel jLabel1;
   // End of variables declaration//GEN-END:variables
}
