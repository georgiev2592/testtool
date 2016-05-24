/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtool.database.query;

import java.util.ArrayList;
import java.util.Collection;
import testtool.database.selection.Attribute;

/**
 *
 * @author Ian
 */
public class Query {
    
    /**
     * Name of the table to query.
     */
    String table;
    
    /**
     * Column names and associated values.
     */
    Collection<Attribute> attributes;
    
    /**
     * Initialize components.
     */
    public Query(String table) {
        this.table = table;
        this.attributes = new ArrayList<>();
    }
    
    /**
     * 
     * @param column
     * @param value 
     */
    public void addItem(String column, String value) {
        attributes.add(new Attribute(column, value));
    }
    
    /**
     * 
     * @param column
     * @param value 
     */
    public void addItem(String column, int value) {
        attributes.add(new Attribute(column, value));
    }
    
    /**
     * 
     * @param column
     * @param value 
     */
    public void addItem(String column, boolean value) {
        attributes.add(new Attribute(column, value ? 1 : 0));
    }
    
    /**
     * Builds the query.
     * @return MySQL formatted select statement
     */
    public String build() {
        String query = "SELECT * FROM " + table + " WHERE ";
        boolean check = false;
        for (Attribute item : attributes) {
            if (check) query += " && ";
            query += item.column + " = " + "\'" + item.value + "\'";
            check = true;
        }
        query += ";";
        return query;   
    }
    
    /**
     * Build insert statement.
     * @return MySQL formatted insert statement
     */
    public String buildInsert() {
        String query = "INSERT INTO " + table + " (";
        boolean check = false;
        
        for (Attribute item : attributes) {
            if (check) query += ", ";
            query += item.column;
            check = true;
        }
        query += ") VALUES (";
        check = false;
        for (Attribute item: attributes) {
            if (check) query += ", ";
            query += "\'" + item.value + "\'";
            check = true;
        }
        query += ");";
        return query;
    }
    

    /**
     * Build delete statement.
     * @return MySQL formatted delete query
     */
    public String buildDelete() {
        String query = "DELETE FROM " + table + " WHERE ";
        boolean check = false;
        for (Attribute item : attributes) {
            if (check) query += " && ";
            query += item.column + " = " + "\'" + item.value + "\'";
            check = true;
        }
        query += ";";
        return query;  
    }
    
    /**
     * Build update statement.
     * @return MySQL formatted update query
     */
    public String buildUpdate(Collection<Attribute> id) {
        String query = "UPDATE " + table + " SET ";
        boolean check = false;
        
        for (Attribute item : attributes) {
            if (check) query += ", ";
            query += item.column + "=" + "\'" + item.value + "\'";
            check = true;
        }
        query += " WHERE ";
        check = false;
        for (Attribute item : id) {
            if (check) query += " && ";
            query += item.column + "=" + "\'" + item.value + "\'";
            check = true;
        }
        query += ";";
        return query;
    }
}
