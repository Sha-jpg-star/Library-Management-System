import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ManageMembers extends javax.swing.JFrame {

    Connection con;
PreparedStatement pst;
ResultSet rs;
    public ManageMembers() {
        initComponents();
        con = DbConnect.getConnection(); 
        tableload();
    }

    public void tableload(){
        try{
            String sql="SELECT member_id, full_name, gender, preferred_genres, member_type, email FROM members";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            table4.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        MId = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        cmb1 = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        Email = new javax.swing.JTextField();

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

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
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
        jLabel2.setText("Manage Members");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 140, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 164, 45));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Full Name :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 110, 30));

        jLabel4.setBackground(new java.awt.Color(255, 204, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Gender :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        jLabel5.setBackground(new java.awt.Color(255, 204, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Member Type :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Member ID :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 30));

        jLabel7.setBackground(new java.awt.Color(255, 204, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Preferred Genres :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 110, 30));

        jLabel8.setBackground(new java.awt.Color(255, 204, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Email :");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 110, 30));
        jPanel2.add(MId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 180, 30));
        jPanel2.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 180, 30));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Issue");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 100, 30));

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Full Name", "Gender", "Preferred Genres", "Member Type", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table4);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 770, 240));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("Delete");
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 100, 30));

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
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 100, 30));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("Clear");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 100, 30));

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecture", "Public" }));
        jPanel2.add(cmb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 30));

        male.setText("Male");
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        Female.setText("Female");
        jPanel2.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fiction", "Non-Fiction", "Romance", "Science Fiction" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(list);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 180, 60));

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 162, 180, 30));

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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

int selectedRow = table4.getSelectedRow();
if (selectedRow == -1) {
    JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    return;
}


int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this member?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
if (confirm != JOptionPane.YES_OPTION) {
    return; 
}


String memberId = table4.getValueAt(selectedRow, 0).toString();

try {
    Connection con = DbConnect.getConnection();
    String sql = "DELETE FROM members WHERE member_id=?";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, memberId);

    int rows = pst.executeUpdate();
    if (rows > 0) {
        JOptionPane.showMessageDialog(this, "Member deleted successfully!");

        
        DefaultTableModel model = (DefaultTableModel) table4.getModel();
        model.removeRow(selectedRow);

        
        MId.setText("");
        txtFullName.setText("");
        Email.setText("");
        cmb1.setSelectedIndex(0);
        list.clearSelection();
        male.setSelected(false);
        Female.setSelected(false);
        MId.setEditable(true);
    } else {
        JOptionPane.showMessageDialog(this, "Delete failed.");
    }

    pst.close();
    con.close();
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
}

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked

    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

int selectedRow = table4.getSelectedRow();
if (selectedRow == -1) {
    JOptionPane.showMessageDialog(this, "Please select a row from the table to update.");
    return;
}


String memberId = MId.getText();
String fullName = txtFullName.getText();
String gender = male.isSelected() ? "Male" : "Female";
String preferredGenres = list.getSelectedValue(); // For JList
String memberType = cmb1.getSelectedItem().toString();
String email = Email.getText();

try {
    Connection con = DbConnect.getConnection();
    String sql = "UPDATE members SET full_name=?, gender=?, preferred_genres=?, member_type=?, email=? WHERE member_id=?";
    PreparedStatement pst = con.prepareStatement(sql);

    pst.setString(1, fullName);
    pst.setString(2, gender);
    pst.setString(3, preferredGenres);
    pst.setString(4, memberType);
    pst.setString(5, email);
    pst.setString(6, memberId); 

    int rows = pst.executeUpdate();
    if (rows > 0) {
        JOptionPane.showMessageDialog(this, "Member updated successfully!");

        
        DefaultTableModel model = (DefaultTableModel) table4.getModel();
        model.setValueAt(memberId, selectedRow, 0);
        model.setValueAt(fullName, selectedRow, 1);
        model.setValueAt(gender, selectedRow, 2);
        model.setValueAt(preferredGenres, selectedRow, 3);
        model.setValueAt(memberType, selectedRow, 4);
        model.setValueAt(email, selectedRow, 5);

       
        MId.setText("");
        txtFullName.setText("");
        Email.setText("");
        cmb1.setSelectedIndex(0);
        list.clearSelection();
        male.setSelected(false);
        Female.setSelected(false);
        MId.setEditable(true); 

        table4.clearSelection(); 
    } else {
        JOptionPane.showMessageDialog(this, "Update failed.");
    }

    pst.close();
    con.close();
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
}

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 MId.setText("");
    txtFullName.setText("");
    Email.setText("");
    cmb1.setSelectedIndex(0);
    list.clearSelection(); 
    male.setSelected(false);
    Female.setSelected(false);
    
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       new Reports().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new logout().setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
    String memberId = MId.getText();
    String fullName = txtFullName.getText();
    String gender = male.isSelected() ? "Male" : "Female";
    String preferredGenres = list.getSelectedValue(); 
    String memberType = cmb1.getSelectedItem().toString();
    String email = Email.getText();

    
    
DefaultTableModel model = (DefaultTableModel) table4.getModel();
    model.addRow(new Object[] {
        memberId,
        fullName,
        gender,
        preferredGenres,
        memberType,
        email
    });


    try {
        Connection con = DbConnect.getConnection();
        String sql = "INSERT INTO members (member_id, full_name, gender, preferred_genres, member_type, email) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, memberId);
        pst.setString(2, fullName);
        pst.setString(3, gender);
        pst.setString(4, preferredGenres);
        pst.setString(5, memberType);
        pst.setString(6, email);

        int rows = pst.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Member added successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add member.");
        }

        pst.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }
 MId.setText("");
    txtFullName.setText("");
    Email.setText("");
    cmb1.setSelectedIndex(0);
    list.clearSelection(); 
    male.setSelected(false);
    Female.setSelected(false);
    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
       int selectedRow = table4.getSelectedRow();

    if (selectedRow != -1) {
        
        MId.setText(table4.getValueAt(selectedRow, 0).toString());
        txtFullName.setText(table4.getValueAt(selectedRow, 1).toString());

        String gender = table4.getValueAt(selectedRow, 2).toString();
        if (gender.equalsIgnoreCase("Male")) {
            male.setSelected(true);
        } else {
            Female.setSelected(true);
        }

        String genre = table4.getValueAt(selectedRow, 3).toString();
        list.setSelectedValue(genre, true); 

        cmb1.setSelectedItem(table4.getValueAt(selectedRow, 4).toString());
        Email.setText(table4.getValueAt(selectedRow, 5).toString());

       
        MId.setEditable(false);
    }
    }//GEN-LAST:event_table4MouseClicked

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

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
            java.util.logging.Logger.getLogger(ManageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField MId;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private javax.swing.JRadioButton male;
    private javax.swing.JTable table4;
    private javax.swing.JTextField txtFullName;
    // End of variables declaration//GEN-END:variables
}
