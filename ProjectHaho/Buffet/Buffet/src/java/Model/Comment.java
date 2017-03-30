/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Matus
 */
public class Comment {
    
    private String CommentBody;
    private Date CommentTime;
    private int threadId;
    private int userNo;
    private String image;
    private String userName;
    private int CommentNo;

    public int getUserNo() {
        return userNo;
    }
    public String getImage(){
       return image;
    }
    public void setImage(String i){
        this.image = i;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String u){
        this.userName = u;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }
    

    public String getCommentBody() {
        return CommentBody;
    }

    public void setCommentBody(String CommentBody) {
        this.CommentBody = CommentBody;
    }

    public Date getCommentTime() {
        return CommentTime;
    }

    public void setCommentTime(Date CommentTime) {
        this.CommentTime = CommentTime;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }
    
    public static void postComment(int ThreadId, String body,Comment c,int userNo){
        
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "INSERT INTO `comment`(`commentID`, `ThreadID`, `userNo`, `time`, `commentText`) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            int y = genCommentNo();
            pstm.setInt(1,y);
            pstm.setInt(2,ThreadId);
            pstm.setInt(3,userNo);
            pstm.setTimestamp(4, new java.sql.Timestamp(c.getCommentTime().getTime()));
            pstm.setString(5,body);
            int x = pstm.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void editComment(int ThreadId, String body){
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "SELECT * FROM comment where threadId = ?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1,ThreadId);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                String sql = "UPDATE COMMENT body=? where ThreadId = ?";
                PreparedStatement stm = con.prepareStatement(sql);
                stm.setString(1,body);
                stm.setInt(2,ThreadId);
                int x = stm.executeUpdate();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static List<Comment> showComment(int ThreadId){
        Comment c = null;
        List<Comment> comments = null;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "select * FROM comment c JOIN user u ON c.userno =u.userno where ThreadId = ?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1, ThreadId);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                c = new Comment();
                setComment(rs,c);
                if(comments == null){
                    comments = new ArrayList<Comment>();
                }
                comments.add(c);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return comments;
    }
    
    private static void setComment(ResultSet rs, Comment c)throws Exception{
        c.setCommentBody(rs.getString("commentText"));
        c.setCommentTime(rs.getDate("time"));
        c.setThreadId(rs.getInt("ThreadID"));
        c.setUserNo(rs.getInt("userNo"));
        c.setUserName(rs.getString("userFNAME"));
        c.setImage(rs.getString("userImage"));
        
    }
    
    public static int genCommentNo(){
        int x = 1;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sql = "Select max(commentID) from comment";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
               x  = rs.getInt("max(commentID)");
               x++;
            }else{
               x = 1;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return x ;
    }
    
    
    
    
}
