/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlineexam;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author apple
 */
public class StudentGroups extends javax.swing.JFrame {

    /**
     * Creates new form StudentGroups
     */
    public StudentGroups() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Group_1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Group_2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Group_3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        GroupBranch = new javax.swing.JTextField();
        GroupSection = new javax.swing.JTextField();
        GroupSem = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Group_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Group_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Group_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Group_1.setGridColor(new java.awt.Color(0, 153, 153));
        Group_1.setShowGrid(true);
        jScrollPane1.setViewportView(Group_1);

        Group_2.setBorder(new javax.swing.border.MatteBorder(null));
        Group_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Group_2.setGridColor(new java.awt.Color(0, 153, 153));
        jScrollPane2.setViewportView(Group_2);

        Group_3.setBorder(new javax.swing.border.MatteBorder(null));
        Group_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Group_3.setGridColor(new java.awt.Color(0, 153, 153));
        jScrollPane3.setViewportView(Group_3);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Group-1");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("Group_2");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("Group_3");

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));

        GroupBranch.setBackground(new java.awt.Color(0, 153, 153));
        GroupBranch.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        GroupBranch.setForeground(new java.awt.Color(255, 255, 255));
        GroupBranch.setText("Branch");
        GroupBranch.setBorder(null);
        GroupBranch.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                GroupBranchHierarchyChanged(evt);
            }
        });

        GroupSection.setBackground(new java.awt.Color(0, 153, 153));
        GroupSection.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        GroupSection.setForeground(new java.awt.Color(255, 255, 255));
        GroupSection.setText("Section");
        GroupSection.setBorder(null);
        GroupSection.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                GroupSectionHierarchyChanged(evt);
            }
        });

        GroupSem.setBackground(new java.awt.Color(0, 153, 153));
        GroupSem.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        GroupSem.setForeground(new java.awt.Color(255, 255, 255));
        GroupSem.setText("Sem");
        GroupSem.setBorder(null);
        GroupSem.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                GroupSemHierarchyChanged(evt);
            }
        });
        GroupSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupSemActionPerformed(evt);
            }
        });

        jButton2.setText("<--");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GroupBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GroupSection, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GroupSem, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(650, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GroupSection, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GroupSem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GroupBranch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jButton1.setText("Exam Completed");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(385, 385, 385)
                .addComponent(jLabel3)
                .addGap(175, 175, 175))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(606, 606, 606)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        connect();
        deleteExam();
        dispose();
        JOptionPane.showMessageDialog( null, "Exam Conducted successfully" );
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void GroupSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupSemActionPerformed

    private void GroupBranchHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_GroupBranchHierarchyChanged
        // TODO add your handling code here:
        GroupBranch.setText(" Branch:  "+ Dashboard_1.subjectVariables.subject);
    }//GEN-LAST:event_GroupBranchHierarchyChanged

    private void GroupSectionHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_GroupSectionHierarchyChanged
        // TODO add your handling code here:
        GroupSection.setText(" Section: "+ Dashboard_2.clickEvents.section);
    }//GEN-LAST:event_GroupSectionHierarchyChanged

    private void GroupSemHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_GroupSemHierarchyChanged
        // TODO add your handling code here:
        GroupSem.setText(" Semester: "+ Dashboard_2.clickEvents.semester);
    }//GEN-LAST:event_GroupSemHierarchyChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        dispose();
        SectionData d1= new SectionData();
        d1.show();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(StudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGroups().setVisible(true);
            }
        });
        
        
        
    }
    
    Connection con=null;
    public void connect(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","Jaimin","Jaimin@2001");
        } catch(Exception e){
       System.out.println(e);
    }
    }
       PreparedStatement pst; 
       int count=0;
      public void count(){  
        String countQuery ="Select COUNT(stu_id) from students where section='"+Dashboard_2.clickEvents.section+"' AND branch='"+Dashboard_1.subjectVariables.subject+"' AND semester='"+Dashboard_2.clickEvents.semester+"'";
        
        
        try{
         pst= con.prepareStatement(countQuery);
         ResultSet rs= pst.executeQuery();
         rs.next();
          count = rs.getInt(1);
         
         }catch(Exception e){
             System.out.println(e);
         }
      }
      
      
       String GroupQuery;
      public void group1(){
         GroupQuery = "Select stu_id,stu_name,stu_mail from students where section='"+Dashboard_2.clickEvents.section+"' AND branch='"+Dashboard_1.subjectVariables.subject+"' AND semester='"+Dashboard_2.clickEvents.semester+"' LIMIT "+(count/3);

            try{
         pst= con.prepareStatement(GroupQuery);
         ResultSet rs= pst.executeQuery();
       
         Group_1.setModel(DbUtils.resultSetToTableModel(rs));
        
         
         }catch(Exception e){
             System.out.println(e);
         }
      }  
      
      
        
      public void group2(){
      GroupQuery = "Select stu_id,stu_name,stu_mail from students where section='"+Dashboard_2.clickEvents.section+"' AND branch='"+Dashboard_1.subjectVariables.subject+"' AND semester='"+Dashboard_2.clickEvents.semester+"' LIMIT "+(count/3)+","+(count/3);
        try{
         pst= con.prepareStatement(GroupQuery);
         ResultSet rs= pst.executeQuery();
       
         Group_2.setModel(DbUtils.resultSetToTableModel(rs));
        
         
         }catch(Exception e){
             System.out.println(e);
         }
      }
        
        public void group3(){
        GroupQuery = "Select stu_id,stu_name,stu_mail from students where section='"+Dashboard_2.clickEvents.section+"' AND branch='"+Dashboard_1.subjectVariables.subject+"' AND semester='"+Dashboard_2.clickEvents.semester+"' LIMIT "+((count*2)/3)+","+count;
         try{
         pst= con.prepareStatement(GroupQuery);
         ResultSet rs= pst.executeQuery();
       
         Group_3.setModel(DbUtils.resultSetToTableModel(rs));
        
         
         }catch(Exception e){
             System.out.println(e);
         }
        }
        
        
        public void deleteExam(){
            GroupQuery="Delete from Year_2 where branch='"+Dashboard_1.subjectVariables.subject+"'";
            
            try{
         pst= con.prepareStatement(GroupQuery);
         pst.executeUpdate();
        }catch(Exception e){
             System.out.println(e);
         }
        }
   
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GroupBranch;
    private javax.swing.JTextField GroupSection;
    private javax.swing.JTextField GroupSem;
    private javax.swing.JTable Group_1;
    private javax.swing.JTable Group_2;
    private javax.swing.JTable Group_3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
