/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtool.view.grademanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import javax.swing.table.DefaultTableModel;
import testtool.model.administration.CourseOffering;
import testtool.model.testmanager.PublishedTest;
import testtool.view.TestToolDialog;

/**
 *
 * @author Eliane
 */
public class SelectPublishedTestUI extends TestToolDialog {

    public Collection<PublishedTest> tests;
    public PublishedTest selectedTest;
    public ActionListener onSelect;
    public ActionListener onSwitchCourse;
    /**
     * Creates new form SelectTestUI
     */
    public SelectPublishedTestUI(Collection<PublishedTest> tests,
            ActionListener onSelect, ActionListener onSwitchCourse) {
        super("Select Test");
        initComponents();
        this.tests = tests;
        this.selectedTest = null;
        CancelButton.setEnabled(true);
        SwitchCourseButton.setEnabled(true);
        OkButton.setEnabled(false);
        this.onSelect = onSelect; // Can be null
        this.onSwitchCourse = onSwitchCourse;
        //ButtonView.setEnabled(false);
        //ButtonEdit.setEnabled(false);
        //ButtonDelete.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) TestTable.getModel();

        for (PublishedTest t : tests) {
            model.addRow(new Object[]{t.title.toString()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TestTable = new javax.swing.JTable();
        CancelButton = new javax.swing.JButton();
        CancelButton.setEnabled(false);
        OkButton = new javax.swing.JButton();
        OkButton.setEnabled(false);
        SwitchCourseButton = new javax.swing.JButton();
        CancelButton.setEnabled(false);

        TestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TestTable.setName("Test"); // NOI18N
        TestTable.setOpaque(false);
        TestTable.setRowHeight(20);
        TestTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TestTable.setSurrendersFocusOnKeystroke(true);
        TestTable.getTableHeader().setReorderingAllowed(false);
        TestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(TestTable);

        CancelButton.setText("Cancel");
        CancelButton.setMaximumSize(new java.awt.Dimension(92, 28));
        CancelButton.setMinimumSize(new java.awt.Dimension(92, 28));
        CancelButton.setPreferredSize(new java.awt.Dimension(92, 28));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        OkButton.setText("Select");
        OkButton.setMaximumSize(new java.awt.Dimension(92, 28));
        OkButton.setMinimumSize(new java.awt.Dimension(92, 28));
        OkButton.setPreferredSize(new java.awt.Dimension(92, 28));
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        SwitchCourseButton.setText("Swtich Course");
        SwitchCourseButton.setMaximumSize(new java.awt.Dimension(92, 28));
        SwitchCourseButton.setMinimumSize(new java.awt.Dimension(92, 28));
        SwitchCourseButton.setPreferredSize(new java.awt.Dimension(92, 28));
        SwitchCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchCourseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SwitchCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SwitchCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestTableMouseClicked
        //System.out.println("HIT!: " + Arrays.toString(QuestionTable.getSelectedRows()));
        OkButton.setEnabled(true);
    }//GEN-LAST:event_TestTableMouseClicked

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        //DisabledJButton test = new DisabledJButton();// TODO add your handling code here:
        //quit somehow

        cleanup();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        // TODO add your handling code here:
        int selected = TestTable.getSelectedRow();
        selectedTest = tests.toArray(new PublishedTest[0])[selected];

        //quit somehow
        cleanup();
        if (onSelect != null) {
            onSelect.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        }
    }//GEN-LAST:event_OkButtonActionPerformed

    private void SwitchCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwitchCourseButtonActionPerformed
        // TODO add your handling code here:
        cleanup();
        if (onSwitchCourse != null) {
            onSwitchCourse.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        }
    }//GEN-LAST:event_SwitchCourseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton OkButton;
    private javax.swing.JButton SwitchCourseButton;
    private javax.swing.JTable TestTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}