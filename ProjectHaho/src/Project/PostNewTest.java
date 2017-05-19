/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author USER
 */
public class PostNewTest {

    private int postID, voteScore, userID;
    private String post_name, post_description, username;
    private Date post_createDate, post_editDate;
    private boolean isPin;

    public PostNewTest() {

    }

    public PostNewTest(String post_name, String username, Date post_createDate) {
        this.post_name = post_name;
        this.username = username;
        this.post_createDate = post_createDate;
    }

    public PostNewTest(int postID, int voteScore, int userID, String post_name, String post_description, Date post_createDate, Date post_editDate, boolean isPin) {
        this.postID = postID;
        this.voteScore = voteScore;
        this.userID = userID;
        this.post_name = post_name;
        this.post_description = post_description;
        this.post_createDate = post_createDate;
        this.post_editDate = post_editDate;
        this.isPin = isPin;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getVoteScore() {
        return voteScore;
    }

    public void setVoteScore(int voteScore) {
        this.voteScore = voteScore;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getPost_description() {
        return post_description;
    }

    public void setPost_description(String post_description) {
        this.post_description = post_description;
    }

    public Date getPost_createDate() {
        return post_createDate;
    }

    public void setPost_createDate(Date post_createDate) {
        this.post_createDate = post_createDate;
    }

    public Date getPost_editDate() {
        return post_editDate;
    }

    public void setPost_editDate(Date post_editDate) {
        this.post_editDate = post_editDate;
    }

    public boolean isIsPin() {
        return isPin;
    }

    public void setIsPin(boolean isPin) {
        this.isPin = isPin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static void getDataFromDB(ResultSet rs, PostNewTest p) throws SQLException {
        p.setPostID(rs.getInt("postID"));
        p.setPost_name(rs.getString("post_name"));
        p.setPost_description(rs.getString("post_description"));
        p.setPost_createDate(rs.getDate("post_createDate"));
        p.setVoteScore(rs.getInt("voteScore"));
        p.setPost_editDate(rs.getDate("post_editDate"));
        p.setIsPin(rs.getBoolean("isPin"));
        p.setUserID(rs.getInt("userID"));
    }

    public static ArrayList<String> PostList() {
        ArrayList postList = new ArrayList<PostNewTest>();
        Statement st;
        Connection con = null;
        try {
            String sql = "SELECT post_name,post_createDate,user.username FROM Post inner join user on Post.userID=user.userID";
            con = Database.getConnection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
//                if (postList == null) {
//                    postList = new ArrayList<>();
//                }
//                getDataFromDB(rs, pt);
//                postList.add(pt);
                Date dt = new Date(rs.getTimestamp("post_createDate").getTime());
                postList.add(rs.getString("post_name")+"    "+ rs.getString("username")+"   "+ dt);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return postList;

    }

    public static void main(String args[]) {
        ArrayList<String> pn = PostNewTest.PostList();

        for (String p : pn) {
            System.out.println(p);
           

        }
    }
}
