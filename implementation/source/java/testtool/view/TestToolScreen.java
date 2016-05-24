package testtool.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/****
 * Class TestToolScreen is an abstract class representing a screen/menu to be displayed for the test tool.
 * All main UI classes extend this abstract class.
 *
 *
 * @author Ian Smith-Grove (ismithgr@calpoly.edu)
 */
public abstract class TestToolScreen extends javax.swing.JPanel implements TestToolView {

    /**
     * Title for the frame (displayed at top of window)
     */
    public String title;

    /**
     * This method is used to force all children to assign title in their constructor.
     * @param title title for the frame
     */
    public TestToolScreen(String title) {
        this.title = title;
    }

    /**
     * This displays the screen on the passed frame.
     * @param frame window the screen is displayed on
     */
    @Override
    public void draw(JFrame frame) {
        //
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setTitle(title);

        //switch the panel to the menu
        frame.getContentPane().add(this, BorderLayout.EAST);
        frame.pack();       
    }
    
    /**
     * This method clears the screen
     */
    @Override
    public void cleanup() {
        this.setVisible(false);
        this.removeAll();
    }
    
    /**
     * This method replaces the current screen with a new one.
     * @param screen the new screen to be displayed
     */
    public void displayNewScreen(TestToolScreen screen) {
       this.cleanup();
       screen.draw(this.getFrame());
    }
    
    /**
     * This method draws a new model dialog from the current screen.
     * @param dialog the new dialog to be displayed
     */
    public void displayNewDialog(TestToolDialog dialog) {
        dialog.draw(this.getFrame());
    }
     
    /**
     * 
     * @return The display frame of the Test Tool
     */
    private javax.swing.JFrame getFrame() {
        Window window = SwingUtilities.getWindowAncestor(this);
        return (JFrame) window;
    }
}
