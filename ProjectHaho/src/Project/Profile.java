/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import Project.HomeShowPostListNotLogin;

/**
 *
 * @author Susumintraaa
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
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

        panelBG = new javax.swing.JPanel();
        panelBar = new javax.swing.JPanel();
        kmutt = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        addTopic1 = new javax.swing.JButton();
        lb_kmutt = new javax.swing.JLabel();
        pn_bar = new javax.swing.JPanel();
        lb_icon = new javax.swing.JLabel();
        lb_profilebar = new javax.swing.JLabel();
        jb_editProfile = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jb_logout = new javax.swing.JButton();
        pn_pic = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();
        studentID = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        pn_black = new javax.swing.JPanel();
        pn_orange = new javax.swing.JPanel();
        lb_activity = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        studentID1 = new javax.swing.JLabel();
        studentID2 = new javax.swing.JLabel();
        lb_user = new javax.swing.JLabel();
        wc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBG.setBackground(new java.awt.Color(255, 255, 255));
        panelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBar.setBackground(new java.awt.Color(255, 102, 0));
        panelBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kmutt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kmutt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/kmutt1.png"))); // NOI18N
        panelBar.add(kmutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 100));

        home.setBackground(new java.awt.Color(255, 102, 0));
        home.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        panelBar.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 150, 40));

        profile.setBackground(new java.awt.Color(255, 255, 255));
        profile.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 102, 0));
        profile.setText("PROFILE");
        panelBar.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 310, 150, 40));

        addTopic1.setBackground(new java.awt.Color(255, 102, 0));
        addTopic1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        addTopic1.setForeground(new java.awt.Color(255, 255, 255));
        addTopic1.setText("ADD TOPIC");
        addTopic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTopic1ActionPerformed(evt);
            }
        });
        panelBar.add(addTopic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 250, 150, 40));

        panelBG.add(panelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 530));

        lb_kmutt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_kmutt.setForeground(new java.awt.Color(255, 102, 0));
        lb_kmutt.setText("King Mongkut's University of Technology Thonburi ");
        panelBG.add(lb_kmutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 460, 40));

        pn_bar.setBackground(new java.awt.Color(204, 204, 204));
        pn_bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/3.png"))); // NOI18N
        pn_bar.add(lb_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        lb_profilebar.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lb_profilebar.setText("PROFILE");
        pn_bar.add(lb_profilebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 30));

        jb_editProfile.setBackground(new java.awt.Color(255, 255, 255));
        jb_editProfile.setForeground(new java.awt.Color(255, 102, 0));
        jb_editProfile.setText("EDIT PROFILE");
        pn_bar.add(jb_editProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 120, 30));

        panelBG.add(pn_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 770, 50));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setMaximumSize(new java.awt.Dimension(2147483647, 2147480000));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBG.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 780, 2));

        jb_logout.setBackground(new java.awt.Color(255, 102, 0));
        jb_logout.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jb_logout.setForeground(new java.awt.Color(255, 255, 255));
        jb_logout.setText("Log Out");
        jb_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_logoutActionPerformed(evt);
            }
        });
        panelBG.add(jb_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 80, -1));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/man.png"))); // NOI18N

        javax.swing.GroupLayout pn_picLayout = new javax.swing.GroupLayout(pn_pic);
        pn_pic.setLayout(pn_picLayout);
        pn_picLayout.setHorizontalGroup(
            pn_picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_picLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pic)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pn_picLayout.setVerticalGroup(
            pn_picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_picLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pic)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelBG.add(pn_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        studentID.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        studentID.setForeground(new java.awt.Color(153, 153, 153));
        studentID.setText("จำนวนกระทู้ที่คอมเม้น :");
        panelBG.add(studentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 160, 20));

        username.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Username :");
        panelBG.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 80, 20));

        pn_black.setBackground(new java.awt.Color(0, 0, 0));
        pn_black.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_orange.setBackground(new java.awt.Color(255, 102, 0));
        pn_orange.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_activity.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_activity.setForeground(new java.awt.Color(255, 255, 255));
        lb_activity.setText("ACTIVITY");
        pn_orange.add(lb_activity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        pn_black.add(pn_orange, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelBG.add(pn_black, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 690, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        panelBG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 690, 150));

        studentID1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        studentID1.setForeground(new java.awt.Color(153, 153, 153));
        studentID1.setText("StudentID :");
        panelBG.add(studentID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 80, 20));

        studentID2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        studentID2.setForeground(new java.awt.Color(153, 153, 153));
        studentID2.setText("จำนวนกระทู้ที่สร้าง  :");
        panelBG.add(studentID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 130, 20));
        panelBG.add(lb_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 70, 30));

        wc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        wc.setForeground(new java.awt.Color(204, 204, 204));
        wc.setText("Wecome");
        panelBG.add(wc, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 60, 30));

        getContentPane().add(panelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_logoutActionPerformed
        // TODO add your handling code here:
        HomeShowPostListNotLogin home = new HomeShowPostListNotLogin();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_logoutActionPerformed

    private void addTopic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTopic1ActionPerformed
        // TODO add your handling code here:
        Post1 p = new Post1();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addTopic1ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        HomeShowPostList home = new HomeShowPostList();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTopic1;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_editProfile;
    private javax.swing.JButton jb_logout;
    private javax.swing.JLabel kmutt;
    private javax.swing.JLabel lb_activity;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_kmutt;
    private javax.swing.JLabel lb_profilebar;
    private javax.swing.JLabel lb_user;
    private javax.swing.JPanel panelBG;
    private javax.swing.JPanel panelBar;
    private javax.swing.JLabel pic;
    private javax.swing.JPanel pn_bar;
    private javax.swing.JPanel pn_black;
    private javax.swing.JPanel pn_orange;
    private javax.swing.JPanel pn_pic;
    private javax.swing.JButton profile;
    private javax.swing.JLabel studentID;
    private javax.swing.JLabel studentID1;
    private javax.swing.JLabel studentID2;
    private javax.swing.JLabel username;
    private javax.swing.JLabel wc;
    // End of variables declaration//GEN-END:variables

}
