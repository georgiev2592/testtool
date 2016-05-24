/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtool.database.selection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Represents the results of a MySQL database query.
 * @author Ian
 */
public class Selection implements Iterable<Tuple>{
    /** results of a query */
    Collection<Tuple> selection;
    
    /**
     * Initialize values.
     */
    public Selection(Collection<Tuple> selection) {
        this.selection = selection;
    }
    
    public Selection() {
        this.selection = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return selection.isEmpty();
    }
    
    @Override
    public String toString() {
        return selection.toString();
    }

    @Override
    public Iterator<Tuple> iterator() {
        return selection.iterator();
    }
}
