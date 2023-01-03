
package onlineexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author    Jaimin
 */
public class ExamSchedule extends javax.swing.JFrame {


    public ExamSchedule() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CC1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SaveSchedule = new javax.swing.JButton();
        Continue = new javax.swing.JButton();
        SName1 = new javax.swing.JTextField();
        Date1 = new javax.swing.JTextField();
        SlotExam1 = new javax.swing.JTextField();
        SemExam1 = new javax.swing.JTextField();
        CC2 = new javax.swing.JTextField();
        SName2 = new javax.swing.JTextField();
        Date2 = new javax.swing.JTextField();
        SlotExam2 = new javax.swing.JTextField();
        SemExam2 = new javax.swing.JTextField();
        CC3 = new javax.swing.JTextField();
        Date3 = new javax.swing.JTextField();
        SlotExam3 = new javax.swing.JTextField();
        SName3 = new javax.swing.JTextField();
        SemExam3 = new javax.swing.JTextField();
        SemExam4 = new javax.swing.JTextField();
        Date4 = new javax.swing.JTextField();
        SlotExam4 = new javax.swing.JTextField();
        SName4 = new javax.swing.JTextField();
        CC4 = new javax.swing.JTextField();
        SlotExam5 = new javax.swing.JTextField();
        Date5 = new javax.swing.JTextField();
        SemExam5 = new javax.swing.JTextField();
        SName5 = new javax.swing.JTextField();
        CC5 = new javax.swing.JTextField();
        CC6 = new javax.swing.JTextField();
        Date6 = new javax.swing.JTextField();
        SlotExam6 = new javax.swing.JTextField();
        SemExam6 = new javax.swing.JTextField();
        SName6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CC1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Course Code");

