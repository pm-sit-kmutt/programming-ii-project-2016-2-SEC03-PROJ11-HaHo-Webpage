/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import Project.Database;
import static java.lang.String.join;
import java.sql.Connection;
import java.util.Date;
import java.sql.*;
import static java.sql.Timestamp.from;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Susumintraaa
 */
public class comment extends javax.swing.JFrame {


    public comment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textComment = new javax.swing.JTextArea();
        comment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textComment.setColumns(20);
        textComment.setRows(5);
        jScrollPane1.setViewportView(textComment);

        comment.setText("comment");
        comment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comment)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comment)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void commentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentActionPerformed
            Connection con = null;    
        try {
            con = Database.getConnection();
            
            String sql = "insert into Comment (commentID,comment_description,comment_date,postID,userID) values (?,?,?,?,?)";
            PreparedStatement psm = con.prepareStatement(sql);
            int num = genCommentID();
            Date timedate = new Date();
            Timestamp tm = new Timestamp(timedate.getTime());
            
            psm.setInt(1,num);
            psm.setString(2,textComment.getText());
            psm.setTimestamp(3,tm);
            psm.setInt(4,1); 
            //String sql2 = "Select user.userID FROM user INNER JOIN Comment ON user.userID = Comment.userID";
           
            psm.setInt(5,2);
            
            
            int x = psm.executeUpdate();
            
            
            System.out.println(genCommentID());
            System.out.println(textComment.getText());
            System.out.println(tm);
            
            
        } catch (Exception e) {
            System.out.println("!!!!!!!!"+e);
           
        }
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        this.setVisible(false);
        
        

    }//GEN-LAST:event_commentActionPerformed
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
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textComment;
    // End of variables declaration//GEN-END:variables
}
