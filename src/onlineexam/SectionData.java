/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlineexam;

import java.awt.AWTException;
import java.awt.event.MouseEvent;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apple
 */
public class SectionData extends javax.swing.JFrame {

    static int group; //For title of individual groups
    /**
     * Creates new form SectionData
     */
    public SectionData() {
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
        Coord_name = new javax.swing.JTextField();
        Day_1 = new javax.swing.JTextField();
        Sub_1_1 = new javax.swing.JTextField();
        Sub_2_1 = new javax.swing.JTextField();
        Invig_1_1 = new javax.swing.JTextField();
        Invig_2_1 = new javax.swing.JTextField();
        Invig_3_1 = new javax.swing.JTextField();
        Group_1 = new javax.swing.JButton();
        Group_2 = new javax.swing.JButton();
        Group_3 = new javax.swing.JButton();
        Day_2 = new javax.swing.JTextField();
        Sub_1_2 = new javax.swing.JTextField();
        Sub_2_2 = new javax.swing.JTextField();
        Day_3 = new javax.swing.JTextField();
        Sub_1_3 = new javax.swing.JTextField();
        Sub_2_3 = new javax.swing.JTextField();
        defaultClick = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        allStudents = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        SemesterTitle = new javax.swing.JTextField();
        SectionTitle = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Section Co-ordinator: ");

        Coord_name.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Coord_name.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Coord_nameComponentAdded(evt);
            }
        });
        Coord_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Coord_nameActionPerformed(evt);
            }
        });

        Day_1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Day_1.setText("Day_1");

        Sub_1_1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Sub_1_1.setText("Sub_1");

        Sub_2_1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Sub_2_1.setText("Sub_2");

        Invig_1_1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Invig_1_1.setText("Invig_1");

        Invig_2_1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Invig_2_1.setText("Invig_2");

        Invig_3_1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Invig_3_1.setText("invig_3");

        Group_1.setText("Group_1");
        Group_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Group_1MouseClicked(evt);
            }
        });

        Group_2.setText("Group_2");
        Group_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Group_2MouseClicked(evt);
            }
        });

        Group_3.setText("Group_3");
        Group_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Group_3MouseClicked(evt);
            }
        });

        Day_2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Day_2.setText("Day_2");

        Sub_1_2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Sub_1_2.setText("Sub_1");

        Sub_2_2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Sub_2_2.setText("Sub_2");

        Day_3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Day_3.setText("Day_3");
        Day_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day_3ActionPerformed(evt);
            }
        });

        Sub_1_3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Sub_1_3.setText("Sub_1");

        Sub_2_3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Sub_2_3.setText("Sub_2");

        defaultClick.setText("defaultClick");
        defaultClick.setAlignmentX(1.0F);
        defaultClick.setAlignmentY(1.0F);
        defaultClick.setLocation(new java.awt.Point(1, 1));
        defaultClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                defaultClickMouseClicked(evt);
            }
        });
        defaultClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultClickActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setText("Exam Schedule");

        allStudents.setText("All students");
        allStudents.setLocation(new java.awt.Point(1, 1));
        allStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allStudentsMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(130, 74, 226));

        SemesterTitle.setBackground(new java.awt.Color(0, 153, 153));
        SemesterTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        SemesterTitle.setForeground(new java.awt.Color(255, 255, 255));
        SemesterTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SectionTitle.setBackground(new java.awt.Color(0, 153, 153));
        SectionTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        SectionTitle.setForeground(new java.awt.Color(255, 255, 255));
        SectionTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SectionTitle.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                SectionTitleHierarchyChanged(evt);
            }
        });

        jButton2.setText("<--");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton1.setText("-->");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SemesterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(SectionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(632, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(SemesterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SectionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Slot-1");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setText("Subject");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Slot-2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Day_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Day_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Day_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Sub_1_2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                            .addComponent(Sub_1_1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(Sub_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sub_2_3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(Sub_2_1)
                                    .addComponent(Sub_2_2))))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(218, 218, 218)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Group_3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addComponent(Group_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Group_1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Invig_1_1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(Invig_2_1)
                    .addComponent(Invig_3_1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(defaultClick, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 633, Short.MAX_VALUE)
                .addComponent(allStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Coord_name, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Coord_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(defaultClick, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Sub_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Sub_2_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Sub_1_2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                                    .addComponent(Sub_2_2)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(Day_1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Day_2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Sub_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Sub_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Day_3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Group_1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Invig_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Group_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Invig_2_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addComponent(Group_3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(Invig_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allStudents)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Coord_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Coord_nameActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_Coord_nameActionPerformed

    private void defaultClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaultClickMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_defaultClickMouseClicked

    private void Coord_nameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Coord_nameComponentAdded
        // TODO add your handling code here:
        Coord_name.setText(Dashboard_2.clickEvents.sectionCoordinator);
    }//GEN-LAST:event_Coord_nameComponentAdded

    private void Day_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day_3ActionPerformed

    private void Group_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Group_1MouseClicked
        // TODO add your handling code here:
        dispose();
        IndividualStudentGroup ig1 = new IndividualStudentGroup();
        ig1.connect();
        ig1.count();
        ig1.group1();
        group=1;
        ig1.show();
        
    }//GEN-LAST:event_Group_1MouseClicked

    private void allStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allStudentsMouseClicked
        // TODO add your handling code here:
         dispose();
        StudentGroups sg= new StudentGroups();
        sg.connect();
        sg.count();
        sg.group1();
        sg.group2();
        sg.group3();
        sg.show();
    }//GEN-LAST:event_allStudentsMouseClicked

    private void defaultClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultClickActionPerformed
        // TODO add your handling code here:
        
         Coord_name.setText(Dashboard_2.clickEvents.sectionCoordinator);
        
        Day_1.setText(Dashboard_2.clickEvents.examDate[0]);
        Day_2.setText(Dashboard_2.clickEvents.examDate[1]);
        Day_3.setText(Dashboard_2.clickEvents.examDate[2]);
        
        Sub_1_1.setText(Dashboard_2.clickEvents.examName[0]);
        Sub_2_1.setText(Dashboard_2.clickEvents.examName[1]);
        Sub_1_2.setText(Dashboard_2.clickEvents.examName[2]);
        Sub_2_2.setText(Dashboard_2.clickEvents.examName[3]);
        Sub_1_3.setText(Dashboard_2.clickEvents.examName[4]);
        Sub_2_3.setText(Dashboard_2.clickEvents.examName[5]);
        
        Invig_1_1.setText(Dashboard_2.clickEvents.invig[0]);
//        Invig_1_2.setText(Dashboard_2.clickEvents.invig[0]);
//         Invig_1_3.setText(Dashboard_2.clickEvents.invig[0]);
//          Invig_1_4.setText(Dashboard_2.clickEvents.invig[0]);
//           Invig_1_5.setText(Dashboard_2.clickEvents.invig[0]);
//            Invig_1_6.setText(Dashboard_2.clickEvents.invig[0]);
       Invig_2_1.setText(Dashboard_2.clickEvents.invig[1]);
//        Invig_2_2.setText(Dashboard_2.clickEvents.invig[1]);
//         Invig_2_3.setText(Dashboard_2.clickEvents.invig[1]);
//          Invig_2_4.setText(Dashboard_2.clickEvents.invig[1]);
//           Invig_2_5.setText(Dashboard_2.clickEvents.invig[1]);
//            Invig_2_6.setText(Dashboard_2.clickEvents.invig[1]);
     Invig_3_1.setText(Dashboard_2.clickEvents.invig[2]);
//        Invig_3_2.setText(Dashboard_2.clickEvents.invig[2]);
//         Invig_3_3.setText(Dashboard_2.clickEvents.invig[2]);
//          Invig_3_4.setText(Dashboard_2.clickEvents.invig[2]);
//           Invig_3_5.setText(Dashboard_2.clickEvents.invig[2]);
//            Invig_3_6.setText(Dashboard_2.clickEvents.invig[2]);
            SectionTitle.setText("Section: "+Dashboard_2.clickEvents.section);
            SemesterTitle.setText("Semester: "+Dashboard_2.clickEvents.semester);
    }//GEN-LAST:event_defaultClickActionPerformed

    private void Group_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Group_2MouseClicked
        // TODO add your handling code here:
         dispose();
        IndividualStudentGroup ig2 = new IndividualStudentGroup();
        ig2.connect();
        ig2.count();
        ig2.group2();
        group=2;
        ig2.show();
    }//GEN-LAST:event_Group_2MouseClicked

    private void Group_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Group_3MouseClicked
        // TODO add your handling code here:
         dispose();
         IndividualStudentGroup ig2 = new IndividualStudentGroup();
        ig2.connect();
        ig2.count();
        ig2.group3();
        group=3;
        ig2.show();
    }//GEN-LAST:event_Group_3MouseClicked

    private void SectionTitleHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_SectionTitleHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SectionTitleHierarchyChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
         dispose();
        Dashboard_2 s1=new Dashboard_2();
        s1.show();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
          dispose();
        StudentGroups s1=new StudentGroups();
        s1.show();
    }//GEN-LAST:event_jButton1MouseClicked
     
    
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
            java.util.logging.Logger.getLogger(SectionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SectionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SectionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SectionData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SectionData().setVisible(true);
                 
            }
        });
        
         
       
    }
    
     public javax.swing.JButton DefaultClick(){
  
         return defaultClick;
     } 
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Coord_name;
    private javax.swing.JTextField Day_1;
    private javax.swing.JTextField Day_2;
    private javax.swing.JTextField Day_3;
    private javax.swing.JButton Group_1;
    private javax.swing.JButton Group_2;
    private javax.swing.JButton Group_3;
    private javax.swing.JTextField Invig_1_1;
    private javax.swing.JTextField Invig_2_1;
    private javax.swing.JTextField Invig_3_1;
    private javax.swing.JTextField SectionTitle;
    private javax.swing.JTextField SemesterTitle;
    private javax.swing.JTextField Sub_1_1;
    private javax.swing.JTextField Sub_1_2;
    private javax.swing.JTextField Sub_1_3;
    private javax.swing.JTextField Sub_2_1;
    private javax.swing.JTextField Sub_2_2;
    private javax.swing.JTextField Sub_2_3;
    private javax.swing.JButton allStudents;
    private javax.swing.JButton defaultClick;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}