/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.ConnectDB;
import com.sun.tools.javac.Main;
import javax.swing.*;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import View.FormQuanLyPT;
/**
 *
 * @author hoang
 */
public class DangNhapUI extends javax.swing.JFrame {

    /**
     * Creates new form DangNhapUI
     */
    public DangNhapUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        txt_Pass = new javax.swing.JPasswordField();
        btn_Login = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_dangky = new javax.swing.JButton();
        chk_rememberme = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");
        setName("FormDangNhap"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Password:");

        txt_Username.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txt_Pass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btn_Login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Login(evt);
            }
        });

        btn_Reset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Bạn chưa đã có tài khoản ?");

        btn_dangky.setText("Đăng ký ngay");
        btn_dangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangkyActionPerformed(evt);
            }
        });

        chk_rememberme.setText("Lưu mật khẩu");
        chk_rememberme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_remembermeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(358, 358, 358))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_dangky))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                                .addComponent(txt_Pass))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(chk_rememberme)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(chk_rememberme)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Login)
                    .addComponent(btn_Reset))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_dangky))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Login
        String username = txt_Username.getText();
        String password = new String(txt_Pass.getPassword());

        ConnectDB cn = new ConnectDB();
        
        try{
            Connection conn = cn.getConnection();
            String sql = "select * from account where username='" + username + "' and password='"+password+"'";
            PreparedStatement pst = conn.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                if(rs.getInt("Rol") == 0){
                 FormQuanLyPT ql = new FormQuanLyPT();
                 
                 ql.setVisible(true);
                 
                  this.dispose();
                }else{
                    FormXemPhuongTien formuser = new FormXemPhuongTien();
                    formuser.setVisible(true);
                    this.dispose();
                }
            } if(chk_rememberme.isSelected()){
            JOptionPane.showMessageDialog(this,"Bạn đã lưu mật khẩu !");
        }
            else
            {
                JOptionPane.showMessageDialog(this, "Sai tai khoan hoac mat khau!");
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_btn_Login

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        txt_Username.setText("");
        txt_Pass.setText("");
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_dangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangkyActionPerformed
        // TODO add your handling code here:
        DangKyUI dk  = new DangKyUI();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_dangkyActionPerformed

    private void chk_remembermeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_remembermeActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_chk_remembermeActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DangNhapUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_dangky;
    private javax.swing.JCheckBox chk_rememberme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables

    void setName(JTextField txt_username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
