
package testtool.view.testmanager;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import testtool.model.questionmanager.QuestionType;
import testtool.model.testmanager.TestManager;

/**
 * Class TestSearchUI provides the user with a way to search the database for tests
 * using a more complex criteria.
 * 
 * @author Peter Georgiev
 */
public class TestSearchUI extends javax.swing.JPanel {

   /**
    * Creates new form TestSearchUI.
    */
   public TestSearchUI() {
      initComponents();
   }
   
   /**
    * Creates new form TestSearchUI.
    * 
    * @param testmanager TestManaget object.
    */
   public TestSearchUI(TestManager testmanager) {
      initComponents();
      
      this.model = testmanager;
   }

   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT
    * modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      ButtonClear = new javax.swing.JButton();
      LabelAuthor = new javax.swing.JLabel();
      ButtonCancel = new javax.swing.JButton();
      LabelTimeToComplete = new javax.swing.JLabel();
      LabelDifficulty = new javax.swing.JLabel();
      KeywordsInput = new javax.swing.JTextField();
      CourseInput = new javax.swing.JTextField();
      AuthorInput = new javax.swing.JTextField();
      TimeToCompleteInput = new javax.swing.JTextField();
      DifficultyComboBox = new javax.swing.JComboBox<String>();
      LabelKeywords = new javax.swing.JLabel();
      ButtonSearch = new javax.swing.JButton();
      LabelCourse = new javax.swing.JLabel();

      ButtonClear.setText("Clear");
      ButtonClear.setMaximumSize(new java.awt.Dimension(88, 28));
      ButtonClear.setMinimumSize(new java.awt.Dimension(88, 28));
      ButtonClear.setPreferredSize(new java.awt.Dimension(88, 28));
      ButtonClear.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ButtonClearActionPerformed(evt);
         }
      });

      LabelAuthor.setText("Author");

      ButtonCancel.setText("Cancel");
      ButtonCancel.setMaximumSize(new java.awt.Dimension(88, 28));
      ButtonCancel.setMinimumSize(new java.awt.Dimension(88, 28));
      ButtonCancel.setPreferredSize(new java.awt.Dimension(88, 28));
      ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ButtonCancelActionPerformed(evt);
         }
      });

      LabelTimeToComplete.setText("Time-to-complete");

      LabelDifficulty.setText("Difficulty");

      TimeToCompleteInput.setMinimumSize(new java.awt.Dimension(10, 27));
      TimeToCompleteInput.setPreferredSize(new java.awt.Dimension(10, 27));

      DifficultyComboBox.setBackground(new java.awt.Color(255, 255, 255));
      DifficultyComboBox.setEditable(true);
      DifficultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      DifficultyComboBox.setSelectedIndex(-1);

      LabelKeywords.setText("Keywords");

      ButtonSearch.setText("Search");
      ButtonSearch.setMaximumSize(new java.awt.Dimension(88, 28));
      ButtonSearch.setMinimumSize(new java.awt.Dimension(88, 28));
      ButtonSearch.setPreferredSize(new java.awt.Dimension(88, 28));
      ButtonSearch.setRequestFocusEnabled(false);
      ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ButtonSearchActionPerformed(evt);
         }
      });

      LabelCourse.setText("Course");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(DifficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TimeToCompleteInput, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                           .addComponent(KeywordsInput)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(LabelKeywords)
                              .addGroup(layout.createSequentialGroup()
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CourseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelCourse)
                                    .addComponent(LabelDifficulty))
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelAuthor)
                                    .addComponent(AuthorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelTimeToComplete)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
               .addGroup(layout.createSequentialGroup()
                  .addGap(43, 43, 43)
                  .addComponent(ButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(LabelKeywords)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(KeywordsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(LabelCourse)
               .addComponent(LabelAuthor))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(CourseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(AuthorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(LabelTimeToComplete)
               .addComponent(LabelDifficulty))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(TimeToCompleteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(DifficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(ButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(24, Short.MAX_VALUE))
      );
   }// </editor-fold>//GEN-END:initComponents

   private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
      System.out.println("In TestSearchUI.Clear");
      AuthorInput.setText("");
      CourseInput.setText("");
      KeywordsInput.setText("");
      TimeToCompleteInput.setText("");
      DifficultyComboBox.setSelectedIndex(-1);
   }//GEN-LAST:event_ButtonClearActionPerformed

   private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
      System.out.println("In TestSearchUI.Cancel");
      close();
   }//GEN-LAST:event_ButtonCancelActionPerformed
   /**
    * Searches the database for a specific test.
    * 
    * @param evt Action Event is passed to the method.
    */
   private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
      model.search(AuthorInput.getText(), CourseInput.getText(), 
         new ArrayList<>(Arrays.asList(KeywordsInput.getText().split("[\\s,]+"))), 
         TimeToCompleteInput.getText(),  
         DifficultyComboBox.getSelectedIndex());
      
      close();
   }//GEN-LAST:event_ButtonSearchActionPerformed

   /**
    * Closes the current screen.
    */
   private void close() {
      Window window = SwingUtilities.getWindowAncestor(this);
      JDialog dialog = (JDialog) window;
      dialog.dispose();
   }

   private TestManager model;
   
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextField AuthorInput;
   private javax.swing.JButton ButtonCancel;
   private javax.swing.JButton ButtonClear;
   private javax.swing.JButton ButtonSearch;
   private javax.swing.JTextField CourseInput;
   private javax.swing.JComboBox<String> DifficultyComboBox;
   private javax.swing.JTextField KeywordsInput;
   private javax.swing.JLabel LabelAuthor;
   private javax.swing.JLabel LabelCourse;
   private javax.swing.JLabel LabelDifficulty;
   private javax.swing.JLabel LabelKeywords;
   private javax.swing.JLabel LabelTimeToComplete;
   private javax.swing.JTextField TimeToCompleteInput;
   // End of variables declaration//GEN-END:variables
}
