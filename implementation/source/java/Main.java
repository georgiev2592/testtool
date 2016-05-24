/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;
import testtool.TestTool;
import testtool.view.LoginUI;

/**
 *
 * @author WreckingBall Team
 */
public class Main {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         
         @Override
         public void run() {
            TestTool testtool = new TestTool();
               //JPanel displayPanel = new JPanel();
               //swinger.createAndShowGUI();
            LoginUI thing = new LoginUI(testtool);
            JFrame displayFrame = new JFrame("Login");
//            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
           
            displayFrame.setResizable(false);
            
            displayFrame.getContentPane().add(thing, BorderLayout.CENTER);
            displayFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            displayFrame.pack();
            
//            displayFrame.setLocation(dim.width / 2 - displayFrame.getSize().width / 2,
//                                     dim.height / 2 - displayFrame.getSize().height / 2);
            displayFrame.setVisible(true);
         }
      });
   }
}