        SaveSchedule.setText("Save Schedule");
        SaveSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveScheduleMouseClicked(evt);
            }
        });

        Continue.setText("Continue");
        Continue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinueMouseClicked(evt);
            }
        });

        SName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SName1ActionPerformed(evt);
            }
        });

        Date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date1ActionPerformed(evt);
            }
        });

        SlotExam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotExam1ActionPerformed(evt);
            }
        });

        SemExam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemExam1ActionPerformed(evt);
            }
        });

        CC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CC2ActionPerformed(evt);
            }
        });

        SName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SName2ActionPerformed(evt);
            }
        });

        Date2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date2ActionPerformed(evt);
            }
        });

        SlotExam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotExam2ActionPerformed(evt);
            }
        });

        SemExam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemExam2ActionPerformed(evt);
            }
        });

        CC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CC3ActionPerformed(evt);
            }
        });

        Date3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date3ActionPerformed(evt);
            }
        });

        SlotExam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotExam3ActionPerformed(evt);
            }
        });

        SName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SName3ActionPerformed(evt);
            }
        });

        SemExam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemExam3ActionPerformed(evt);
            }
        });

        SemExam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemExam4ActionPerformed(evt);
            }
        });

        Date4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date4ActionPerformed(evt);
            }
        });

        SlotExam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotExam4ActionPerformed(evt);
            }
        });

        SName4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SName4ActionPerformed(evt);
            }
        });

        CC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CC4ActionPerformed(evt);
            }
        });

        SlotExam5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotExam5ActionPerformed(evt);
            }
        });

        Date5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date5ActionPerformed(evt);
            }
        });

        SemExam5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemExam5ActionPerformed(evt);
            }
        });

        SName5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SName5ActionPerformed(evt);
            }
        });

        CC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CC5ActionPerformed(evt);
            }
        });

        CC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CC6ActionPerformed(evt);
            }
        });

        Date6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date6ActionPerformed(evt);
            }
        });

        SlotExam6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotExam6ActionPerformed(evt);
            }
        });

        SemExam6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemExam6ActionPerformed(evt);
            }
        });

        SName6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SName6ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Semester");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Subject Name");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Date");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Exam Slot");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jTextField1.setBackground(new java.awt.Color(0, 204, 204));
        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Exam Schedule");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("-->");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("<--");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                      .addGap(25, 25, 25)
                      .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jButton2)
                      .addGap(18, 18, 18)
                      .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                      .addContainerGap()
                      .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                      .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                      .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                          .addGap(48, 48, 48)
                                          .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                          .addGap(12, 12, 12)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(CC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(CC2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(CC3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(CC4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(CC5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(CC6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                          .addGap(21, 21, 21)
                                          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                      .addGap(12, 12, 12)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                          .addComponent(SName2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(SlotExam2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(SemExam2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                          .addComponent(SName3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(Date3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(SlotExam3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(SemExam3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                          .addComponent(SName4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(Date4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(SlotExam4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(SemExam4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                          .addComponent(SName5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(Date5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(SlotExam5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(SemExam5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                          .addComponent(SName6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGap(13, 13, 13)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                          .addGap(0, 0, Short.MAX_VALUE)
                                                          .addComponent(jLabel4)
                                                          .addGap(240, 240, 240))
                                                  .addGroup(layout.createSequentialGroup()
                                                          .addComponent(Date6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                          .addComponent(SlotExam6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                          .addComponent(SemExam6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(SName1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addGroup(layout.createSequentialGroup()
                                                          .addGap(18, 18, 18)
                                                          .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                  .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                  .addComponent(SlotExam1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                          .addGap(0, 0, Short.MAX_VALUE)
                                                          .addComponent(SemExam1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(layout.createSequentialGroup()
                                                          .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                          .addGap(24, 24, 24)))))
                      .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(SaveSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(238, 238, 238))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                          .addGap(76, 76, 76)
                                          .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                      .addComponent(jLabel4)
                      .addGap(34, 34, 34)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CC1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SName1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SlotExam1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SemExam1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGap(34, 34, 34)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CC2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SName2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SlotExam2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SemExam2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGap(34, 34, 34)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CC3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SName3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Date3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SlotExam3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SemExam3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGap(34, 34, 34)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CC4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SName4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Date4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SlotExam4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SemExam4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGap(34, 34, 34)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CC5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SName5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Date5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SlotExam5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SemExam5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGap(34, 34, 34)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CC6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SName6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Date6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SlotExam6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SemExam6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGap(18, 18, Short.MAX_VALUE)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SaveSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveScheduleMouseClicked

        // Getting input from text fields and saving it
        TTvariables [] ttarr = new TTvariables[6];
        //Creating and initializing array of objects
        ttarr[0] = new TTvariables(CC1.getText(), SName1.getText(), Date1.getText(), Integer.parseInt(SlotExam1.getText()), Integer.parseInt(SemExam1.getText()));
        ttarr[1] = new TTvariables(CC2.getText(), SName2.getText(), Date2.getText(), Integer.parseInt(SlotExam2.getText()), Integer.parseInt(SemExam2.getText()));
        ttarr[2] = new TTvariables(CC3.getText(), SName3.getText(), Date3.getText(), Integer.parseInt(SlotExam3.getText()), Integer.parseInt(SemExam3.getText()));
        ttarr[3] = new TTvariables(CC4.getText(), SName4.getText(), Date4.getText(), Integer.parseInt(SlotExam4.getText()), Integer.parseInt(SemExam4.getText()));
        ttarr[4] = new TTvariables(CC5.getText(), SName5.getText(), Date5.getText(), Integer.parseInt(SlotExam5.getText()), Integer.parseInt(SemExam5.getText()));
        ttarr[5] = new TTvariables(CC6.getText(), SName6.getText(), Date6.getText(), Integer.parseInt(SlotExam6.getText()), Integer.parseInt(SemExam6.getText()));

        TTvariables.tempSem = Integer.parseInt(SemExam1.getText());
        //After fetching text from fields make the text fields empty
        CC1.setText(""); SName1.setText(""); Date1.setText(""); SlotExam1.setText(""); SemExam1.setText("");
        CC2.setText(""); SName2.setText(""); Date2.setText(""); SlotExam2.setText(""); SemExam2.setText("");
        CC3.setText(""); SName3.setText(""); Date3.setText(""); SlotExam3.setText(""); SemExam3.setText("");
        CC4.setText(""); SName4.setText(""); Date4.setText(""); SlotExam4.setText(""); SemExam4.setText("");
        CC5.setText(""); SName5.setText(""); Date5.setText(""); SlotExam5.setText(""); SemExam5.setText("");
        CC6.setText(""); SName6.setText(""); Date6.setText(""); SlotExam6.setText(""); SemExam6.setText("");

        //Old logic for single values
//        t1.sub_code = SCode.getText();
//        t1.sub_name = SName.getText();
//        t1.date=ExamDate.getText();
//        t1.slot=Integer.parseInt(SlotNo.getText());
//        t1.year=Integer.parseInt(Year.getText());
//
//        SCode.setText("");
//        SName.setText("");
//        ExamDate.setText("");
//        SlotNo.setText("");
//        Year.setText("");


        // Actually saving the data to the ExamTT database
        timeTableDAO dao = new timeTableDAO();
        dao.connect();
        dao.addTimeTable(ttarr);
        JOptionPane.showMessageDialog(this, "Time Table Saved Successfully");
    }//GEN-LAST:event_SaveScheduleMouseClicked

    private void ContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueMouseClicked
        // Call the invigilator assignment logic and open new form(Dashboard_2) after closing this one

        assignInvigDAO invigAssign = new assignInvigDAO();
        invigAssign.connect();
        invigAssign.assignInvig();

        invigAssign.invigCount();
        dispose();
        Dashboard_2 d2 = new Dashboard_2();
        d2.show();
    }//GEN-LAST:event_ContinueMouseClicked

    private void CC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CC1ActionPerformed

    private void SName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SName1ActionPerformed

    private void Date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date1ActionPerformed

    private void SlotExam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotExam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SlotExam1ActionPerformed

    private void SemExam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemExam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemExam1ActionPerformed

    private void CC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CC2ActionPerformed

    private void SName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SName2ActionPerformed

    private void Date2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date2ActionPerformed

    private void SlotExam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotExam2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SlotExam2ActionPerformed

    private void SemExam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemExam2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemExam2ActionPerformed

    private void CC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CC3ActionPerformed

    private void Date3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date3ActionPerformed

    private void SlotExam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotExam3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SlotExam3ActionPerformed

    private void SName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SName3ActionPerformed

    private void SemExam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemExam3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemExam3ActionPerformed

    private void SemExam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemExam4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemExam4ActionPerformed

    private void Date4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date4ActionPerformed

    private void SlotExam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotExam4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SlotExam4ActionPerformed

    private void SName4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SName4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SName4ActionPerformed

    private void CC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CC4ActionPerformed

    private void SlotExam5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotExam5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SlotExam5ActionPerformed

    private void Date5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date5ActionPerformed

    private void SemExam5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemExam5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemExam5ActionPerformed

    private void SName5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SName5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SName5ActionPerformed

    private void CC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CC5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CC5ActionPerformed

    private void CC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CC6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CC6ActionPerformed

    private void Date6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date6ActionPerformed

    private void SlotExam6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotExam6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SlotExam6ActionPerformed

    private void SemExam6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemExam6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemExam6ActionPerformed

    private void SName6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SName6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SName6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        dispose();
        OnlineOptionBtn d1 = new OnlineOptionBtn();
        d1.show();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
        Dashboard_2 d1 = new Dashboard_2();
        d1.show();

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
            java.util.logging.Logger.getLogger(ExamSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamSchedule().setVisible(true);
            }
        });
    }







    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CC1;
    private javax.swing.JTextField CC2;
    private javax.swing.JTextField CC3;
    private javax.swing.JTextField CC4;
    private javax.swing.JTextField CC5;
    private javax.swing.JTextField CC6;
    private javax.swing.JButton Continue;
    private javax.swing.JTextField Date1;
    private javax.swing.JTextField Date2;
    private javax.swing.JTextField Date3;
    private javax.swing.JTextField Date4;
    private javax.swing.JTextField Date5;
    private javax.swing.JTextField Date6;
    private javax.swing.JTextField SName1;
    private javax.swing.JTextField SName2;
    private javax.swing.JTextField SName3;
    private javax.swing.JTextField SName4;
    private javax.swing.JTextField SName5;
    private javax.swing.JTextField SName6;
    private javax.swing.JButton SaveSchedule;
    private javax.swing.JTextField SemExam1;
    private javax.swing.JTextField SemExam2;
    private javax.swing.JTextField SemExam3;
    private javax.swing.JTextField SemExam4;
    private javax.swing.JTextField SemExam5;
    private javax.swing.JTextField SemExam6;
    private javax.swing.JTextField SlotExam1;
    private javax.swing.JTextField SlotExam2;
    private javax.swing.JTextField SlotExam3;
    private javax.swing.JTextField SlotExam4;
    private javax.swing.JTextField SlotExam5;
    private javax.swing.JTextField SlotExam6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}


//Class containing all the necessary Time table variables to be used later for sql querying
//Class is to be called when saving the exam schedule (pressing save schedule button)
class TTvariables {

    String sub_code;
    String sub_name;
    String date;
    int slot;
    int semester;
    static int tempSem;  //For sql query pertaining to semester

    TTvariables(String sub_code, String sub_name, String date, int slot, int semester) {
        this.sub_code = sub_code;
        this.sub_name = sub_name;
        this.date = date;
        this.slot = slot;
        this.semester = semester;
    }
}




//Class to link to database
class timeTableDAO {

    Connection con = null;

    //Connect to the database
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "Jaimin", "Jaimin@2001");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Creting prepared statements and executing insertion queries.
    public void addTimeTable(TTvariables [] ttarr) {

        String TTquery = "Insert into ExamTT values(?,?,?,?,?)" ;
        PreparedStatement pst;

        try {
            //subject code //Subject_name //time  //year
            for (int i = 0; i < 6; i++) {
                pst = con.prepareStatement(TTquery);
                pst.setString(1, ttarr[i].sub_code);
                pst.setString(2, ttarr[i].sub_name);
                pst.setString(3, ttarr[i].date);
                pst.setInt(4, ttarr[i].slot);
                pst.setInt(5, ttarr[i].semester);
                pst.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }
}

// To assign the invigilators -- Main logic of the program.
class assignInvigDAO {

    static int [] invigCount = new int[54]; //for storing all id_s of exam assigned invigs--This is gold for individual profiling of invigilators
    static int [] count = new int[] {0, 0, 0}; //Store assistant,associate,professor invigilators in the order mentioned


    Connection con = null;

    //Connect to database
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "Jaimin", "Jaimin@2001");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    Statement st = null;
    // Querying from database
    public void assignInvig() {
        String query = "Select prof_id,designation from professor WHERE prof_branch='" + Dashboard_1.subjectVariables.subject + "'ORDER BY designation";
        ResultSet rs = null;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }

        //At this stage we have entries of all prof from specified branch in rs.



        //Main logic to assign professors to all the 3 years of selected branch.
        int [] arrSem = new int[3];
        TTvariables.tempSem = 3;
        if (TTvariables.tempSem == 3) { //Assuming that the admin has started entering TT from 3rd sem onwards
            arrSem[0] = 3;
            arrSem[1] = 5;
            arrSem[2] = 7;
        } else {
            arrSem[0] = 4;
            arrSem[1] = 6;
            arrSem[2] = 8;
        }




        //Number of years
        for (int i = 0; i < 3; i++) {

            int[] invig_id = new int[18];  //To populate 1 complete year in a single row (6*3=18)
            int p = 0;
            //Number of sections per year
            for (int j = 0; j < 6; j++) {

                //3 subgroups of each section in that particular year
                for (int k = 0; k < 3; k++) {

                    //logic:- fetch ids of professors arranged alphabetically and assign them to the Year_2 table
                    try {
                        rs.next();
                        int id = rs.getInt(1);
                        invig_id[p++] = id;
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }//innermost(group) loop closed.

            }//Middle(section) loop closed.

            //Time to transfer the entire accumulated data in array to the respective row of the database.


            populateInvig(invig_id, arrSem[i]);

        }//Years complete and at this stage 3 rows of the Year_2 data are populated which are to be used later in SectionData



    }//End of function



    //Method to populate the invigilator's table
    public void populateInvig(int [] invig_id, int arrSem) {
        String query = "Insert into Year_2(branch,semester,sec_a1,sec_a2,sec_a3,sec_b1,sec_b2,sec_b3,sec_c1,sec_c2,sec_c3,sec_d1,sec_d2,sec_d3,sec_e1,sec_e2,sec_e3,sec_f1,sec_f2,sec_f3) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = null;

        //Populate the branch and semester
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, Dashboard_1.subjectVariables.subject);
            pst.setInt(2, arrSem);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        //Populate invigilators for each sub_group
//        Testing purpose  for(int i=0;i<18;i++)
//          {
//              System.out.println(invig_id[i]);
//          }
        for (int i = 0; i < 18; i++) {
            try {
                pst.setInt(i + 3, invig_id[i]);

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        try {
            //No of rows modified/uploaded to database
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//Invigilators successfully saved in the database.

    //Code to display count in Dashboard_2
    public void invigCount() {
        String countQuery = "Select * from Year_2 where branch='" + Dashboard_1.subjectVariables.subject + "'";
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(countQuery);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        int ct = 4; //Toiterate invig_ids in Year_2 table
        String [] finalCountQuery = new String[54]; //To store queries for each professor
        try {
            rs.next(); //For moving to the first fetched row
            for (int i = 0; i < 54; i++) {


                invigCount[i] = rs.getInt(ct);
                ct += 1;
                finalCountQuery[i] = "Select designation from professor where prof_id=" + invigCount[i];
                if (ct == 22) {
                    ct = 4;
                    rs.next(); //after completing 1 row then move to next one bcoz rs.next() moves to nect row
                }


                //Testing purpose

            }

            //Testing purpose  System.out.println();
        } catch (SQLException ex) {
            System.out.println(ex);
        }


        //Executing individual professor queries and storing their count
        for (int i = 0; i < 54; i++) {


            try {
                st = con.createStatement();
                rs = st.executeQuery(finalCountQuery[i]);
            } catch (SQLException ex) {
                System.out.println(ex);
            }

            try {
                rs.next();
                String s = rs.getString(1);

                if (s.equals("Assistant")) { //s=="Assistant doesn't work" find reason.
                    count[0]++;


                } else if (s.equals("Associate")) {
                    count[1]++;

                } else {
                    count[2]++;


                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        System.out.println(count[0] + " " + count[1] + " " + count[2]);



    }
}

