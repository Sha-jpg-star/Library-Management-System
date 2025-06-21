import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;



public class ManageBooks extends javax.swing.JFrame {

    Connection con;
PreparedStatement pst;
ResultSet rs;
    public ManageBooks() {
        initComponents();
        con = DbConnect.getConnection(); 
        tableload();
    }

    public void tableload(){
        try{
            String sql="SELECT book_id, member_id, book_name, category, issue_date, due_date FROM issued_books;";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bookID = new javax.swing.JTextField();
        Bookname = new javax.swing.JTextField();
        MemberID = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        cmdCate = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        issue = new com.toedter.calendar.JDateChooser();
        Due = new com.toedter.calendar.JDateChooser();

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

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
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
        jLabel2.setText("Libraray Management Dashboard");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 240, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 164, 45));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Book ID :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 30));

        jLabel4.setBackground(new java.awt.Color(255, 204, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Book Name :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        jLabel5.setBackground(new java.awt.Color(255, 204, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Issue Date :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Member ID :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 110, 30));

        jLabel7.setBackground(new java.awt.Color(255, 204, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Genre/Category :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 110, 30));

        jLabel8.setBackground(new java.awt.Color(255, 204, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Due Date :");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 110, 30));
        jPanel2.add(bookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 180, 30));
        jPanel2.add(Bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, 30));
        jPanel2.add(MemberID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 180, 30));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Issue");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 100, 30));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Member ID", "Book Name", "Genre/Category", "Issue Date", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 740, 330));

        cmdCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science and Technology", "Literature and Language", "Social Science", "Education and Academic", "Religion and Philosophy", "Hobbies and others", "IT and Programming", "Arts and Culture" }));
        jPanel2.add(cmdCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 82, 180, 30));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("Delete");
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 100, 30));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setText("Update");
        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 100, 30));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("Clear");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 100, 30));
        jPanel2.add(issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, 30));
        jPanel2.add(Due, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 180, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 790, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   int row = table2.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Select a row to delete.");
        return;
    }

    String bookId = bookID.getText();

    
    DefaultTableModel model = (DefaultTableModel) table2.getModel();
    model.removeRow(row);

    
    try {
        Connection con = DbConnect.getConnection();
        String sql = "DELETE FROM issued_books WHERE book_id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, bookId);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Deleted from DB!");

    } catch (Exception e) {
        e.printStackTrace();
    }
    bookID.setText("");
    MemberID.setText("");
    Bookname.setText("");
    cmdCate.setSelectedIndex(0);
    issue.setDate(null);
    Due.setDate(null);
    table2.clearSelection(); 

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked

    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 int selectedRow = table2.getSelectedRow();
    
    if (selectedRow != -1) {
        
        String bookId = bookID.getText();
        String memberId = MemberID.getText();
        String bookName = Bookname.getText();
        String category = cmdCate.getSelectedItem().toString();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String issueDate = sdf.format(issue.getDate());
        String dueDate = sdf.format(Due.getDate());

        
        DefaultTableModel model = (DefaultTableModel) table2.getModel();
        model.setValueAt(bookId, selectedRow, 0);
        model.setValueAt(memberId, selectedRow, 1);
        model.setValueAt(bookName, selectedRow, 2);
        model.setValueAt(category, selectedRow, 3);
        model.setValueAt(issueDate, selectedRow, 4);
        model.setValueAt(dueDate, selectedRow, 5);
        
       
        
    try {
        Connection con = DbConnect.getConnection();
        String sql = "UPDATE issued_books SET member_id=?, book_name=?, category=?, issue_date=?, due_date=? WHERE book_id=?";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, memberId);
        pst.setString(2, bookName);
        pst.setString(3, category);
        pst.setString(4, issueDate);
        pst.setString(5, dueDate);
        pst.setString(6, bookId);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Updated in DB!");

    } catch (Exception e) {
        e.printStackTrace();
    }
        
    }   
bookID.setText("");
    MemberID.setText("");
    Bookname.setText("");
    cmdCate.setSelectedIndex(0);
    issue.setDate(null);
    Due.setDate(null);
    table2.clearSelection(); 
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    bookID.setText("");
    MemberID.setText("");
    Bookname.setText("");
    
   
    cmdCate.setSelectedIndex(0);
    
    
    issue.setDate(null);
    Due.setDate(null);
    
    
    table2.clearSelection();
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ReturnBooks().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new ManageMembers().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Reports().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new logout().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Dashboard().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
  
String bookId = bookID.getText();
String memberId = MemberID.getText();
String bookName = Bookname.getText();
String category = cmdCate.getSelectedItem().toString();

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String issueDate = sdf.format(issue.getDate());
String dueDate = sdf.format(Due.getDate());


DefaultTableModel model = (DefaultTableModel) table2.getModel();
model.addRow(new Object[]{bookId, memberId, bookName, category, issueDate, dueDate});

   try {
        Connection con = DbConnect.getConnection();
        String sql = "INSERT INTO issued_books VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, bookId);
        pst.setString(2, memberId);
        pst.setString(3, bookName);
        pst.setString(4, category);
        pst.setString(5, issueDate);
        pst.setString(6, dueDate);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Added to DB!");

    } catch (Exception e) {
        e.printStackTrace();
    }


bookID.setText("");
    MemberID.setText("");
    Bookname.setText("");
    cmdCate.setSelectedIndex(0);
    issue.setDate(null);
    Due.setDate(null);
    table2.clearSelection(); 
   




    }//GEN-LAST:event_jButton8ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
 int selectedRow = table2.getSelectedRow();
    
    
    bookID.setText(table2.getValueAt(selectedRow, 0).toString());
    MemberID.setText(table2.getValueAt(selectedRow, 1).toString());
    Bookname.setText(table2.getValueAt(selectedRow, 2).toString());
    cmdCate.setSelectedItem(table2.getValueAt(selectedRow, 3).toString());

    
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date issueD = sdf.parse(table2.getValueAt(selectedRow, 4).toString());
        Date dueD = sdf.parse(table2.getValueAt(selectedRow, 5).toString());

        issue.setDate(issueD);
        Due.setDate(dueD);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_table2MouseClicked

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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bookname;
    private com.toedter.calendar.JDateChooser Due;
    private javax.swing.JTextField MemberID;
    private javax.swing.JTextField bookID;
    private javax.swing.JComboBox<String> cmdCate;
    private com.toedter.calendar.JDateChooser issue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
