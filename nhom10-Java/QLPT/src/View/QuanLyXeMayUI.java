/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ConnectDB;
import Model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoang
 */
public class QuanLyXeMayUI extends javax.swing.JFrame {
    private ArrayList<Vehicle> list;
    DefaultTableModel model;
    /**
     * Creates new form QuanLyXeMayUI
     */
    public QuanLyXeMayUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        list = new ConnectDB().showXeMay();
        model = (DefaultTableModel) tbl_XeMay.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Ma Phuong Tien","Ten Phuong Tien","Hang San Xuat","Loai Phuong Tien","Nam San Xuat","Gia","Mau","Cong Suat"
        });
        showTableXeMay();
    }
    public void showTableXeMay(){
        for(Vehicle v:list){
            model.addRow(new Object[]{
                v.getVehicleId(),v.getVehicleName(),v.getMaker(),v.getVehType(),v.getYear(),v.getUnitPrice(),v.getColor(),v.getWattage()
            });
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_MaPT = new javax.swing.JTextField();
        txt_TenPT = new javax.swing.JTextField();
        txt_HangSX = new javax.swing.JTextField();
        txt_NamSX = new javax.swing.JTextField();
        txt_Gia = new javax.swing.JTextField();
        txt_Mau = new javax.swing.JTextField();
        txt_CongSuat = new javax.swing.JTextField();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_TroLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_XeMay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUAN LY XE MAY");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ma Phuong Tien:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ten Phuong Tien:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Hang San Xuat:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nam San Xuat:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Gia:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mau:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Cong Suat:");

        txt_MaPT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_TenPT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_HangSX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_NamSX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_Gia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_Mau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_CongSuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_Them.setText("Them");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setText("Sua");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setText("Xoa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_TimKiem.setText("Tim Kiem");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_TroLai.setText("Tro lai");
        btn_TroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TroLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_MaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_TenPT, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_HangSX, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_NamSX, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Mau, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_CongSuat, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_TroLai, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(btn_Sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_MaPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_TenPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_HangSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_NamSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Mau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_CongSuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them)
                    .addComponent(btn_Sua)
                    .addComponent(btn_Xoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_TimKiem)
                .addGap(39, 39, 39)
                .addComponent(btn_TroLai)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        tbl_XeMay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma Phuong Tien", "Ten Phuong Tien", "Hang San Xuat", "Loai Phuong Tien", "Nam San Xuat", "Gia", "Mau", "Cong Suat"
            }
        ));
        jScrollPane1.setViewportView(tbl_XeMay);
        if (tbl_XeMay.getColumnModel().getColumnCount() > 0) {
            tbl_XeMay.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbl_XeMay.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbl_XeMay.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbl_XeMay.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbl_XeMay.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(511, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(383, 383, 383))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        Vehicle v = new Vehicle();
        v.setVehicleId(txt_MaPT.getText());
        v.setVehicleName(txt_TenPT.getText());
        v.setMaker(txt_HangSX.getText());
        v.setYear(txt_NamSX.getText());
        v.setUnitPrice(txt_Gia.getText());
        v.setColor(txt_Mau.getText());
        v.setWattage(txt_CongSuat.getText());
        v.setVehType("xe máy");
        v.setSeatNum("");
        v.setEngineType("");
        v.setTonnage("");
        if(new ConnectDB().addVehicle(v)){
            JOptionPane.showMessageDialog(rootPane, "Them thanh cong!");
            list.add(v); // them vao danh sach SV
            showResult();
        } else{
            JOptionPane.showMessageDialog(rootPane, "Them that bai!");
        }
        
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        try{
            Vehicle v = new Vehicle();
            v.setVehicleId(txt_MaPT.getText());
            v.setVehicleName(txt_TenPT.getText());
            v.setMaker(txt_HangSX.getText());
            v.setYear(txt_NamSX.getText());
            v.setUnitPrice(txt_Gia.getText());
            v.setColor(txt_Mau.getText());
            v.setWattage(txt_CongSuat.getText());
            v.setVehType("xe máy");
            v.setSeatNum("");
            v.setEngineType("");
            v.setTonnage("");
            if(new ConnectDB().updateVehicle(v)){
                JOptionPane.showMessageDialog(rootPane, "Sua thanh cong!");
                this.setLocationRelativeTo(null);
                list = new ConnectDB().showXeMay();
                model = (DefaultTableModel) tbl_XeMay.getModel();
                model.getDataVector().removeAllElements();
                model.setColumnIdentifiers(new Object[]{
                    "Ma Phuong Tien","Ten Phuong Tien","Hang San Xuat","Loai Phuong Tien","Nam San Xuat","Gia","Mau","Cong Suat"
        });
                showTableXeMay();
            } else{
                JOptionPane.showMessageDialog(rootPane, "Sua that bai!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        try{
            if(new ConnectDB().deleteVehicle(txt_MaPT.getText())){
                JOptionPane.showMessageDialog(rootPane, "Xoa thanh cong!");
                this.setLocationRelativeTo(null);
                list = new ConnectDB().showXeMay();
                model = (DefaultTableModel) tbl_XeMay.getModel();
                model.getDataVector().removeAllElements();
                model.setColumnIdentifiers(new Object[]{
                    "Ma Phuong Tien","Ten Phuong Tien","Hang San Xuat","Loai Phuong Tien","Nam San Xuat","Gia","Mau","Cong Suat"
        });
                showTableXeMay();
            } else{
                JOptionPane.showMessageDialog(rootPane, "Xoa that bai!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        if(txt_MaPT.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ma phuong tien khong duoc de trong!");
            return;
        }
        
        try{
            ConnectDB cn = new ConnectDB();
            Vehicle v = cn.findXeMayById(txt_MaPT.getText());
            List<Vehicle> listVehicle = new ArrayList<>();
            listVehicle.add(v);
            showData(listVehicle);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Phuong tien khong tim thay!");
        }
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void btn_TroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TroLaiActionPerformed
        FormQuanLyPT ql = new FormQuanLyPT();
        ql.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_TroLaiActionPerformed
    
    int i = 1;

    public void showResult() {
        Vehicle v = list.get(list.size() - 1);
        model.addRow(new Object[]{
            v.getVehicleId(),v.getVehicleName(),v.getMaker(),v.getVehType(),v.getYear(),v.getUnitPrice(),v.getColor(),v.getWattage()
        });
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
            java.util.logging.Logger.getLogger(QuanLyXeMayUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyXeMayUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyXeMayUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyXeMayUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyXeMayUI().setVisible(true);
            }
        });
    }
    
    public void showData(List<Vehicle> v){
        List<Vehicle> listVehicle = new ArrayList<>();
        listVehicle = v;
        DefaultTableModel tableModel;
        tbl_XeMay.getModel();
        tableModel=(DefaultTableModel)tbl_XeMay.getModel();
        tableModel.setRowCount(0);
        listVehicle.forEach((vehicle)->{
            tableModel.addRow(new Object[]{
                vehicle.getVehicleId(),vehicle.getVehicleName(),vehicle.getMaker(),vehicle.getVehType(),vehicle.getYear(),vehicle.getUnitPrice(),vehicle.getColor(),vehicle.getWattage()
            });
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_TroLai;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_XeMay;
    private javax.swing.JTextField txt_CongSuat;
    private javax.swing.JTextField txt_Gia;
    private javax.swing.JTextField txt_HangSX;
    private javax.swing.JTextField txt_MaPT;
    private javax.swing.JTextField txt_Mau;
    private javax.swing.JTextField txt_NamSX;
    private javax.swing.JTextField txt_TenPT;
    // End of variables declaration//GEN-END:variables
}