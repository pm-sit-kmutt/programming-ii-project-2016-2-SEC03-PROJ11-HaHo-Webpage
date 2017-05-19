/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;

public class Database {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://10.4.56.12:3306/hahoapplication?useUnicode=true&characterEncoding="
           + "UTF-8&characterSetResults=utf8&connectionCollation=utf8_general_ci";
            conn = DriverManager.getConnection(url, "haho", "hahoapp");
            System.out.println("Connect");
            return conn;
            // Class.forName("com.mysql.jdbc.Driver");
            // conn = DriverManager.getConnection(url, "app", "app");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    
    /*public static void main(String[] args) {
        try{
            Connection con = Database.getConnection();
            Statement s = con.createStatement();
            String sql = "select * from user";
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("userID"));
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("user_pass"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/
}
