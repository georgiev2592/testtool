package testtool.view;

import javax.swing.JFrame;

/**
 * Interface TestTool view is a framework used by any screen or dialog displayed by the test tool.
 *
 * @author Ian Smith-Grove (ismithgr@calpoly.edu)
 */
public interface TestToolView {

    /** 
     * This method displays the view.
     * @param frame window display is drawn from
     */
    public void draw(JFrame frame);

    /**
     * This method closes the view.
     */
    public void cleanup();


}
