/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import static Project.Post.getTField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bver
 */
public class GenCode {
    protected static int countVote = 0;
    protected static int countPost = 1;
     public static int genId() throws SQLException {
        
        Connection con = Database.getConnection();
        Statement stm = con.createStatement();
        String sql = "select max(postId) from Post";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            countPost = rs.getInt("max(postId)");
            countPost++;
        } else {
            countPost = 1;
        }

        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return countPost;
    }

    public static int genVote() throws SQLException {
        
        Connection con = Database.getConnection();
        Statement stm = con.createStatement();
        String sql = "select * from Post where postID=" + "'" + countPost + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next()) {
            if (rs.getInt("voteScore") != 0) {
                countVote = rs.getInt("voteScore");
                countVote++;
                String sqlV = "UPDATE Post "+
                    "SET voteScore ="+"'"+countVote+"'"+
                    " WHERE postID ="+"'"+getTField+"'";
                    stm.execute(sqlV);
                countVote=0;
            }
        } else {
            countVote++;

        }
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return countVote;
    }
    
    
    public static int genUserID() throws SQLException {
        Connection con = null;
        int x = 1;

        try {
            con = Database.getConnection();
            String sql = "select MAX(userID) FROM user";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                x = rs.getInt("max(userID)");
                x++;
            } else {
                x = 1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return x;
    }
     public static int genCommentID() {
        int x = 1;
        Connection con = null;
        try {
            con = Database.getConnection();
            String sql = "Select max(commentID) from Comment";
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet rs = psm.executeQuery(sql);
            if (rs.next()) {
                x = rs.getInt("max(commentID)");
                x++;
            } else {
                x = 1;
            }
        } catch (Exception e) {
            System.out.println(e);
            
        }
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return x;
    }
    
}
