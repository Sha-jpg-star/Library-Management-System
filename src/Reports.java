import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author shali
 */
public class Reports extends javax.swing.JFrame {

    Connection con;
PreparedStatement pst;
ResultSet rs;
    public Reports() {
        initComponents();
        con = DbConnect.getConnection(); 
        tableload();
    }
public void tableload(){
        try{
            String sql="SELECT  book_id, member_id, genre, book_name, member_name, price, total_price FROM lost_books";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            Table5.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table5 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCate = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Bookname = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        BID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MemberName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 51)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("EduLib Manager");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Add & Manage Books");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton1.setPreferredSize(new java.awt.Dimension(2, 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Issue Book");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton3.setPreferredSize(new java.awt.Dimension(2, 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Return Book");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton4.setPreferredSize(new java.awt.Dimension(2, 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Manage Members");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton5.setPreferredSize(new java.awt.Dimension(2, 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 40));

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Reports");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton6.setPreferredSize(new java.awt.Dimension(2, 2));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, 40));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Logout");
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton7.setPreferredSize(new java.awt.Dimension(2, 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 660));

        jLabel2.setBackground(new java.awt.Color(255, 0, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Reports");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 80, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Member ID", "Member Name", "Genre/Category", "Price", "Total +Tax"
            }
        ));
        Table5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Table5);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 780, 310));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Member Name :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 100, 30));

        jLabel3.setBackground(new java.awt.Color(255, 164, 45));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Book ID :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 30));

        jLabel4.setBackground(new java.awt.Color(255, 204, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Book Name :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        cmbCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science and Technology", "Literature and Language", "Social Science", "Education and Academic", "Religion and Philosophy", "Hobbies and others", "IT and Programming", "Arts and Culture" }));
        jPanel2.add(cmbCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 180, 30));

        jLabel7.setBackground(new java.awt.Color(255, 204, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Total Price  + Fine (Rs.10) :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 30));
        jPanel2.add(Bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 130, 30));
        jPanel2.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 180, 30));
        jPanel2.add(BID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 22, 130, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Member ID :");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 90, 30));
        jPanel2.add(MID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 140, 30));

        jLabel9.setBackground(new java.awt.Color(255, 204, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Genre/Category :");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 100, 30));
        jPanel2.add(MemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 140, 30));

        jLabel10.setBackground(new java.awt.Color(255, 204, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Price :");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 40, 30));

        Total.setText("auto cal.....");
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        jPanel2.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 210, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 140, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 800, 520));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("If Member Fail to Return Book on Due Date  (Lost Book)......");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 800, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new logout().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Dashboard().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ManageBooks().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ReturnBooks().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new ManageMembers().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String bookId = BID.getText();
String memberId = MID.getText();
String category = cmbCate.getSelectedItem().toString(); 
String bookName = Bookname.getText();
String memberName = MemberName.getText();
String priceStr = Price.getText();


if (bookId.isEmpty() || memberId.isEmpty() || bookName.isEmpty() || memberName.isEmpty() || priceStr.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please fill in all fields!");
    return;
}


double bookPrice = 0.0;
try {
    bookPrice = Double.parseDouble(priceStr);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Invalid Book Price!");
    return;
}


double fine = 10.0;
double totalPrice = bookPrice + fine;


DefaultTableModel model = (DefaultTableModel) Table5.getModel();
model.addRow(new Object[]{
    bookId,
    memberId,
    category,
    bookName,
    memberName,
    bookPrice,
    totalPrice
});


try {
    Connection con = DbConnect.getConnection();
    String sql = "INSERT INTO lost_books (book_id, member_id, genre, book_name, member_name, price, total_price) VALUES (?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, bookId);
    pst.setString(2, memberId);
    pst.setString(3, category);
    pst.setString(4, bookName);
    pst.setString(5, memberName);
    pst.setDouble(6, bookPrice);
    pst.setDouble(7, totalPrice);

    pst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Lost book added to database successfully!");
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
}


BID.setText("");
MID.setText("");
cmbCate.setSelectedIndex(0);
Bookname.setText("");
MemberName.setText("");
Price.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BID;
    private javax.swing.JTextField Bookname;
    private javax.swing.JTextField MID;
    private javax.swing.JTextField MemberName;
    private javax.swing.JTextField Price;
    private javax.swing.JTable Table5;
    private javax.swing.JTextField Total;
    private javax.swing.JComboBox<String> cmbCate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
