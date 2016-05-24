/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtool.view.misc;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

/**
 * 
 * @author Ian
 */
public class IntegerDocumentFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int off
                        , String str, AttributeSet attr) 
                                throws BadLocationException 
    {
        // remove non-digits
        fb.insertString(off, str.replaceAll("\\D++", ""), attr);
    } 
    @Override
    public void replace(FilterBypass fb, int off
            , int len, String str, AttributeSet attr) 
                            throws BadLocationException 
    {
        // remove non-digits
        fb.replace(off, len, str.replaceAll("\\D++", ""), attr);
    }
}
