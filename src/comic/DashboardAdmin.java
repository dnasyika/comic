/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comic;

import java.awt.event.ActionListener;

/**
 *
 * @author Acek
 */
public class DashboardAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DashboardAdmin
     */
    public DashboardAdmin() {
        initComponents();
    }
    
    public void listenerTombolTambah(ActionListener x) {
        jbAddKomik.addActionListener(x);
    }
    
    public void listenerManajemen(ActionListener x) {
        jbManDas.addActionListener(x);
    }
    
    public void listenerExit(ActionListener x) {
        Jbexit.addActionListener(x);
    }
    
    public void listenerLogout(ActionListener x) {
        jbLogout.addActionListener(x);
    }
    
    public void setToolTips(String x) {
        jbAddKomik.setToolTipText(x);
    }

    public void setToolTipsValidasi(String x) {
        jbValidasi.setToolTipText(x);
    }
    public void setToolTipsManDashboard(String x) {
        jbManDas.setToolTipText(x);
    }
    
    public void listenerValidasi(ActionListener x) {
        jbValidasi.addActionListener(x);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbAddKomik = new javax.swing.JButton();
        Jbexit = new javax.swing.JButton();
        jbLogout = new javax.swing.JButton();
        jbManDas = new javax.swing.JButton();
        jbValidasi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbAddKomik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/TombolMenuTambah.png"))); // NOI18N
        jbAddKomik.setBorderPainted(false);
        jbAddKomik.setContentAreaFilled(false);
        jbAddKomik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbAddKomik, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 150));

        Jbexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginAndReg/exit putih.png"))); // NOI18N
        Jbexit.setBorderPainted(false);
        Jbexit.setContentAreaFilled(false);
        Jbexit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/loginAndReg/exit hitam.png"))); // NOI18N
        getContentPane().add(Jbexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jbLogout.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jbLogout.setForeground(new java.awt.Color(255, 255, 255));
        jbLogout.setText("Log out");
        jbLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbLogout.setBorderPainted(false);
        jbLogout.setContentAreaFilled(false);
        jbLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 30));

        jbManDas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/TombolPengaturanDasbor.png"))); // NOI18N
        jbManDas.setBorderPainted(false);
        jbManDas.setContentAreaFilled(false);
        jbManDas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbManDas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbManDasActionPerformed(evt);
            }
        });
        getContentPane().add(jbManDas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        jbValidasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/TombolValidasi.png"))); // NOI18N
        jbValidasi.setBorderPainted(false);
        jbValidasi.setContentAreaFilled(false);
        jbValidasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbValidasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 150, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/DasborAdmin.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbManDasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbManDasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbManDasActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbexit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAddKomik;
    private javax.swing.JButton jbLogout;
    private javax.swing.JButton jbManDas;
    private javax.swing.JButton jbValidasi;
    // End of variables declaration//GEN-END:variables
}
