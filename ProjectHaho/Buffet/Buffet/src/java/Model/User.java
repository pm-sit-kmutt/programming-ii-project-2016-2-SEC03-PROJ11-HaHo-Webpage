/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Matus
 */
public class User {
    
    private String userId;
    private String userName;
    private String userLastName;
    private String userEmail;
    private int userNo;
    private String password;
    private String userImage;
    private String isAdmin;

    public User() {
    }
    
    public User(String userId, String userName, String userLastName, String userEmail, String password) {
        this.userId = userId;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.password = password;
    }

    
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
    

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }
    
    public static User getProfile(int userNo){
        
        User u = null;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "SELECT * FROM user WHERE userNo = ?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1, userNo);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                u = new User();
                setProfile(rs,u);
            }
            con.close();
        }catch(Exception e ){
            System.out.println(e);
        }
        
        return u;
    }
    private static void setProfile(ResultSet rs, User u)throws Exception{
        u.setUserId(rs.getString("userID"));
        u.setPassword(rs.getString("userPassword"));
        u.setUserImage(rs.getString("userImage"));
        u.setUserName(rs.getString("userFName"));
        u.setUserLastName(rs.getString("userLName"));
        u.setUserNo(rs.getInt("userNo"));
        u.setIsAdmin(rs.getString("isAdmin"));
        u.setUserEmail(rs.getString("userEmail"));
    }
    
    public static User validate(String userName , String password){
        User u = null;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "SELECT * FROM user WHERE userID = ? and userPassword = ?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setString(1, userName);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                u = new User();
                setProfile(rs,u);
            }
        }catch(Exception e ){
            System.out.println(e);
        }
        return u;
    }
    
    public static boolean save(String userId , String fName , String lName , String email ,String password){
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sql = "insert into user (userID , userFName , userLName , userEmail , userPassword, userNo ) values (?,?,?,?,?,?) ";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,userId);
            pstm.setString(2,fName);
            pstm.setString(3, lName);
            pstm.setString(4, email);
            pstm.setString(5,password);
            int number = genUserNo();
            pstm.setInt(6,number);
            int x = pstm.executeUpdate();
            return x > 0;
        }catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }
    
    public static int genUserNo(){
        int x = 1;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sql = "Select max(userNo) from user";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
               x  = rs.getInt("max(userNo)");
               x++;
            }else{
               x = 1;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return x ;
    }
    
    public boolean isAdmin(User u){
        boolean t = false;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "select isAdmin from user where userNo = ?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1,u.getUserNo());
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                t = true;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return t;
    }
    
    public static void updateUser(String password,String imgpath, String userId){
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "Update user SET userImage = ?,userPassword=?  where userID like ?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setString(1, imgpath);
            pstm.setString(2,password);
            pstm.setString(3,"%" + userId + "%");
            int x = pstm.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
}
