/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonquest;

import java.awt.Image;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Hamba Allah
 */
public class dialogFrm extends javax.swing.JFrame {

    int i = 1;
    Kota k = new Kota();
    Main m = new Main();
    Prolog p = new Prolog();

    /**
     * Creates new form dialogFrm
     */
    public dialogFrm() {
        initComponents();
        pilih();
        this.setLocationRelativeTo(null);
    }

    public void pilih() {
        if (m.newGame == 1) {
            newDialog();
        } else {
            endDialog();
        }
    }
    
    public void endDialog(){
        if(i==1){
            jLabel1.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("<html>Guderian: Tch! Seperti yang kuharapkan dari penjaga lantai 5 haha<br>Mengalahkanmu benar-benar memerlukan waktu");
        }else if(i==2){
            jLabel1.setIcon(null);
            jLabel2.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("Minotaur: heh...gelar pahlawan sepertinya bukan omong kosong");   
        }else if(i==3){
            jLabel2.setIcon(null);
            jLabel1.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("Guderian: Tentu saja !");  
        }else if(i==4){
            jLabel1.setIcon(null);
            jLabel2.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("<html>Minotaur: tetapi jangan besar kepala dulu wahai pahlawan,<br> mengalahkan aku hanyalah awal dari petualanganmu di Dungeon ini");           
        }else if(i==5){
            jLabel2.setIcon(null);
            jLabel1.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("Guderian: heh...aku hanya perlu berlatih dan mengalahkan mereka semua bukan ?");              
        }else if(i==6){
            jLabel1.setIcon(null);
            jLabel2.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("<html>Minotaur: hahaha tetaplah berharap wahai pahlawan,<br> sebentar lagi kau akan segera merasakan kengerian dari duenguon ini ! HAHAHAHA--");                       
        }else if(i==7){
            jLabel2.setIcon(null);
            jLabel1.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("<html>Guderian: haha, 95 lantai lagi ya, benar-benar perjalanan yg panjang<br>padahal aku cuma ingin tidur");                               
        }else{
            p.setVisible(true);
            this.dispose();
        }
    }
    
    public void newDialog() {
        if (i == 1) {
            jLabel1.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("Guderian: Dimana aku ?");
        } else if (i == 2) {
            jLabel1.setIcon(null);
            jLabel2.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("<html>???: Oohhh, Selamat datang di Geabrande wahai engkau yang telah dipanggil dari dunia yang jauh !<br>Tolong pinjamkan kekuatanmu & taklukkan Dungeon serta Raja Iblis yang bersarang di dalamnya !</html>");
        } else if (i == 3) {
            jLabel2.setIcon(null);
            jLabel1.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("Guderian: Apa-apaan ini ? menyelamatkan dunia lagi ?! dan yang terpenting, Siapa kau ? ");

        } else if (i == 4) {
            jLabel1.setIcon(null);
            jLabel2.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("<html>Raja: Sebelumnya perkenalkan, aku adalah Raja yang memimpin Geabrande ini.<br> Siapa namamu wahai orang yang terpilih ?");

        } else if (i == 5) {
            jLabel2.setIcon(null);
            jLabel1.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("Guderian: Aku adalah Guderian !");

        } else if (i == 6) {
            jLabel1.setIcon(null);
            jLabel2.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\Image.png").getImage().getScaledInstance(130, 123, Image.SCALE_DEFAULT)));
            lblDialog.setText("<html>Raja: Baiklah Guderian, untuk menguji kekuatanmu. Pergilah ke Duengeon hingga lantai tempat salah<br>satu pasukan raja iblis yg terbilang kuat. Pergilah kesana, buktikan bahwa kau adalah orang yg terpilih untuk membunuh raja iblis");

        } else {
            m.newGame = 0;
            k.setVisible(true);
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

        jButton1 = new javax.swing.JButton();
        lblDialog = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(635, 323));

        jButton1.setText("Lanjut");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        lblDialog.setText(".....");

        jLabel1.setMaximumSize(new java.awt.Dimension(90, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(84, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 491, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDialog)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDialog)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

//        try {
//            // TODO add your handling code here:
//            String data = readFileAsString("E:\\dialogtes.txt");
//            String[] dialog = data.split("\\|");
//            jLabel1.setIcon(new ImageIcon(new ImageIcon("E:\\asset\\Tombol\\image.png").getImage().getScaledInstance(147, 145, Image.SCALE_DEFAULT)));
//            if (i < dialog.length) {
//                lblDialog.setText(dialog[i]);
//                i++;
//            } else {
//                dispose();
//                new Kota().setVisible(true);
//            }
//
//        } catch (Exception ex) {
//            Logger.getLogger(dialogFrm.class.getName()).log(Level.SEVERE, null, ex);
//        }
        i += 1;
        pilih();

    }//GEN-LAST:event_jButton1MouseClicked

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
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
            java.util.logging.Logger.getLogger(dialogFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dialogFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDialog;
    // End of variables declaration//GEN-END:variables
}
