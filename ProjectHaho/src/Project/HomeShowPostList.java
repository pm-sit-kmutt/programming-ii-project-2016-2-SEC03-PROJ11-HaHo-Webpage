/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author USER
 */
public class HomeShowPostList extends javax.swing.JFrame {

    /**
     * Creates new form HomeShowPostList
     */
    public HomeShowPostList() {
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
        nav = new javax.swing.JPanel();
        pic_book = new javax.swing.JLabel();
        CommunityForum = new javax.swing.JLabel();
        text_search = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        line = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showPostList = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        nav2 = new javax.swing.JPanel();
        line2 = new javax.swing.JPanel();
        topic = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);

        panelBG.setBackground(new java.awt.Color(255, 255, 255));
        panelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBar.setBackground(new java.awt.Color(255, 102, 0));
        panelBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kmutt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kmutt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/kmutt1.png"))); // NOI18N
        panelBar.add(kmutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 100));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 102, 0));
        home.setText("HOME");
        panelBar.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 150, 40));

        profile.setBackground(new java.awt.Color(255, 102, 0));
        profile.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("PROFILE");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
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

        nav.setBackground(new java.awt.Color(204, 204, 204));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pic_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/open-book.png"))); // NOI18N
        nav.add(pic_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        CommunityForum.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        CommunityForum.setText("Community Forum");
        nav.add(CommunityForum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        text_search.setBackground(new java.awt.Color(204, 204, 204));
        text_search.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        text_search.setForeground(new java.awt.Color(255, 102, 0));
        text_search.setText(" Search");
        text_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        text_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_searchFocusLost(evt);
            }
        });
        nav.add(text_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 150, 30));

        search.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        search.setText("Search");
        nav.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 80, 30));

        panelBG.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 770, 60));

        line.setBackground(new java.awt.Color(255, 102, 0));
        line.setMaximumSize(new java.awt.Dimension(2147483647, 2147480000));
        line.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBG.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 780, 2));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Wecome");
        panelBG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 60, 30));

        logout.setBackground(new java.awt.Color(255, 102, 0));
        logout.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        panelBG.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 80, -1));

        jScrollPane1.setBorder(null);

        showPostList.setBackground(new java.awt.Color(255, 255, 255));
        showPostList.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout showPostListLayout = new javax.swing.GroupLayout(showPostList);
        showPostList.setLayout(showPostListLayout);
        showPostListLayout.setHorizontalGroup(
            showPostListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showPostListLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(showPostListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        showPostListLayout.setVerticalGroup(
            showPostListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPostListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(showPostList);

        panelBG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 770, 330));

        nav2.setBackground(new java.awt.Color(255, 102, 0));

        line2.setBackground(new java.awt.Color(204, 204, 204));
        line2.setPreferredSize(new java.awt.Dimension(730, 5));

        javax.swing.GroupLayout line2Layout = new javax.swing.GroupLayout(line2);
        line2.setLayout(line2Layout);
        line2Layout.setHorizontalGroup(
            line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        line2Layout.setVerticalGroup(
            line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        topic.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        topic.setForeground(new java.awt.Color(255, 255, 255));
        topic.setText("Topic");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Writer");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recent Post");

        javax.swing.GroupLayout nav2Layout = new javax.swing.GroupLayout(nav2);
        nav2.setLayout(nav2Layout);
        nav2Layout.setHorizontalGroup(
            nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(line2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nav2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(topic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(149, 149, 149)
                .addComponent(jLabel4)
                .addGap(71, 71, 71))
        );
        nav2Layout.setVerticalGroup(
            nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav2Layout.createSequentialGroup()
                .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nav2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nav2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nav2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topic)
                        .addContainerGap())))
        );

        panelBG.add(nav2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 730, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        HomeShowPostListNotLogin home = new HomeShowPostListNotLogin();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void text_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_searchFocusGained
        // TODO add your handling code here:
        if (text_search.getText().equals(" Search")) {
            text_search.setText("");
        }
    }//GEN-LAST:event_text_searchFocusGained

    private void text_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_searchFocusLost
        // TODO add your handling code here:
        if (text_search.getText().equals("")) {
            text_search.setText(" Search");
        }
    }//GEN-LAST:event_text_searchFocusLost

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:
        Profile pf = new Profile();
        pf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_profileActionPerformed

    private void addTopic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTopic1ActionPerformed
        // TODO add your handling code here:
        Post p = new Post();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addTopic1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeShowPostList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeShowPostList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeShowPostList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeShowPostList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeShowPostList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommunityForum;
    private javax.swing.JButton addTopic1;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmutt;
    private javax.swing.JLabel lb_kmutt;
    private javax.swing.JPanel line;
    private javax.swing.JPanel line2;
    private javax.swing.JButton logout;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel nav2;
    private javax.swing.JPanel panelBG;
    private javax.swing.JPanel panelBar;
    private javax.swing.JLabel pic_book;
    private javax.swing.JButton profile;
    private javax.swing.JButton search;
    private javax.swing.JPanel showPostList;
    private javax.swing.JTextField text_search;
    private javax.swing.JLabel topic;
    // End of variables declaration//GEN-END:variables
}
