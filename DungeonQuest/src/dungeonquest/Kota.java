/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonquest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author Hamba Allah
 */
public class Kota extends javax.swing.JFrame {

    /**
     * Creates new form Kota
     */
    Main m = new Main();
    public static int ivn = 0;
    public static int shp = 0;
    public static int dgn = 0;
    public static int fgt = 0;

    public Kota() {

        initComponents();
        setText();
        this.setLocationRelativeTo(null);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(setTXT, 0, 1, TimeUnit.SECONDS);
    }

    public void setText() {
        int i = m.player[0];
        jLabel8.setText(String.valueOf(m.player[1]) + '/' + String.valueOf(m.health[i - 1]));
        jLabel9.setText(String.valueOf(i));
        jLabel10.setText(String.valueOf(m.player[2]) + '/' + String.valueOf(m.exp[i-1]));
        jLabel11.setText(String.valueOf(m.player[7]));
        jLabel12.setText(String.valueOf(m.player[3] + m.weapon[m.player[5]][0]));
        jLabel13.setText(String.valueOf(m.player[4] + m.armor[m.player[6]][1]));
        if(fgt==1){
            this.dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(627, 410));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\asset\\Tombol\\image.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon("E:\\asset\\Tombol\\SaveGame.png")); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 157, 368);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Health: ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Level: ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EXP: ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gold:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ATK: ");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DEF: ");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("100/100");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("1");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("0/100");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("0");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("10");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("10");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(149, 288, 460, 80);

        jButton1.setIcon(new javax.swing.ImageIcon("E:\\asset\\Tombol\\Shop.png")); // NOI18N
        jButton1.setText("SHOP");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 40, 160, 70);

        jButton2.setIcon(new javax.swing.ImageIcon("E:\\asset\\Tombol\\Inventory.png")); // NOI18N
        jButton2.setText("INVENTORY");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 190, 160, 70);

        jButton3.setText("Keluar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(510, 230, 80, 30);

        jButton5.setIcon(new javax.swing.ImageIcon("E:\\asset\\Tombol\\Dungeon.png")); // NOI18N
        jButton5.setText("DUNGEON");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(430, 40, 160, 70);

        jLabel14.setIcon(new javax.swing.ImageIcon("E:\\asset\\Floor\\kota.jpeg")); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 610, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Dungeon dg = new Dungeon();
        if (ivn == 0 && shp == 0 && fgt == 0 && dgn == 0) {
            dg.setVisible(true);
            dgn = 1;
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Inventory in = new Inventory();
        if (ivn == 0 && shp == 0 && fgt == 0 && dgn == 0) {
            in.setVisible(true);
            ivn = 1;
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Shop sp = new Shop();
        if (ivn == 0 && shp == 0 && fgt == 0 && dgn == 0) {
            sp.setVisible(true);
            shp = 1;
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        koneksi kon = new koneksi();
        kon.saveGame();
    }//GEN-LAST:event_jButton4MouseClicked

    Runnable setTXT = new Runnable() {
        @Override
        public void run() {
            setText();
        }
    };

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
            java.util.logging.Logger.getLogger(Kota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
