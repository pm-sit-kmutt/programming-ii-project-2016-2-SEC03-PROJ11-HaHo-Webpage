/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Matus
 */
public class ConnectionBuilder {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://hiaham.com:3306/chiew?zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=UTF-8";
            conn = DriverManager.getConnection(url, "chiew", "chiewchiewchiew");
            
            
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, "app", "app");

        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.err.println(ex.getMessage());
        } catch (InstantiationException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return conn;
    }
}
