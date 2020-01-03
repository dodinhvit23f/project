/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import common.Connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
//import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author HaiDao
 */
public class menu extends javax.swing.JFrame {
    List<menus>MenuList = new ArrayList<menus>();
   long count,sotrang,trang =1;
    int id_bill;
    double Total=0;
    Locale localeVN = new Locale("vi", "VN");
    NumberFormat vn = NumberFormat.getInstance(localeVN);
    List<Choose_detail>Choose = new ArrayList<Choose_detail>();
    Random r = new Random( System.currentTimeMillis() );
    int rand_id = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd ");
     LocalDateTime now = LocalDateTime.now();
    DefaultTableModel model;
      DefaultTableModel model1;
      DefaultTableModel model2;
    
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
         this.setLocationRelativeTo(null);
        model = (DefaultTableModel) jTable1.getModel();   
        model1 = (DefaultTableModel) jTable2.getModel();
        model2 = (DefaultTableModel) jTable3.getModel();      
        CountDB();
        if(count % 5 == 0){
            sotrang = count/5;
        }else{
         sotrang = count/5+1;
        }
        LoadData(trang);
        jLabel6.setText("1/"+sotrang);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("available products");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Best Seller");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "Quantities", "Price", "Exp Date"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel1.setText("MENU");

        jButton4.setBackground(new java.awt.Color(0, 255, 204));
        jButton4.setText("Clear selected product");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText(">>>>");

        jLabel9.setText("Phone:");

