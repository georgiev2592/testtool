/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtool.view.testmanager;

import testtool.model.testmanager.TestManager;
import testtool.model.testmanager.Test;
import testtool.view.TestToolDialog;

/**
 * The view class for the create test screen.
 * 
 * @author Peter Georgiev
 */
public class CreateTestUI extends TestToolDialog {

   TestManager model;
   
   /**
    * Creates new form TestManagerUI
    * 
    * @param testmanager TestManagaer object.
    */
   public CreateTestUI(TestManager testmanager) {
      super("TestTool / Create Test");
      initComponents();
      model = testmanager;
   }

   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT
    * modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      LabelTestName = new javax.swing.JLabel();
      LabelIntroduction = new javax.swing.JLabel();
      TextFieldTestName = new javax.swing.JTextField();
      ButtonCreate = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      TextFieldIntroduction = new javax.swing.JTextArea();

      setToolTipText("");

      LabelTestName.setText("Test Name");

      LabelIntroduction.setText("Introduction");

      TextFieldTestName.setText("Enter Test Name");
      TextFieldTestName.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            TextFieldTestNameActionPerformed(evt);
         }
      });

      ButtonCreate.setText("Create");
      ButtonCreate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ButtonCreateActionPerformed(evt);
         }
      });

      TextFieldIntroduction.setColumns(20);
      TextFieldIntroduction.setRows(5);
      TextFieldIntroduction.setText("Enter Introduction");
      jScrollPane1.setViewportView(TextFieldIntroduction);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(43, 43, 43)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(LabelIntroduction)
               .addComponent(LabelTestName))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(ButtonCreate)
                  .addGap(0, 0, Short.MAX_VALUE))
               .addComponent(jScrollPane1)
               .addComponent(TextFieldTestName, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGap(36, 36, 36))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(LabelTestName)
               .addComponent(TextFieldTestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(LabelIntroduction)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(ButtonCreate)
            .addContainerGap(25, Short.MAX_VALUE))
      );
   }// </editor-fold>//GEN-END:initComponents

   /**
    * Create button is clicked. 
    * 
    * @param evt Action Event is passed to the method.
    */
   private void ButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateActionPerformed
      model.createTest(TextFieldTestName.getText(), TextFieldIntroduction.getText());
   }//GEN-LAST:event_ButtonCreateActionPerformed

   /**
    * Test name is changed. 
    * 
    * @param evt Action Event is passed to the method.
    */
   private void TextFieldTestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTestNameActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_TextFieldTestNameActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton ButtonCreate;
   private javax.swing.JLabel LabelIntroduction;
   private javax.swing.JLabel LabelTestName;
   private javax.swing.JTextArea TextFieldIntroduction;
   private javax.swing.JTextField TextFieldTestName;
   private javax.swing.JScrollPane jScrollPane1;
   // End of variables declaration//GEN-END:variables
}
