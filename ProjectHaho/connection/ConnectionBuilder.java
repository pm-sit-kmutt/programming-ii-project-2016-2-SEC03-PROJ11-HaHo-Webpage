/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Matus
 */
public class ConnectionBuilder {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://10.4.56.12/hahoapplication";
            conn = DriverManager.getConnection(url, "haho", "hahoapp");
            
           // Class.forName("com.mysql.jdbc.Driver");
          //  conn = DriverManager.getConnection(url, "app", "app");

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
    
    public static void main(String[] args) {
        try{
            
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "SELECT * FROM user";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            
            ResultSet rs = pstm.executeQuery(sqlCmd);
            while(rs.next()){
                System.out.println("===================================================");
                System.out.println("NAME : " + rs.getString("username"));
                System.out.println("PASSWORD : " + rs.getString("user_pass"));
                System.out.println("===================================================");
            }
            con.close();
        }catch(Exception e){
            System.out.println("ERROR "+ e);
        }
        
    }
}
