package testtool.view.questionmanager;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.text.AbstractDocument;
import testtool.model.administration.Course;
import testtool.model.questionmanager.Answer;
import testtool.model.questionmanager.QuestionDifficulty;
import testtool.model.questionmanager.QuestionManager;
import testtool.model.questionmanager.QuestionType;
import testtool.view.TestToolDialog;
import testtool.view.misc.IntegerDocumentFilter;

/****
 *
 * Class AddQuestionUI lays out the UI for adding a question to the database. Constructing the method
 * brings up the AddQuestionUI which takes in User input and then adds a question to the database.
 *
 *
 * @author Ian Smith-Grove (ismithgr@calpoly.edu)
 *
 */
public class AddQuestionUI extends TestToolDialog {

   /**
    * Model object containing operations linked to the view
    */
   private QuestionManager model;

   /**
    * The constructor method creates new form AddQuestionUI and displays
    * the UI to the user.  questionmanager is a QuestionManager model class that this class uses
    * to interact with the database.
    */
    public AddQuestionUI(QuestionManager questionmanager) {
        super("Test Tool / Create a Question");
        model = questionmanager;
        initComponents();
        initResponses();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypeLabel = new javax.swing.JLabel();
        CourseLabel = new javax.swing.JLabel();
        PromptLabel = new javax.swing.JLabel();
        AnswerLabel = new javax.swing.JLabel();
        KeywordsLabel = new javax.swing.JLabel();
        DifficultyLabel = new javax.swing.JLabel();
        TimeToCompleteLabel = new javax.swing.JLabel();
        TimeToCompleteUnitsLabel = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>(QuestionType.values());
        CourseComboBox = new javax.swing.JComboBox<>(model.buildCourseList());
        PromptScrollPane = new javax.swing.JScrollPane();
        PromptInput = new javax.swing.JTextArea();
        AnswerInput1 = new javax.swing.JTextField();
        AnswerInput2 = new javax.swing.JTextField();
        AnswerInput3 = new javax.swing.JTextField();
        AnswerInput4 = new javax.swing.JTextField();
        AnswerInput5 = new javax.swing.JTextField();
        AnswerCheckBox1 = new javax.swing.JCheckBox();
        AnswerCheckBox2 = new javax.swing.JCheckBox();
        AnswerCheckBox3 = new javax.swing.JCheckBox();
        AnswerCheckBox4 = new javax.swing.JCheckBox();
        AnswerCheckBox5 = new javax.swing.JCheckBox();
        KeywordsInput = new javax.swing.JTextField();
        DifficultyComboBox = new javax.swing.JComboBox<>(QuestionDifficulty.values());
        TimeToCompleteInput = new javax.swing.JTextField();
        ButtonOK = new javax.swing.JButton();
        ButtonPreview = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        ButtonAddResponse = new javax.swing.JButton();
        ButtonDropResponse = new javax.swing.JButton();

        TypeLabel.setText("Type");

        CourseLabel.setText("Course");

        PromptLabel.setText("Prompt");

        AnswerLabel.setText("Responses  ( check box for each correct answer )");

        KeywordsLabel.setText("Keywords");

        DifficultyLabel.setText("Difficulty");

        TimeToCompleteLabel.setText("Time-to-Complete");

        TimeToCompleteUnitsLabel.setText("minutes");

        TypeComboBox.setSelectedIndex(-1);
        TypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboBoxActionPerformed(evt);
            }
        });

        CourseComboBox.setSelectedIndex(-1);

        PromptInput.setColumns(20);
        PromptInput.setLineWrap(true);
        PromptInput.setRows(5);
        PromptScrollPane.setViewportView(PromptInput);

        AnswerInput1.setMinimumSize(new java.awt.Dimension(10, 27));
        AnswerInput1.setPreferredSize(new java.awt.Dimension(10, 27));

        AnswerInput2.setMinimumSize(new java.awt.Dimension(10, 27));
        AnswerInput2.setPreferredSize(new java.awt.Dimension(10, 27));

        AnswerInput3.setMinimumSize(new java.awt.Dimension(10, 27));
        AnswerInput3.setPreferredSize(new java.awt.Dimension(10, 27));

        AnswerInput4.setMinimumSize(new java.awt.Dimension(10, 27));
        AnswerInput4.setPreferredSize(new java.awt.Dimension(10, 27));

        AnswerInput5.setMinimumSize(new java.awt.Dimension(10, 27));
        AnswerInput5.setPreferredSize(new java.awt.Dimension(10, 27));

        KeywordsInput.setMinimumSize(new java.awt.Dimension(10, 27));
        KeywordsInput.setPreferredSize(new java.awt.Dimension(10, 27));

        DifficultyComboBox.setSelectedIndex(-1);

        TimeToCompleteInput.setMinimumSize(new java.awt.Dimension(10, 27));
        TimeToCompleteInput.setPreferredSize(new java.awt.Dimension(10, 27));
        ((AbstractDocument)TimeToCompleteInput.getDocument()).setDocumentFilter(new IntegerDocumentFilter());

        ButtonOK.setText("OK");
        ButtonOK.setMaximumSize(new java.awt.Dimension(88, 28));
        ButtonOK.setMinimumSize(new java.awt.Dimension(88, 28));
        ButtonOK.setPreferredSize(new java.awt.Dimension(88, 28));
        ButtonOK.setRequestFocusEnabled(false);
        ButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKActionPerformed(evt);
            }
        });

        ButtonPreview.setText("Preview");
        ButtonPreview.setMaximumSize(new java.awt.Dimension(92, 28));
        ButtonPreview.setMinimumSize(new java.awt.Dimension(92, 28));
        ButtonPreview.setPreferredSize(new java.awt.Dimension(92, 28));
        ButtonPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPreviewActionPerformed(evt);
            }
        });

        ButtonClear.setText("Clear");
        ButtonClear.setMaximumSize(new java.awt.Dimension(88, 28));
        ButtonClear.setMinimumSize(new java.awt.Dimension(88, 28));
        ButtonClear.setPreferredSize(new java.awt.Dimension(88, 28));
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        ButtonCancel.setText("Cancel");
        ButtonCancel.setMaximumSize(new java.awt.Dimension(88, 28));
        ButtonCancel.setMinimumSize(new java.awt.Dimension(88, 28));
        ButtonCancel.setPreferredSize(new java.awt.Dimension(88, 28));
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        ButtonAddResponse.setText("+");
        ButtonAddResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddResponseActionPerformed(evt);
            }
        });

        ButtonDropResponse.setText("-");
        ButtonDropResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDropResponseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnswerInput1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PromptScrollPane)
                    .addComponent(KeywordsInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnswerInput5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnswerInput2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnswerInput3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnswerInput4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AnswerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonAddResponse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonDropResponse))
                            .addComponent(PromptLabel)
                            .addComponent(KeywordsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DifficultyLabel)
                                    .addComponent(DifficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TimeToCompleteLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TimeToCompleteInput, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(TimeToCompleteUnitsLabel))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TypeLabel)
                                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CourseLabel)
                                    .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeLabel)
                    .addComponent(CourseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PromptScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerLabel)
                    .addComponent(ButtonAddResponse)
                    .addComponent(ButtonDropResponse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnswerCheckBox1)
                    .addComponent(AnswerInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnswerInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnswerCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnswerInput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnswerCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnswerInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnswerCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AnswerInput5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(KeywordsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KeywordsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TimeToCompleteLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TimeToCompleteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TimeToCompleteUnitsLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DifficultyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DifficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(AnswerCheckBox5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Update form based on question type selected.
     * @param evt
     */
    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        // proceed only if a question type is selected
        if (TypeComboBox.getSelectedIndex() == -1) {
            return;
        }
        // update response fields based on selected type
        QuestionType type = (QuestionType) TypeComboBox.getSelectedItem();
        switch (type) {
            case ShortAnswer:
                for (int i = 0; i < AnswerInputs.size(); i++) {
                    AnswerInputs.get(i).setEnabled(i == 0 ? true : false);
                    AnswerInputs.get(i).setOpaque(i == 0 ? true : false);
                    AnswerCheckBoxes.get(i).setEnabled(false);
                    AnswerCheckBoxes.get(i).setSelected(i == 0 ? true : false);
                    ButtonAddResponse.setEnabled(true);
                    ButtonDropResponse.setEnabled(false);
                }
                break;
            case MultipleChoice:
                for (int i = 0; i < AnswerInputs.size(); i++) {
                    AnswerInputs.get(i).setEnabled(true);
                    AnswerInputs.get(i).setOpaque(true);
                    AnswerCheckBoxes.get(i).setEnabled(true);
                    ButtonAddResponse.setEnabled(false);
                    ButtonDropResponse.setEnabled(true);
                }
                break;
            case Essay:
                for (int i = 0; i < AnswerInputs.size(); i++) {
                    AnswerInputs.get(i).setEnabled(false);
                    AnswerInputs.get(i).setOpaque(false);
                    AnswerCheckBoxes.get(i).setEnabled(false);
                    AnswerCheckBoxes.get(i).setSelected(false);
                    ButtonAddResponse.setEnabled(false);
                    ButtonDropResponse.setEnabled(false);
                }
                break;
            default:
                System.out.println("Error: question type " + type + " is not supported.");
                break;
       }
    }//GEN-LAST:event_TypeComboBoxActionPerformed
   
    /**
     * 
     */
    public void initResponses() {
        // add components to lists for easy access
        AnswerInputs = new ArrayList<>();
        AnswerInputs.add(AnswerInput1);
        AnswerInputs.add(AnswerInput2);
        AnswerInputs.add(AnswerInput3);
        AnswerInputs.add(AnswerInput4);
        AnswerInputs.add(AnswerInput5);
        AnswerCheckBoxes = new ArrayList<>();
        AnswerCheckBoxes.add(AnswerCheckBox1);
        AnswerCheckBoxes.add(AnswerCheckBox2);
        AnswerCheckBoxes.add(AnswerCheckBox3);
        AnswerCheckBoxes.add(AnswerCheckBox4);
        AnswerCheckBoxes.add(AnswerCheckBox5);  
        // initialize components as disabled
        for (int i = 0; i < AnswerInputs.size(); i++) {
            AnswerInputs.get(i).setEnabled(false);
            AnswerInputs.get(i).setOpaque(false);
            AnswerCheckBoxes.get(i).setEnabled(false);
            AnswerCheckBoxes.get(i).setSelected(false);
        }
        // disable response-related buttons
        ButtonAddResponse.setEnabled(false);
        ButtonDropResponse.setEnabled(false);
    }
    
    /**
     * When 'ok' button is pressed, the question is built from the 
     * parameters the user filled in and it is added to the database.
     * @param evt
     */
    private void ButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKActionPerformed
        QuestionType type = (QuestionType) TypeComboBox.getSelectedItem();
        Course course = (Course) CourseComboBox.getSelectedItem();
        String prompt = PromptInput.getText();
        Collection<Answer> answers = buildAnswers();
        String[] keywords = KeywordsInput.getText().split("[\\s,]+");
        QuestionDifficulty difficulty = (QuestionDifficulty) DifficultyComboBox.getSelectedItem();
        Integer timeToComplete = !TimeToCompleteInput.getText().isEmpty() ? new Integer(TimeToCompleteInput.getText()) : null;
      
        if (verifyInputs(type, course, prompt, answers, keywords, difficulty, timeToComplete)) {
            model.createQuestion(type, course, prompt, answers, keywords, difficulty, timeToComplete);
            cleanup();
        }
    }//GEN-LAST:event_ButtonOKActionPerformed

    /**
     * 
     */
    private void ButtonPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPreviewActionPerformed
        System.out.println("In AddQuestionUI.Preview (NOT IMPLEMENTED)");
    }//GEN-LAST:event_ButtonPreviewActionPerformed

    /**
     * Resets all fields of the question creation dialog. 
     */
    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        PromptInput.setText("");
        AnswerInput1.setText("");
        KeywordsInput.setText("");
        TimeToCompleteInput.setText("");
        TypeComboBox.setSelectedIndex(-1);
        CourseComboBox.setSelectedIndex(-1);
        DifficultyComboBox.setSelectedIndex(-1);
        initResponses();
    }//GEN-LAST:event_ButtonClearActionPerformed

    /**
     * Closes question creation dialog.
     */
    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        cleanup();
    }//GEN-LAST:event_ButtonCancelActionPerformed

    /**
     * Enable additional response field.
     * @param evt 
     */
    private void ButtonAddResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddResponseActionPerformed
        // free response questions cannot have responses assigned
        QuestionType type = (QuestionType) TypeComboBox.getSelectedItem();
        if (type == QuestionType.Essay) {
            return;
        }
        // enable next available response field
        for (int i = 0; i < AnswerInputs.size(); i++) {
            if (!AnswerInputs.get(i).isEnabled()) {
                AnswerInputs.get(i).setEnabled(true);
                AnswerInputs.get(i).setOpaque(true);
                if (type == QuestionType.ShortAnswer) {
                    AnswerCheckBoxes.get(i).setSelected(true);
                    AnswerCheckBoxes.get(i).setEnabled(false);
                } else {
                    AnswerCheckBoxes.get(i).setEnabled(true);
                }
                break;
            }
        }
        if (AnswerInputs.get(AnswerInputs.size()-1).isEnabled()) {
            ButtonAddResponse.setEnabled(false);
        }
        ButtonDropResponse.setEnabled(true);
    }//GEN-LAST:event_ButtonAddResponseActionPerformed

    private void ButtonDropResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDropResponseActionPerformed
        // free response questions cannot have responses assigned
        QuestionType type = (QuestionType) TypeComboBox.getSelectedItem();
        if (type == QuestionType.Essay) {
            return;
        }
        // enable next available response field
        int i;
        for (i = 0; i < AnswerInputs.size(); i++) {
            if (!AnswerInputs.get(i).isEnabled()) {
                if (i == 0) break;
                AnswerInputs.get(i-1).setEnabled(false);
                AnswerInputs.get(i-1).setOpaque(false);
                AnswerCheckBoxes.get(i-1).setEnabled(false);
                AnswerCheckBoxes.get(i-1).setSelected(false);
                break;
            }
        }
        if (AnswerInputs.get(i-1).isEnabled()) {
            AnswerInputs.get(i-1).setEnabled(false);
            AnswerInputs.get(i-1).setOpaque(false);
            AnswerCheckBoxes.get(i-1).setEnabled(false);
            AnswerCheckBoxes.get(i-1).setSelected(false);
        } else if ((type == QuestionType.ShortAnswer && i == 2) || (type == QuestionType.MultipleChoice && i == 3)) {
            ButtonDropResponse.setEnabled(false);
        } 
        ButtonAddResponse.setEnabled(true);
    }//GEN-LAST:event_ButtonDropResponseActionPerformed

    /**
     * Builds the answer key for the question.
     */
    private Collection<Answer> buildAnswers() {
        Collection<Answer> answers = new ArrayList<>();
        for (int i = 0; i < AnswerInputs.size() && AnswerInputs.get(i).isEnabled() && !AnswerInputs.get(i).getText().isEmpty(); i++) {
            answers.add(new Answer(AnswerInputs.get(i).getText(), AnswerCheckBoxes.get(i).isSelected()));
        }
        return answers;
    }
    
    /**
     * 
     */
    private boolean verifyInputs(QuestionType type,
                                 Course course,
                                 String prompt,
                                 Collection<Answer> answers,
                                 String[] keywords,
                                 QuestionDifficulty difficulty,
                                 Integer timeToComplete) {
        boolean inputsAreValid = true;
        String errorString = new String();

        if (type == null) {
            inputsAreValid = false;
            errorString += "No question type selected.\n";
        }
        if (course == null) {
            inputsAreValid = false;
            errorString += "No course selected.\n";        
        }
        if (prompt.isEmpty()) {
            inputsAreValid = false;
            errorString += "No prompt entered.\n";        
        }
        if (answers.isEmpty() && type != QuestionType.Essay) {
            inputsAreValid = false;
            errorString += "No responses entered.\n";
        } else if (type != QuestionType.Essay) {
            boolean correctAnswerExists = false;
            for (Answer answer : answers) {
                if (answer.isCorrect) {
                    correctAnswerExists = true;
                    break;
                }
            }
            if (!correctAnswerExists) {
                inputsAreValid = false;
                errorString += "No correct answer(s) selected (from responses).\n";
            }
        }
        if (keywords[0].isEmpty()) {
            inputsAreValid = false;
            errorString += "No keyword(s) entered.\n";
        }
        if (difficulty == null) {
            inputsAreValid = false;
            errorString += "No difficulty selected.\n";        
        }
        if (timeToComplete == null) {
            inputsAreValid = false;
            errorString += "No time-to-complete entered.\n";
        } else if (timeToComplete < 1) {
            inputsAreValid = false;
            errorString += "Time-to-complete must be greater than 0 mins.\n";
        }

        if (!inputsAreValid) {
            System.out.print(errorString);
        }
        return inputsAreValid;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AnswerCheckBox1;
    private javax.swing.JCheckBox AnswerCheckBox2;
    private javax.swing.JCheckBox AnswerCheckBox3;
    private javax.swing.JCheckBox AnswerCheckBox4;
    private javax.swing.JCheckBox AnswerCheckBox5;
    private javax.swing.JTextField AnswerInput1;
    private javax.swing.JTextField AnswerInput2;
    private javax.swing.JTextField AnswerInput3;
    private javax.swing.JTextField AnswerInput4;
    private javax.swing.JTextField AnswerInput5;
    private javax.swing.JLabel AnswerLabel;
    private javax.swing.JButton ButtonAddResponse;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonDropResponse;
    private javax.swing.JButton ButtonOK;
    private javax.swing.JButton ButtonPreview;
    private javax.swing.JComboBox<Course> CourseComboBox;
    private javax.swing.JLabel CourseLabel;
    private javax.swing.JComboBox<QuestionDifficulty> DifficultyComboBox;
    private javax.swing.JLabel DifficultyLabel;
    private javax.swing.JTextField KeywordsInput;
    private javax.swing.JLabel KeywordsLabel;
    private javax.swing.JTextArea PromptInput;
    private javax.swing.JLabel PromptLabel;
    private javax.swing.JScrollPane PromptScrollPane;
    private javax.swing.JTextField TimeToCompleteInput;
    private javax.swing.JLabel TimeToCompleteLabel;
    private javax.swing.JLabel TimeToCompleteUnitsLabel;
    private javax.swing.JComboBox<QuestionType> TypeComboBox;
    private javax.swing.JLabel TypeLabel;
    // End of variables declaration//GEN-END:variables
    private ArrayList<javax.swing.JTextField> AnswerInputs;
    private ArrayList<javax.swing.JCheckBox>  AnswerCheckBoxes;
}