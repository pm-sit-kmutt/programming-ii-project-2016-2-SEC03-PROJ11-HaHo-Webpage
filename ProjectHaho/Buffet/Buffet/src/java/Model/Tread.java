/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matus
 */
public class Tread {
    
    private String header;
    private String threadBody;
    private int threadId;
    private int userNo;
    private String tags;
    private String image;
    public Tread(){
        
    }
    
    public Tread(String header, String body, int userNo, String tags, String image){
        this.header = header;
        this.threadBody = body;
        this.threadId = genTreadId();
        this.userNo = userNo;
        this.tags = tags;
        this.image = image;
        postTread(this.header,this.threadBody,this.threadId,this.userNo, this.tags, this.image);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getThreadBody() {
        return threadBody;
    }

    public void setThreadBody(String threadBody) {
        this.threadBody = threadBody;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }
    
    public int genTreadId(){
        int x = 1;
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sql = "Select max(ThreadID) from thread";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
               x  = rs.getInt("max(ThreadID)");
               x++;
            }else{
               x = 1;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return x ;
    }
    
    public static void postTread(String header, String threadBody, int threadId, int userNo, String tags, String image) {
        // get ID ออกมา == null ให้ ++ แล้วค่อย set update ลง db 
        // get ID ออกมา != null ให้ get+=1 แล้วค่อย update ลง db
        
        try{
            Connection con = ConnectionBuilder.getConnection();

            String sqlCmd = "INSERT INTO thread (ThreadID, ThreadHeader, ThreadBody, userNo, tags, image) value (?,?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1, threadId);
            pstm.setString(2, header);
            pstm.setString(3,threadBody);
            pstm.setInt(4,userNo);
            pstm.setString(5,tags);
            pstm.setString(6,image);
            int x = pstm.executeUpdate();
           
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    
    
    public void editTread(String header, String threadBody,int ThreadID){
        // find ThreadID แล้ว Update
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "SELECT ThreadId from Thread where ThreadID = ?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1, ThreadID);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                String cmd = "Update ... where threadID = ?";
                PreparedStatement stm = con.prepareStatement(cmd);
                stm.setInt(1,ThreadID);
                int x = stm.executeUpdate();
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static Tread getTread(int ThreadId){
        
        Tread t = null;
        
        try{
            Connection con = ConnectionBuilder.getConnection();
            String sqlCmd = "SELECT * FROM thread where ThreadId = ?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1,ThreadId);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                t = new Tread();
                setTread(rs,t);
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return t;
    }
    
    private static void setTread(ResultSet rs , Tread t)throws Exception{
        t.setHeader(rs.getString("ThreadHeader"));
        t.setThreadBody(rs.getString("ThreadBody"));
        t.setThreadId(rs.getInt("ThreadID"));
    }
    
    public List<Tread> showTread(){
        List<Tread> treadList = null;
        Tread t = null;
        try{
            Connection con = ConnectionBuilder.getConnection();
           String sqlCmd = "SELECT * FROM thread";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                t = new Tread();
                setTread(rs, t);
                if(treadList == null){
                    treadList = new ArrayList<Tread>();
                }
                treadList.add(t);
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return treadList;
    }
 
}