        jButton9.setBackground(new java.awt.Color(0, 255, 204));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jTextField1ComponentRemoved(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 204));
        jButton3.setText("clear all");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 255, 204));
        jButton5.setText("<<");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Name:");

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 255, 204));
        jButton6.setText(">>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 204));
        jButton2.setText("View Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 255, 204));
        jButton7.setText("<");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "quantities", "price", "total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton8.setBackground(new java.awt.Color(0, 255, 204));
        jButton8.setText(">");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Total:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "quantities", "price", "Exp"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("sdsd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(167, 167, 167))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    	   jLabel3.setText(vn.format(Total)+" VND");
    	Connection connect = null;
    	connect = Connect.createConnection();
    	try {
            for(int i = 0; i<3;i++){
    		Statement statement = connect.createStatement();
            String query = " Select products.Id, products.Name ,products.Quantities,products.PriceOut,products.ExpDate from products where products.Id = (Select bills_detail.ProId from bills_detail group by ProId order by SUM(Quantities) DESC limit "+i+",1) ";
            ResultSet result = statement.executeQuery(query);   
            while(result.next()) {
            	int Id = result.getInt("Id");
            	String Name = result.getString("Name");
            	double Price = result.getDouble("PriceOut");
            	int Quantities = result.getInt("Quantities");
            	String date = result.getString("ExpDate");
            	 model2.addRow(new Object[]{
                         Id,Name,Quantities,Price,date
                         });
            }
            }
    	}catch(Exception e){
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if(connect != null){
                try {
                    connect.close();
                } catch (SQLException ex) {
                    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
    	
           
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Choose_detail c = new Choose_detail();
        int quantities= 0;
        int row =jTable1.getSelectedRow();
        int soluong = Integer.parseInt(String.valueOf(model.getValueAt(row, 2)));
        String check ="";
        boolean done = false;
        while(!done){
            try{
                check=  JOptionPane.showInputDialog("Quantities:");
                quantities = Integer.valueOf(check);
                if(quantities==0){
                    showMessageDialog(null, "Quantities cannot be 0");
                    return;
                }
                if(quantities >= soluong){
                    showMessageDialog(null, "khong du so luong");
                    return;
                }
                if(quantities <0){
                showMessageDialog(null, "khong duoc nho hon 0");
                    return;
                }
                done = true;
            }catch(Exception e){
                if (check != null){
                    showMessageDialog(null, "Quantities must be number");

                }else{
                    return;
                }
            }
        }
        if(done == true){
            c.id = Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0)));
            c.name = String.valueOf(jTable1.getValueAt(row, 1));
            c.Quantities = quantities;
            c.Price = Double.valueOf(String.valueOf(jTable1.getValueAt(row,3)));
            c.Total = c.Price *c.Quantities;
            Choose.add(c);
            model.setValueAt(soluong - c.Quantities , row, 2);
            model1.addRow(new Object[]{
                c.getId(),c.getName(),c.getQuantities(),c.getPrice(),c.getTotal()
            });
            Total += c.Total;

            jLabel3.setText(vn.format(Total)+" VND");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
        if(row != -1) {
            String Name =(String) jTable2.getValueAt(row, 1);
            double totalPrice = (double)jTable2.getValueAt(row, 4);
            int opsion = JOptionPane.showConfirmDialog(null, "delete the selected product?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(opsion == 0) {
                Choose.removeIf(product -> product.name.equals(Name));
                model1.removeRow(row);

                Total -= totalPrice;

                jLabel3.setText(vn.format(Total)+" VND");
            }else {
                return;
            }
        }else {
            showMessageDialog(null, "Chua chon san pham");
            return;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new ShowBills().show();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextField1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ComponentRemoved

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int opsion = JOptionPane.showConfirmDialog(null, "delete all product in your cart?", "Confirm", JOptionPane.YES_NO_OPTION);
        if(opsion == 0) {
            Choose.removeAll(Choose);
            for(int i = model1.getRowCount()-1;i>=0;i--){
                model1.removeRow(i);
                Total = 0;
                jLabel3.setText("0 VND");
            }
        }else {
            return;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        trang = 1;
        LoadData(trang);
        jLabel6.setText(String.valueOf(trang)+"/"+ sotrang);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name_Search = jTextField1.getText();
        if(name_Search != "") {
            MenuList.removeAll(MenuList);
            for(int i = model.getRowCount()-1;i>=0;i--){
                model.removeRow(i);
            }
            Connection connect = null;
            try{
                connect = Connect.createConnection();
                Statement statement = connect.createStatement();
                String  query = " Select * from products where Name like '%"+name_Search+"%'";
                ResultSet result = statement.executeQuery(query);
                while(result.next()){
                    int id = result.getInt("Id");
                    String name = result.getString("Name");
                    double PriceIn = result.getDouble("PriceIn");
                    double PriceOut = result.getDouble("PriceOut");
                    int Quantities = result.getInt("Quantities");
                    String ImportDate = result.getString("ImportDate");
                    String ExpDate = result.getString("ExpDate");
                    String url = result.getString("Url");
                    menus m = new menus();
                    m.setId(id);
                    m.setName(name);
                    m.setQuantities(Quantities);
                    m.setPriceIn(PriceIn);
                    m.setPriceOut(PriceOut);
                    m.setImportDate(ImportDate);
                    m.setExpDate(ExpDate);
                    m.setUrl(url);
                    MenuList.add(m);
                }
                showall();
            }catch(Exception e){
            }finally{
                if(connect != null){
                    try {
                        connect.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }else {
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        trang = sotrang;
        LoadData(trang);
        jLabel6.setText(String.valueOf(trang)+"/"+ sotrang);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name = jTextField2.getText();
        String phone = jTextField3.getText();

        Connection connect = null;
        boolean check = Choose.isEmpty();
        String date = dtf.format(now);
        System.out.println(date);
        try{
            connect = Connect.createConnection();
            Statement statement = connect.createStatement();
            if(name == "" && phone == ""){
                statement.executeUpdate("insert into bills(mem_id,Date)values(null,'"+date+"')");
            }else{
                statement.executeUpdate("insert into bills(mem_id,Date)values((SELECT members.ID from members where Name = '"+name+"' and PhoneNumber = '"+phone+"'),'"+date+"')");

            }
            if(check == true){
                showMessageDialog(null, "Nothing in your cart");
                return;
            }else{
                for(Choose_detail c : Choose){

                    statement.executeUpdate("insert into bills_detail(bill_id,Quantities,Addresss,ReceiveDate,DisCount,ProId)values((SELECT MAX(id) FROM bills),"+c.Quantities+",null,null,null,"+c.id+")");
                }
            }
        }catch(Exception e){
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if(connect != null){
                try {
                    connect.close();
                } catch (SQLException ex) {
                    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.setVisible(false);
        Bill bill = new Bill(name,phone);
        bill.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(trang>1){
            trang --;
            LoadData(trang);
            jLabel6.setText(String.valueOf(trang)+"/"+ sotrang);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(trang<sotrang){
            trang++;
            LoadData(trang);
            jLabel6.setText(String.valueOf(trang)+"/"+ sotrang);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        Choose_detail c = new Choose_detail();
        int quantities= 0;
        int row =jTable3.getSelectedRow();
        int soluong = (Integer)model2.getValueAt(row, 2);
        String check ="";
        boolean done = false;
        while(!done){
            try{
                check=  JOptionPane.showInputDialog("Quantities:");
                quantities = Integer.valueOf(check);
                if(quantities==0){
                    showMessageDialog(null, "Quantities cannot be 0");
                    return;
                }
                done = true;
            }catch(Exception e){
                if (check != null){
                    showMessageDialog(null, "Quantities must be number");

                }else{
                    return;
                }
            }
        }

        c.id = Integer.valueOf(String.valueOf(jTable3.getValueAt(row, 0)));
        c.name = String.valueOf(jTable3.getValueAt(row, 1));
        c.Quantities = quantities;
        c.Price = Double.valueOf(String.valueOf(jTable3.getValueAt(row,3)));
        c.Total = c.Price *c.Quantities;
        model2.setValueAt(soluong - c.Quantities, row, 2);
        Choose.add(c);
        model1.addRow(new Object[]{
            c.getId(),c.getName(),c.getQuantities(),c.getPrice(),c.getTotal()
        });

        Total+= c.Total;

        jLabel3.setText(vn.format(Total)+" VND");
    }//GEN-LAST:event_jTable3MouseClicked
       
    public void showall(){    
        for(int i = 0;i<MenuList.size();i++){
              // jTable1.setRowHeight(jTable1.getRowHeight()+1);
                menus m=MenuList.get(i);
                model.addRow(new Object[]{
                m.getId(),m.getName(),m.getQuantities(),m.getPriceOut(),m.getExpDate()
                });
        }
    }
     private void CountDB() {
           Connection connect = null;
        try {
            connect = Connect.createConnection();
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT count(*) from products");
            while(rs.next()){
            count = rs.getLong(1);
            }
            rs.close();
            statement.close();
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void LoadData(long trang){
         MenuList.removeAll(MenuList);
         for(int i = model.getRowCount()-1;i>=0;i--){
        model.removeRow(i);
        }
       Connection connect = null;
       long soluong = trang *5 -5;
        try{
 connect = Connect.createConnection();
            Statement statement = connect.createStatement();           
          String  query = " Select * from products limit "+soluong+" ,5  ";           
            ResultSet result = statement.executeQuery(query);            
            while(result.next()){ 
            int id = result.getInt("Id");
            String name = result.getString("Name");
            double PriceIn = result.getDouble("PriceIn");
            double PriceOut = result.getDouble("PriceOut");
            int Quantities = result.getInt("Quantities");
            String ImportDate = result.getString("ImportDate");
            String ExpDate = result.getString("ExpDate");
            String url = result.getString("Url");
            menus m = new menus();
            m.setId(id);
            m.setName(name);
            m.setQuantities(Quantities);
            m.setPriceIn(PriceIn);
            m.setPriceOut(PriceOut);
            m.setImportDate(ImportDate);
            m.setExpDate(ExpDate);
            m.setUrl(url);
            MenuList.add(m);
            }      
            showall();
 }catch(Exception e){
 }finally{
            if(connect != null){
                try {
                    connect.close();
                } catch (SQLException ex) {
                    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }  
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

   
}
