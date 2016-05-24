package testtool.view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import testtool.TestTool;
import testtool.model.administration.*;
import testtool.view.testmanager.CreateTestUI;


/**
 * The view class for the login screen.
 * 
 * @author Robert Mitsuda
 */
public class LoginUI extends TestToolScreen {

    /**
     * The testtool that is passed around the program.
     */
    private TestTool testtool;
    
    /**
     * Creates new form swinger
     */
    public LoginUI(TestTool tt) {
        super("Test Tool / Login");
        initComponents();
        this.testtool = tt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      TestToolMenuBar = new javax.swing.JMenuBar();
      File = new javax.swing.JMenu();
      Home = new javax.swing.JMenuItem();
      jSeparator2 = new javax.swing.JPopupMenu.Separator();
      Logout = new javax.swing.JMenuItem();
      passwordBlank = new javax.swing.JPasswordField();
      jSeparator1 = new javax.swing.JPopupMenu.Separator();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      usernameBlank = new javax.swing.JTextField();
      loginButton = new javax.swing.JButton();
      forgotPasswordButton = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();

      File.setText("File");

      Home.setText("Home");
      File.add(Home);
      File.add(jSeparator2);

      Logout.setText("Logout");
      File.add(Logout);

      TestToolMenuBar.add(File);

      setBackground(new java.awt.Color(0, 102, 102));
      setForeground(new java.awt.Color(164, 6, 6));

      passwordBlank.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent evt) {
            passwordBlankKeyTyped(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("Chalkduster", 1, 24)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setText("Wrecking Ball Test Tool");

      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setText("Password");

      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("Username");

      loginButton.setText("Login");
      loginButton.setMaximumSize(new java.awt.Dimension(54, 28));
      loginButton.setMinimumSize(new java.awt.Dimension(54, 28));
      loginButton.setPreferredSize(new java.awt.Dimension(54, 28));
      loginButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            loginButtonActionPerformed(evt);
         }
      });

      forgotPasswordButton.setForeground(new java.awt.Color(255, 255, 255));
      forgotPasswordButton.setText("Forgot Password");
      forgotPasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            forgotPasswordButtonMouseClicked(evt);
         }
      });

      jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(layout.createSequentialGroup()
            .addGap(44, 44, 44)
            .addComponent(jLabel4)
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jLabel3)
               .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(forgotPasswordButton))
               .addComponent(passwordBlank, javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(usernameBlank, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(42, Short.MAX_VALUE))
         .addGroup(layout.createSequentialGroup()
            .addGap(130, 130, 130)
            .addComponent(jLabel1)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(usernameBlank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel3))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(passwordBlank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(forgotPasswordButton)
                     .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(32, 32, 32))
               .addComponent(jLabel4))
            .addContainerGap(41, Short.MAX_VALUE))
      );
   }// </editor-fold>//GEN-END:initComponents

    /**
     * Method called when the user hits the ok buttong --
     * will move onto the next screen if info is valid.
     * @param evt
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
      // TODO add your handling code here:
       Window window = SwingUtilities.getWindowAncestor(this);
       JFrame frame = (JFrame) window;
       TestToolMenuBar menubar = new TestToolMenuBar(testtool);
                        
       if (Login.login(usernameBlank.getText(), passwordBlank.getText())) {
           displayNewScreen(new AdministratorUI(testtool));
           menubar.draw(frame);
       }
       else {
          System.out.println("Please enter valid username and pw");
          JOptionPane.showMessageDialog(null,
             "We could not log you in using the e-mail or the password you entered.",
             "Problem",
             JOptionPane.WARNING_MESSAGE);
       }  
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * Method called when the user fills in the password and hits enter --
     * will move onto the next screen if info is valid.
     * @param evt
     */
    private void passwordBlankKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordBlankKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordBlankKeyTyped

    /**
     * Will call forgotPassword method in the model class if the user
     * forgets their password.
     * @param evt
     */
    private void forgotPasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordButtonMouseClicked
        displayNewDialog(new ForgotPasswordUI());
    }//GEN-LAST:event_forgotPasswordButtonMouseClicked

    /**
     * Logout button that is used to logout the user
     */
    private javax.swing.JButton logout;
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JMenu File;
   private javax.swing.JMenuItem Home;
   private javax.swing.JMenuItem Logout;
   private javax.swing.JMenuBar TestToolMenuBar;
   private javax.swing.JLabel forgotPasswordButton;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JPopupMenu.Separator jSeparator1;
   private javax.swing.JPopupMenu.Separator jSeparator2;
   private javax.swing.JButton loginButton;
   private javax.swing.JPasswordField passwordBlank;
   private javax.swing.JTextField usernameBlank;
   // End of variables declaration//GEN-END:variables

    
}
