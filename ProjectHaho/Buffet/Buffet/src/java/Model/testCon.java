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

/**
 *
 * @author Matus
 */
public class testCon {
    
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        System.out.println("Where is your MySQL JDBC Driver?");
        e.printStackTrace();
        return;
    }

    System.out.println("MySQL JDBC Driver Registered!");
    Connection connection = null;

    try {
        connection = DriverManager
        .getConnection("jdbc:mysql://hiaham.com:3306/chiew","chiew", "chiewchiewchiew");

    } catch (SQLException e) {
        System.out.println("Connection Failed! Check output console");
        e.printStackTrace();
        return;
    }

    if (connection != null) {
        try{
            String sqlCmd = "Select * from thread";
            PreparedStatement pstm = connection.prepareStatement(sqlCmd);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("ThreadHeader"));
            }
                    
        }catch(Exception e){
            System.out.println(e);
        }
    } else {
        System.out.println("Failed to make connection!");
    }
}
}
    

