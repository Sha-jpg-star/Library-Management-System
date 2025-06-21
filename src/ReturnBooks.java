import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author shali
 */
public class ReturnBooks extends javax.swing.JFrame {

    Connection con;
PreparedStatement pst;
ResultSet rs;
    public ReturnBooks() {
        initComponents();
        con = DbConnect.getConnection(); 
        tableload();
    }

    public void tableload(){
        try{
            String sql="SELECT book_id, member_id, book_name, category, issue_date, due_date, return_date, late_fee FROM return_books;";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            table3.setModel(DbUtils.resultSetToTableModel(rs));
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
        BID = new javax.swing.JTextField();
        Bookname = new javax.swing.JTextField();
        MID = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        cmbCate = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Late = new javax.swing.JTextField();
        issue = new com.toedter.calendar.JDateChooser();
        Due = new com.toedter.calendar.JDateChooser();
        Return = new com.toedter.calendar.JDateChooser();

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

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
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
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Member ID :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 110, 30));

        jLabel7.setBackground(new java.awt.Color(255, 204, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Genre/Category :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 110, 30));

        jLabel8.setBackground(new java.awt.Color(255, 204, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Late Fee :");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 110, 30));
        jPanel2.add(BID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 180, 30));
        jPanel2.add(Bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, 30));
        jPanel2.add(MID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 180, 30));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Add");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 30));

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Member ID", "Book Name", "Genre/Category", "Issue Date", "Due Date", "Return Date", "Late Fee "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 770, 340));

        cmbCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science and Technology", "Literature and Language", "Social Science", "Education and Academic", "Religion and Philosophy", "Hobbies and others", "IT and Programming", "Arts and Culture" }));
        jPanel2.add(cmbCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 180, 30));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("Delete");
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 100, 30));

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
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, 30));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("Clear");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 30));

        jLabel9.setBackground(new java.awt.Color(255, 204, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Due Date :");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 110, 30));

        jLabel10.setBackground(new java.awt.Color(255, 204, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Return Date :");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 30));

        Late.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LateActionPerformed(evt);
            }
        });
        jPanel2.add(Late, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 180, 30));
        jPanel2.add(issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 180, 30));
        jPanel2.add(Due, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 112, 180, 30));
        jPanel2.add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 810, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    int selectedRow = table3.getSelectedRow();

    if (selectedRow != -1) {
        String bookId = table3.getValueAt(selectedRow, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure to delete this record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection con = DbConnect.getConnection();
                String sql = "DELETE FROM return_books WHERE book_id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, bookId);
                pst.executeUpdate();

              
                DefaultTableModel model = (DefaultTableModel) table3.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(this, "Deleted successfully!");
                
                        BID.setText("");
    MID.setText("");
    Bookname.setText("");
    cmbCate.setSelectedIndex(0);
    issue.setDate(null);
    Due.setDate(null);
    Return.setDate(null);
    Late.setText("");
    table3.clearSelection();
                
                
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error while deleting from database.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    }

                  
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked

    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

    int selectedRow = table3.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to update.");
        return;
    }

    String bookId = BID.getText();
    String memberId = MID.getText();
    String bookName = Bookname.getText();
    String category = cmbCate.getSelectedItem().toString();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String issueDate = sdf.format(issue.getDate());
    String dueDate = sdf.format(Due.getDate());
    String returnDate = sdf.format(Return.getDate());

    double lateFee = 0.0;
    try {
        Date due = sdf.parse(dueDate);
        Date ret = sdf.parse(returnDate);
        long diff = ret.getTime() - due.getTime();
        long daysLate = diff / (1000 * 60 * 60 * 24);
        if (daysLate > 0) {
            lateFee = daysLate * 10.0;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    try {
        Connection con = DbConnect.getConnection();
        String sql = "UPDATE return_books SET member_id=?, book_name=?, category=?, issue_date=?, due_date=?, return_date=?, late_fee=? WHERE book_id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, memberId);
        pst.setString(2, bookName);
        pst.setString(3, category);
        pst.setString(4, issueDate);
        pst.setString(5, dueDate);
        pst.setString(6, returnDate);
        pst.setDouble(7, lateFee);
        pst.setString(8, bookId);

        int updated = pst.executeUpdate();

        if (updated > 0) {
            JOptionPane.showMessageDialog(this, "Record updated successfully!");

            DefaultTableModel model = (DefaultTableModel) table3.getModel();
            model.setValueAt(bookId, selectedRow, 0);
            model.setValueAt(memberId, selectedRow, 1);
            model.setValueAt(bookName, selectedRow, 2);
            model.setValueAt(category, selectedRow, 3);
            model.setValueAt(issueDate, selectedRow, 4);
            model.setValueAt(dueDate, selectedRow, 5);
            model.setValueAt(returnDate, selectedRow, 6);
            model.setValueAt(String.format("%.2f", lateFee), selectedRow, 7);

            
            
            BID.setText("");
    MID.setText("");
    Bookname.setText("");
    cmbCate.setSelectedIndex(0);
    issue.setDate(null);
    Due.setDate(null);
    Return.setDate(null);
    Late.setText("");
    table3.clearSelection();
        } else {
            JOptionPane.showMessageDialog(this, "Update failed!");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error occurred.");
    }





                
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    BID.setText("");
    MID.setText("");
    Bookname.setText("");
    cmbCate.setSelectedIndex(0);
    issue.setDate(null);
    Due.setDate(null);
    Return.setDate(null);
    Late.setText("");
    table3.clearSelection();
    
    }//GEN-LAST:event_jButton10ActionPerformed

    private void LateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LateActionPerformed
       
    }//GEN-LAST:event_LateActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new ManageMembers().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Reports().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new logout().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    String bookId = BID.getText();
    String memberId = MID.getText();
    String bookName = Bookname.getText();
    String category = cmbCate.getSelectedItem().toString();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String issueDate = sdf.format(issue.getDate());
    String dueDate = sdf.format(Due.getDate());
    String returnDate = sdf.format(Return.getDate());

    long lateFee = 0;
    try {
        Date due = sdf.parse(dueDate);
        Date returned = sdf.parse(returnDate);
        long diff = returned.getTime() - due.getTime();
        long daysLate = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        lateFee = (daysLate > 0) ? daysLate * 10 : 0;
    } catch (Exception e) {
        e.printStackTrace();
    }

    
    DefaultTableModel model = (DefaultTableModel) table3.getModel();
    model.addRow(new Object[]{bookId, memberId, bookName, category, issueDate, dueDate, returnDate, lateFee});
Late.setText(String.valueOf(Late));
    
    try {
        Connection con = DbConnect.getConnection();
        String sql = "INSERT INTO return_books (book_id, member_id, book_name, category, issue_date, due_date, return_date, late_fee) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, bookId);
        pst.setString(2, memberId);
        pst.setString(3, bookName);
        pst.setString(4, category);
        pst.setString(5, issueDate);
        pst.setString(6, dueDate);
        pst.setString(7, returnDate);
        pst.setLong(8, lateFee);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Record Added Successfully!");

    } catch (Exception e) {
        e.printStackTrace();
    }

    // Clear form

    BID.setText("");
    MID.setText("");
    Bookname.setText("");
    cmbCate.setSelectedIndex(0);
    issue.setDate(null);
    Due.setDate(null);
    Return.setDate(null);
    Late.setText("");
    table3.clearSelection();

  
   

    }//GEN-LAST:event_jButton8ActionPerformed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
  
    int selectedRow = table3.getSelectedRow();

    if (selectedRow != -1) {
        
        BID.setText(table3.getValueAt(selectedRow, 0).toString());
        MID.setText(table3.getValueAt(selectedRow, 1).toString());
        Bookname.setText(table3.getValueAt(selectedRow, 2).toString());
        cmbCate.setSelectedItem(table3.getValueAt(selectedRow, 3).toString());

       
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String issueStr = table3.getValueAt(selectedRow, 4).toString();
            String dueStr = table3.getValueAt(selectedRow, 5).toString();
            String returnStr = table3.getValueAt(selectedRow, 6).toString();

           
            issue.setDate(sdf.parse(issueStr));
            Due.setDate(sdf.parse(dueStr));
            Return.setDate(sdf.parse(returnStr));
        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Date format error: " + e.getMessage());
        }

      
        if (table3.getColumnCount() > 7) {
            Late.setText(table3.getValueAt(selectedRow, 7).toString());
        } else {
            Late.setText("");
        }
    }


    }//GEN-LAST:event_table3MouseClicked

    /**
     * @param args the command line arguments
     */
    public  void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BID;
    private javax.swing.JTextField Bookname;
    private com.toedter.calendar.JDateChooser Due;
    private javax.swing.JTextField Late;
    private javax.swing.JTextField MID;
    private com.toedter.calendar.JDateChooser Return;
    private javax.swing.JComboBox<String> cmbCate;
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
    private javax.swing.JTable table3;
    // End of variables declaration//GEN-END:variables
}
