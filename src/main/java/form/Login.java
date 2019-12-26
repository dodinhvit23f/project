/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import common.Constant.FilePath;

/**
 *
 * @author LTC
 */
//File file =new File(FilePath.URL+"\\src\\main\\java\\Text\\UserName.txt");
//File file1 =new File(FilePath.URL+"\\src\\main\\java\\Text\\Role.txt");
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();        
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jButton3.setBackground(new java.awt.Color(0, 204, 153));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton3.setText("Login");
        jButton3.setInheritsPopupMenu(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("User Name:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jCheckBox2.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBox2.setText("Remember me");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("JavaProject2");

        jButton5.setBackground(new java.awt.Color(0, 204, 153));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton5.setText("Change Password");
        jButton5.setInheritsPopupMenu(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Password:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jPasswordField2))
                        .addGap(50, 50, 50))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton5)
                .addGap(9, 9, 9)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        try {
//          	File file =new File(FilePath.URL+"\\src\\main\\java\\Text\\t1.txt");
//            Scanner sc = new Scanner(file);
//            List<String> UserList = new ArrayList<String>();
//            while (sc.hasNextLine()){
//                UserList.add(sc.nextLine());
//            }
//            Connection conn = null;
//            Statement stm = null;
//            ResultSet rsl = null;
//            Users u = new Users();
//            if(UserList.contains(jTextField2.getText())&& !jTextField2.getText().isEmpty() ){
//                try{
//                    conn = ConnnectionUtil.getConnection();
//                    stm = conn.createStatement();
//                    rsl = stm.executeQuery("select * from users where name='"+jTextField2.getText()+"'");
//                    if(rsl.next()){
//                        this.hide();
//                        new Home( rsl.getString("name"),rsl.getString("role")).show();
//                       	File path =new File(FilePath.URL+"\\src\\main\\java\\Text\\UserName.txt");
//                        //File file1 =new File(FilePath.URL+"\\src\\main\\java\\Text\\Role.txt");
//                        try {
//                            if(!path.exists()){
//
//                                path.createNewFile();
//                            }
//                            String content =rsl.getString("name")+"\n";
//                            FileWriter fw = new FileWriter(path.getAbsoluteFile());
//                            BufferedWriter bw = new BufferedWriter(fw);
//                            if(!content.isEmpty()){
//                                bw.write(content);
//                            }
//                            bw.close();
//                            // ghi role vao` file
//                          	File path1 =new File(FilePath.URL+"\\src\\main\\java\\Text\\Role.txt");
//                            if(!path1.exists()){
//
//                                path1.createNewFile();
//                            }
//                            String content1 =rsl.getString("role")+"\n";
//                            FileWriter fw1 = new FileWriter(path1.getAbsoluteFile());
//                            BufferedWriter bw1 = new BufferedWriter(fw1);
//                            if(!content1.isEmpty()){
//                                bw1.write(content1);
//                            }
//                            bw1.close();
//                        }catch (IOException ex) {
//                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                }catch(Exception e){
//                }finally{
//                    if(stm != null){
//                        try {
//                            stm.close();
//                        } catch (SQLException ex) {
//                            Logger.getLogger(UserList.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                }
//
//            }else{
//                try{
//                    conn = ConnnectionUtil.getConnection();
//                    stm = conn.createStatement();
//                    rsl = stm.executeQuery("select * from users where name='"+jTextField2.getText()+"' and pwd='"+jPasswordField2.getText()+"'");
//
//                    if(rsl.next() && rsl.first()){
//                        if(jCheckBox2.isSelected()){
//                          	File path =new File(FilePath.URL+"\\src\\main\\java\\Text\\t1.txt");
//                            // if file doesnt exists, then create it
//                            if (!path.exists()) {
//                                path.createNewFile();
//                            }
//                            String content =jTextField2.getText()+"\n";
//                            FileWriter fw = new FileWriter(path.getAbsoluteFile(),true);
//                            BufferedWriter bw = new BufferedWriter(fw);
//                            bw.write(content);
//                            bw.close();
//                        }
//                        this.hide();
//                        new Home(rsl.getString("name"),rsl.getString("role")).show();
//                      	File path =new File(FilePath.URL+"\\src\\main\\java\\Text\\UserName.txt");
//                        try {
//                            if(!path.exists()){
//
//                                path.createNewFile();
//                            }
//                            String content =rsl.getString("name")+"\n";
//                            FileWriter fw = new FileWriter(path.getAbsoluteFile());
//                            BufferedWriter bw = new BufferedWriter(fw);
//                            if(!content.isEmpty()){
//                                bw.write(content);
//                            }
//                            bw.close();
//                            // ghi role vao` file
//                          	File path1 =new File(FilePath.URL+"\\src\\main\\java\\Text\\Role.txt");
//                            if(!path1.exists()){
//
//                                path1.createNewFile();
//                            }
//                            String content1 =rsl.getString("role")+"\n";
//                            FileWriter fw1 = new FileWriter(path1.getAbsoluteFile());
//                            BufferedWriter bw1 = new BufferedWriter(fw1);
//                            if(!content1.isEmpty()){
//                                bw1.write(content1);
//                            }
//                            bw1.close();
//                        }catch (IOException ex) {
//                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }else{
//                        JOptionPane.showMessageDialog(rootPane, "Something's wrong");
//                    }
//                }catch(Exception e){
//                }finally{
//                    if(stm != null){
//                        try {
//                            stm.close();
//                        } catch (SQLException ex) {
//                            Logger.getLogger(UserList.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                }
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
        NewJFrame a = new NewJFrame();
        a.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new ChangePwd().show();
    }//GEN-LAST:event_jButton5ActionPerformed
    Home h = new Home();

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField2;
    public javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
