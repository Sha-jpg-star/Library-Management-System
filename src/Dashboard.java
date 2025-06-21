import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


        

    
    
public class Dashboard extends javax.swing.JFrame {
Connection con;
PreparedStatement pst;
ResultSet rs;
    DefaultTableModel model;
    public Dashboard() {
        initComponents();
         con = DbConnect.getConnection(); 
    tableload();
        
DefaultTableModel model = (DefaultTableModel) tableData.getModel();
    }
    public void tableload() {
    try {
        String sql = "SELECT book_id, Title, Author, Publisher, Quantity, category FROM books";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        tableData.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e) {
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
        txtID = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtPublisher = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        cmbCate = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();

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

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Add & Manage Books");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton1.setPreferredSize(new java.awt.Dimension(2, 2));
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 40));

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
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Manage Members");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton5.setPreferredSize(new java.awt.Dimension(2, 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, 40));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Reports");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton6.setPreferredSize(new java.awt.Dimension(2, 2));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 40));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Logout");
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 51)));
        jButton7.setPreferredSize(new java.awt.Dimension(2, 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 40));

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
        jLabel4.setText("Title :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        jLabel5.setBackground(new java.awt.Color(255, 204, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Author :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Publisher :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 110, 30));

        jLabel7.setBackground(new java.awt.Color(255, 204, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Genre/Category :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 110, 30));

        jLabel8.setBackground(new java.awt.Color(255, 204, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Quantity :");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 110, 30));
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 180, 30));
        jPanel2.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, 30));
        jPanel2.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, 30));
        jPanel2.add(txtPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 180, 30));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Add");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 100, 30));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("Delete");
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 100, 30));

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author", "Publisher", "Genre/Category", "Quantity"
            }
        ));
        tableData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 770, 340));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("Clear");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 100, 30));

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

        cmbCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science and Technology", "Literature and Language", "Social Science", "Education and Academic", "Religion and Philosophy", "Hobbies and others", "IT and Programming", "Arts and Culture" }));
        jPanel2.add(cmbCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 82, 180, 30));

        txtQuantity.setText("0");
        jPanel2.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 180, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 790, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

try {
    String bookID = txtID.getText();
    String title = txtTitle.getText();
    String author = txtAuthor.getText();
    String publisher = txtPublisher.getText();
    String category = cmbCate.getSelectedItem().toString();
    int quantity;

  
    try {
        quantity = Integer.parseInt(txtQuantity.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Quantity must be a number!");
        return;
    }

   
    if (bookID.isEmpty() || title.isEmpty() || author.isEmpty() || publisher.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all required fields!");
        return;
    }

   
    Connection con = DbConnect.getConnection();
    String sql = "INSERT INTO books (book_id, Title, Author, Publisher, Category, Quantity) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);

    pst.setString(1, bookID);
    pst.setString(2, title);
    pst.setString(3, author);
    pst.setString(4, publisher);
    pst.setString(5, category);
    pst.setInt(6, quantity);

    int rowsInserted = pst.executeUpdate();

    if (rowsInserted > 0) {
        JOptionPane.showMessageDialog(this, "Book Added Successfully!");

        
        DefaultTableModel model = (DefaultTableModel) tableData.getModel();
        Object[] row = { bookID, title, author, publisher, quantity, category };
        model.addRow(row);

       
        txtID.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtPublisher.setText("");
        txtQuantity.setText("");
        cmbCate.setSelectedIndex(0);
    } else {
        JOptionPane.showMessageDialog(this, "Failed to add the book.");
    }

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
}


   







    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
          txtID.setText("");
    txtTitle.setText("");
    txtAuthor.setText("");
    txtPublisher.setText("");
    txtQuantity.setText("");
    cmbCate.setSelectedIndex(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     int selectedRow = tableData.getSelectedRow();
if (selectedRow == -1) {
    JOptionPane.showMessageDialog(null, "Please select a row to update");
    return;
}

String bookID = txtID.getText();
String title = txtTitle.getText();
String author = txtAuthor.getText();
String publisher = txtPublisher.getText();
String category = cmbCate.getSelectedItem().toString();
int quantity;

try {
    quantity = Integer.parseInt(txtQuantity.getText());
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Quantity must be a number!");
    return;
}


DefaultTableModel model = (DefaultTableModel) tableData.getModel();
model.setValueAt(bookID, selectedRow, 0);
model.setValueAt(title, selectedRow, 1);
model.setValueAt(author, selectedRow, 2);
model.setValueAt(publisher, selectedRow, 3);
model.setValueAt(category, selectedRow, 5);
model.setValueAt(quantity, selectedRow, 4);


try {
    Connection con = DbConnect.getConnection();
    String sql = "UPDATE books SET Title=?, Author=?, Publisher=?, Category=?, Quantity=? WHERE book_id=?";
    PreparedStatement pst = con.prepareStatement(sql);

    pst.setString(1, title);
    pst.setString(2, author);
    pst.setString(3, publisher);
    pst.setString(4, category);
    pst.setInt(5, quantity);
    pst.setString(6, bookID);

    pst.executeUpdate();
    JOptionPane.showMessageDialog(this, "Book Updated Successfully!");

} catch (Exception e) {
    e.printStackTrace();
}


txtID.setText("");
txtTitle.setText("");
txtAuthor.setText("");
txtPublisher.setText("");
txtQuantity.setText("");
cmbCate.setSelectedIndex(0);


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked

        
    }//GEN-LAST:event_jButton11MouseClicked

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
int selectedRow = tableData.getSelectedRow();
        if (selectedRow != -1) {
            txtID.setText(tableData.getValueAt(selectedRow, 0).toString());
            txtTitle.setText(tableData.getValueAt(selectedRow, 1).toString());
            txtAuthor.setText(tableData.getValueAt(selectedRow, 2).toString());
            txtPublisher.setText(tableData.getValueAt(selectedRow, 3).toString());
            cmbCate.setSelectedItem(tableData.getValueAt(selectedRow, 5).toString());
            txtQuantity.setText(tableData.getValueAt(selectedRow, 4).toString());
        }

    }//GEN-LAST:event_tableDataMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableData.getModel();
        int selectedRow = tableData.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete");
            return;
        }

        
        int confirm = JOptionPane.showConfirmDialog(null, 
            "Are you sure you want to delete this record?", 
            "Delete Confirmation", 
            JOptionPane.YES_NO_OPTION);

        
if (confirm == JOptionPane.YES_OPTION) {
    
    String bookID = model.getValueAt(selectedRow, 0).toString(); 

    try {
        Connection con = DbConnect.getConnection();
        String sql = "DELETE FROM books WHERE book_id = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, bookID);

        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            model.removeRow(selectedRow); 
            JOptionPane.showMessageDialog(null, "Record deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Delete failed. Book not found in DB.");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error deleting record from database.");
    }
}      
            txtID.setText("");
            txtTitle.setText("");
            txtAuthor.setText("");
            txtPublisher.setText("");
            txtQuantity.setText("");
            cmbCate.setSelectedIndex(0);
            
        
    }//GEN-LAST:event_jButton9ActionPerformed

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
        new Reports().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new logout().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

   public void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Dashboard().setVisible(true);
        }
    });
}



    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCate;
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
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

}


