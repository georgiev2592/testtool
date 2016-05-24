package testtool.view;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/****
 * Class TestToolDialog is an abstract class that represents a modal dialog to be displayed for the test tool.
 * All UI dialog classes extend this abstract class.
 *
 * @author Ian Smith-Grove (ismithgr@calpoly.edu)
 */
public abstract class TestToolDialog extends javax.swing.JPanel implements TestToolView {

    /**
     * Title for the dialog (displayed at top)
     */
    public String title;

    /**
     * This method is used to force all children to assign title in their constructor
     * @param title title for the frame
     */
    public TestToolDialog(String title) {
        this.title = title;
    }

    /**
     * This method creates and displays the dialog
     * @param frame window the dialog is displayed from
     */
    public void draw(JFrame frame) {
       JDialog dialog = new JDialog(frame, Dialog.ModalityType.MODELESS);
       dialog.getContentPane().setLayout(new FlowLayout());
       dialog.setTitle(title);
       dialog.getContentPane().add(this, BorderLayout.EAST);
       dialog.setResizable(false);
       dialog.pack();
       dialog.setVisible(true);  
    }

    /**
     * This method closes the dialog
     */
    @Override
    public void cleanup() {
        Window window = SwingUtilities.getWindowAncestor(this);
        JDialog dialog = (JDialog) window;
        dialog.dispose();
    }

}
