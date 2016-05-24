/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtool.view.grademanager;

import testtool.model.grademanager.ActiveGradeTest;
import testtool.model.grademanager.AnswerSubmission;
import testtool.view.TestToolDialog;
import testtool.view.testtaking.QuestionViewUI;
import testtool.model.testmanager.PublishedQuestion;
/**
 *
 * @author Eliane
 */
public class GradeAnswerSubmissionUI extends TestToolDialog {

    /**
     * Creates new form GradeAnswerSubmissionUI
     */
    QuestionViewUI ui;
    ActiveGradeTest active;
    public GradeAnswerSubmissionUI(PublishedQuestion question, ActiveGradeTest active) {
        super("Grade Answer Submission");
        initComponents();
        this.active = active;
        ui = QuestionViewUI.buildFromPublishedQuestion(question);
        ui.showSubmittedAnswer(active.activeAnswer);
        ui.setAnswerEditable(false);
        ui.showCorrectAnswer();
        ScoreField.setText(Integer.toString(active.activeAnswer.gradeScore));
        CommentField.setText(active.activeAnswer.gradeComment);
        QuestionPanel.setViewportView(ui);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScoreField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        QuestionPanel = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommentField = new javax.swing.JTextArea();
        NextQuestion = new javax.swing.JButton();
        NextStudentButton = new javax.swing.JButton();
        PrevQuestionButton = new javax.swing.JButton();
        PrevStudentButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();

        ScoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Score");

        jLabel2.setText("Comment");

        CommentField.setColumns(20);
        CommentField.setRows(5);
        jScrollPane2.setViewportView(CommentField);

        NextQuestion.setText("Grade Next Quesiton");
        NextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextQuestionActionPerformed(evt);
            }
        });

        NextStudentButton.setText("Grade Next Student");
        NextStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextStudentButtonActionPerformed(evt);
            }
        });

        PrevQuestionButton.setText("Grade Prev Quesiton");
        PrevQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevQuestionButtonActionPerformed(evt);
            }
        });

        PrevStudentButton.setText("Grade Prev Student");
        PrevStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevStudentButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(QuestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ScoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UpdateButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PrevStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PrevQuestionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NextQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NextStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ScoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NextQuestion)
                            .addComponent(PrevQuestionButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NextStudentButton)
                            .addComponent(PrevStudentButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(ClearButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ScoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScoreFieldActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        active.activeAnswer.gradeScore = Integer.parseInt(ScoreField.getText());
        active.activeAnswer.gradeComment = CommentField.getText();
        active.UpdateGrade();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        ui.setAnswerEditable(false);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void NextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextQuestionActionPerformed
        // TODO add your handling code here:
        AnswerSubmission a = ui.getSubmittedAnswer();
        System.out.println(a);
    }//GEN-LAST:event_NextQuestionActionPerformed

    private void PrevQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevQuestionButtonActionPerformed
        // TODO add your handling code here:
        ui.showCorrectAnswer();
    }//GEN-LAST:event_PrevQuestionButtonActionPerformed

    private void PrevStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevStudentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrevStudentButtonActionPerformed

    private void NextStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextStudentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextStudentButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextArea CommentField;
    private javax.swing.JButton NextQuestion;
    private javax.swing.JButton NextStudentButton;
    private javax.swing.JButton PrevQuestionButton;
    private javax.swing.JButton PrevStudentButton;
    private javax.swing.JScrollPane QuestionPanel;
    private javax.swing.JTextField ScoreField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
