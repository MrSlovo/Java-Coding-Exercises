import java.awt.Dimension;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
   private String email;
    public Admin(String email) {
        initComponents();
        this.setMinimumSize(new Dimension(1198, 800));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeading = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lbAdminPage = new javax.swing.JLabel();
        lblLinkRackets = new javax.swing.JLabel();
        lblLinkBalls = new javax.swing.JLabel();
        lblLinkCaps = new javax.swing.JLabel();
        lblLinkStrings = new javax.swing.JLabel();
        lblLinkBags = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlHeading.setBackground(new java.awt.Color(0, 102, 153));

        lblMinimize.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setText("-");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("x");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        lbAdminPage.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbAdminPage.setForeground(new java.awt.Color(239, 128, 47));
        lbAdminPage.setText("Admin Page");

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addComponent(lbAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdminPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pnlHeading);
        pnlHeading.setBounds(0, 0, 1200, 84);

        lblLinkRackets.setBackground(new java.awt.Color(0, 102, 102));
        lblLinkRackets.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLinkRackets.setText("Click here to manage Rackets");
        lblLinkRackets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkRackets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkRacketsMouseClicked(evt);
            }
        });
        getContentPane().add(lblLinkRackets);
        lblLinkRackets.setBounds(10, 190, 330, 30);

        lblLinkBalls.setBackground(new java.awt.Color(0, 102, 102));
        lblLinkBalls.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLinkBalls.setText("Click here to manage balls");
        lblLinkBalls.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkBalls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkBallsMouseClicked(evt);
            }
        });
        getContentPane().add(lblLinkBalls);
        lblLinkBalls.setBounds(10, 400, 290, 30);

        lblLinkCaps.setBackground(new java.awt.Color(0, 102, 102));
        lblLinkCaps.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLinkCaps.setText("Click here to manage caps");
        lblLinkCaps.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkCaps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkCapsMouseClicked(evt);
            }
        });
        getContentPane().add(lblLinkCaps);
        lblLinkCaps.setBounds(340, 640, 290, 30);

        lblLinkStrings.setBackground(new java.awt.Color(0, 102, 102));
        lblLinkStrings.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLinkStrings.setText("Click here to manage strings");
        lblLinkStrings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkStrings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkStringsMouseClicked(evt);
            }
        });
        getContentPane().add(lblLinkStrings);
        lblLinkStrings.setBounds(850, 220, 310, 30);

        lblLinkBags.setBackground(new java.awt.Color(0, 102, 102));
        lblLinkBags.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLinkBags.setText("Click here to manage bags");
        lblLinkBags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkBags.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkBagsMouseClicked(evt);
            }
        });
        getContentPane().add(lblLinkBags);
        lblLinkBags.setBounds(860, 400, 290, 40);

        lblBackground.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBackground.setForeground(new java.awt.Color(255, 102, 102));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesForPAT/med.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 80, 1200, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);//minimizes the screen
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblLinkRacketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkRacketsMouseClicked
        new RacketsInfoAdmin(email).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lblLinkRacketsMouseClicked

    private void lblLinkBallsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkBallsMouseClicked
               new BallsInfoAdmin(email).setVisible(true); 
    }//GEN-LAST:event_lblLinkBallsMouseClicked

    private void lblLinkCapsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkCapsMouseClicked
                new CapsInfoAdmin(email).setVisible(true); 
    }//GEN-LAST:event_lblLinkCapsMouseClicked

    private void lblLinkStringsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkStringsMouseClicked
                new StringsInfoAdmin(email).setVisible(true); 
    }//GEN-LAST:event_lblLinkStringsMouseClicked

    private void lblLinkBagsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkBagsMouseClicked
        new BagsInfoAdmin(email).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lblLinkBagsMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbAdminPage;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLinkBags;
    private javax.swing.JLabel lblLinkBalls;
    private javax.swing.JLabel lblLinkCaps;
    private javax.swing.JLabel lblLinkRackets;
    private javax.swing.JLabel lblLinkStrings;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel pnlHeading;
    // End of variables declaration//GEN-END:variables
}