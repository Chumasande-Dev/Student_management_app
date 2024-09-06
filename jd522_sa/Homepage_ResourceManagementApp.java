/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jd522_sa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author liyam
 */
public class Homepage_ResourceManagementApp extends javax.swing.JFrame {
private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
private DefaultTableModel  tableModel;
private DefaultTableModel  tableModel2;
private DefaultTableModel  tableModel3;
private DefaultTableModel  tableModel4;
    /**
     * Creates new form Homepage_ResourceManagementApp
     */
    public Homepage_ResourceManagementApp() {
        initComponents();
         con = MyConnection.connectionDB();

        tableModel = (DefaultTableModel) StudentTable.getModel();
        tableModel2 = (DefaultTableModel) depTable.getModel();
       tableModel3 = (DefaultTableModel) ftable.getModel();
       tableModel4 = (DefaultTableModel) CTable.getModel();
    }
private void UpdateStudent(){
        String query = "SELECT * FROM Student";
        try {
           ps = con.prepareStatement(query); 
            rs = ps.executeQuery();

            // Clear what's in the table
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            // Add information to the JTable
            while (rs.next()) {
                Object[] row = {
                    rs.getString("Student_id"),
                    rs.getString("Student_name"),
                    rs.getString("Student_Surname"),
                    rs.getString("Department_id"),
                };
                tableModel.addRow(row);
            }
            rs.close();  // Close the result set
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
       }}
private void UpdateFaculty(){
        String query = "SELECT * FROM faculty";
        try {
           ps = con.prepareStatement(query); 
            rs = ps.executeQuery();

            // Clear what's in the table
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            // Add information to the JTable
            while (rs.next()) {
                Object[] row = {
                    rs.getString("faculty_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("course_id"),
                    rs.getString("course_name"),
                    rs.getString("grades"),
                    rs.getString("enrolled_students"),
                    rs.getString("department_id"),
                };
                tableModel3.addRow(row);
            }
            rs.close();  // Close the result set
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
       }}
private void Update3(){
        String query = "SELECT * FROM Department";
        try {
           ps = con.prepareStatement(query); 
            rs = ps.executeQuery();

            // Clear what's in the table
            while (tableModel2.getRowCount() > 0) {
                tableModel2.removeRow(0);
            }
            // Add information to the JTable
            while (rs.next()) {
                Object[] row = {
                    rs.getString("Department_id"),
                    rs.getString("Department_Name"),
                    rs.getString("Department Head"),
                    //rs.getString("Department_id"),
                };
                tableModel2.addRow(row);
            }
            rs.close();  // Close the result set
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
       }}

private void UpdateCourse(){
        String query = "SELECT * FROM Course";
        try {
           ps = con.prepareStatement(query); 
            rs = ps.executeQuery();

            // Clear what's in the table
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            // Add information to the JTable
            while (rs.next()) {
                Object[] row = {
                    rs.getString("Course_id"),
                    rs.getString("Course_name"),    
                    rs.getString("Department_id"),
                };
                tableModel4.addRow(row);
            }
            rs.close();  // Close the result set
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
       }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Coursebtn = new javax.swing.JButton();
        Studentv = new javax.swing.JButton();
        facultyv = new javax.swing.JButton();
        Depv = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        parentp = new javax.swing.JPanel();
        HomePage = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Coursep = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CTable = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        Studentp = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtdep = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtStudentno = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Department = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        depTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Facultyp = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        addFacultybtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ftable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2365, 351, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2365, 449, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2365, 370, -1, -1));

        jPanel4.setBackground(new java.awt.Color(102, 102, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Resource Management Application");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to the CTU ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 820, 100));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Coursebtn.setBackground(new java.awt.Color(255, 255, 153));
        Coursebtn.setText("Course");
        Coursebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoursebtnActionPerformed(evt);
            }
        });

        Studentv.setBackground(new java.awt.Color(255, 255, 153));
        Studentv.setText("Adminstration");
        Studentv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentvActionPerformed(evt);
            }
        });

        facultyv.setBackground(new java.awt.Color(255, 255, 153));
        facultyv.setText("Faculty");
        facultyv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyvActionPerformed(evt);
            }
        });

        Depv.setBackground(new java.awt.Color(255, 255, 153));
        Depv.setText("Department");
        Depv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepvActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel20.setBackground(new java.awt.Color(255, 255, 153));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Course management");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Register");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Update info");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Transcript");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Department offered");

        jButton11.setBackground(new java.awt.Color(255, 255, 153));
        jButton11.setText("Student");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Grades");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Schedule");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Study Guide");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Faculty offerings");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(facultyv)
                                    .addComponent(Depv)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Coursebtn)
                                .addGap(53, 53, 53)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(Studentv)
                                .addGap(20, 47, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Studentv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Coursebtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(facultyv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Depv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 600));

        parentp.setLayout(new java.awt.CardLayout());

        HomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jd522_sa/images_java/Backg.jpg"))); // NOI18N
        jLabel19.setText("jLabel19");
        HomePage.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1190, 510));

        parentp.add(HomePage, "card6");

        jLabel3.setText("Parent");
        parentp.add(jLabel3, "card2");

        Coursep.setBackground(new java.awt.Color(255, 255, 153));

        CTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Foundation Medicine", "Fitting and turning", "Cyber Security"
            }
        ));
        jScrollPane3.setViewportView(CTable);

        jButton12.setText("Add new");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CoursepLayout = new javax.swing.GroupLayout(Coursep);
        Coursep.setLayout(CoursepLayout);
        CoursepLayout.setHorizontalGroup(
            CoursepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursepLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CoursepLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addGap(288, 288, 288))
        );
        CoursepLayout.setVerticalGroup(
            CoursepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursepLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton12)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        parentp.add(Coursep, "card4");

        Studentp.setBackground(new java.awt.Color(204, 255, 153));

        jLabel5.setText("Student");

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Studeny ID", "Name", "Surname", "Department_ID"
            }
        ));
        StudentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StudentTable);

        addbtn.setText("Add New");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Name:");

        jLabel9.setText("Surname:");

        jLabel10.setText("Department_ID");

        txtStudentId.setText("Student ID:");

        jButton4.setText("Delete");

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("Search");

        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 153));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Adminstration");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science", "Engineering", "Technology", "Medicine" }));

        jLabel14.setText("Enroll");

        javax.swing.GroupLayout StudentpLayout = new javax.swing.GroupLayout(Studentp);
        Studentp.setLayout(StudentpLayout);
        StudentpLayout.setHorizontalGroup(
            StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentpLayout.createSequentialGroup()
                        .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(StudentpLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(addbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addGroup(StudentpLayout.createSequentialGroup()
                                .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtStudentId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(12, 12, 12)
                                .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStudentno)
                                    .addComponent(txtSurname))
                                .addGap(67, 67, 67))
                            .addGroup(StudentpLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdep))
                            .addGroup(StudentpLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(StudentpLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jButton6)
                        .addGap(143, 143, 143))
                    .addGroup(StudentpLayout.createSequentialGroup()
                        .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StudentpLayout.createSequentialGroup()
                                .addGap(689, 689, 689)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(StudentpLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(88, Short.MAX_VALUE))))
        );
        StudentpLayout.setVerticalGroup(
            StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentpLayout.createSequentialGroup()
                .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentpLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))
                        .addGap(511, 511, 511)
                        .addComponent(jLabel5))
                    .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StudentpLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtStudentId)
                                .addComponent(txtStudentno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(109, 109, 109)
                            .addGroup(StudentpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton5)
                                .addComponent(addbtn)
                                .addComponent(jButton4)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentpLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parentp.add(Studentp, "card3");

        Department.setBackground(new java.awt.Color(255, 255, 204));

        depTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Department ID", "Department Name", "Department Head"
            }
        ));
        jScrollPane4.setViewportView(depTable);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Department management");

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DepartmentLayout = new javax.swing.GroupLayout(Department);
        Department.setLayout(DepartmentLayout);
        DepartmentLayout.setHorizontalGroup(
            DepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepartmentLayout.createSequentialGroup()
                .addGroup(DepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepartmentLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DepartmentLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepartmentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(246, 246, 246))
        );
        DepartmentLayout.setVerticalGroup(
            DepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepartmentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepartmentLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DepartmentLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        parentp.add(Department, "card7");

        Facultyp.setBackground(new java.awt.Color(204, 255, 153));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Faculty Management");

        jButton7.setText("Delete");

        jButton8.setText("Add new");

        jButton9.setText("Update");

        jButton10.setText("Save");

        addFacultybtn.setText("Add");
        addFacultybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultybtnActionPerformed(evt);
            }
        });

        ftable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Faculty ID", "First_name", " last_name", "Course_id", "course_name", "Grades", "Enrolled Students", "Department ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(ftable);

        javax.swing.GroupLayout FacultypLayout = new javax.swing.GroupLayout(Facultyp);
        Facultyp.setLayout(FacultypLayout);
        FacultypLayout.setHorizontalGroup(
            FacultypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacultypLayout.createSequentialGroup()
                .addGroup(FacultypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacultypLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(FacultypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FacultypLayout.createSequentialGroup()
                                .addGroup(FacultypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton10)
                                    .addComponent(jButton8))
                                .addGap(56, 56, 56))))
                    .addGroup(FacultypLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FacultypLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FacultypLayout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacultypLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addFacultybtn)
                .addGap(151, 151, 151))
        );
        FacultypLayout.setVerticalGroup(
            FacultypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacultypLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addFacultybtn)
                .addGap(53, 53, 53)
                .addComponent(jLabel26)
                .addGap(383, 383, 383)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FacultypLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton7))
                .addGap(136, 136, 136))
        );

        parentp.add(Facultyp, "card5");

        getContentPane().add(parentp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 820, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     UpdateStudent();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try{
            String insertQuery = "INSERT INTO Student (Student_id,Student_name, Student_Surname,Department_id) VALUES (?, ?,?,?)"; 
        ps = con.prepareStatement(insertQuery); 
        ps.setString(1, txtStudentno.getText());
        ps.setString(2, txtname.getText());
        ps.setString(3, txtSurname.getText());
        ps.setString(4, txtdep.getText());
      
        ps.execute();
        JOptionPane.showConfirmDialog(rootPane, "Saved successfully to Database");
        
        }catch(Exception e){
        JOptionPane.showConfirmDialog(rootPane, "Not saved to DB!");
        e.printStackTrace();
        }
       UpdateStudent();
    }//GEN-LAST:event_addbtnActionPerformed

    private void StudentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTableMouseClicked

    }//GEN-LAST:event_StudentTableMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       UpdateStudent();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void addFacultybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacultybtnActionPerformed
         Faculty f = new Faculty();
        f.setVisible(true);
    }//GEN-LAST:event_addFacultybtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Department_page dpage = new Department_page();
        dpage.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      Courses c = new Courses();
      c.setVisible(true);
      
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Student_page sp = new Student_page();
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void DepvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepvActionPerformed
        parentp.removeAll();
        parentp.add(Department);
        parentp.repaint();
        parentp.revalidate();
        Update3();
    }//GEN-LAST:event_DepvActionPerformed

    private void facultyvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyvActionPerformed
        parentp.removeAll();
        parentp.add(Facultyp);
        parentp.repaint();
        parentp.revalidate();
        UpdateFaculty();
    }//GEN-LAST:event_facultyvActionPerformed

    private void StudentvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentvActionPerformed
        parentp.removeAll();
        parentp.add(Studentp);
        parentp.repaint();
        parentp.revalidate();
        UpdateStudent();
    }//GEN-LAST:event_StudentvActionPerformed

    private void CoursebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoursebtnActionPerformed
        parentp.removeAll();
        parentp.add(Coursep);
        parentp.repaint();
        parentp.revalidate();
       UpdateCourse();
    }//GEN-LAST:event_CoursebtnActionPerformed
//Update2();
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
            java.util.logging.Logger.getLogger(Homepage_ResourceManagementApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage_ResourceManagementApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage_ResourceManagementApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage_ResourceManagementApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage_ResourceManagementApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CTable;
    private javax.swing.JButton Coursebtn;
    private javax.swing.JPanel Coursep;
    private javax.swing.JPanel Department;
    private javax.swing.JButton Depv;
    private javax.swing.JPanel Facultyp;
    private javax.swing.JPanel HomePage;
    private javax.swing.JTable StudentTable;
    private javax.swing.JPanel Studentp;
    private javax.swing.JButton Studentv;
    private javax.swing.JButton addFacultybtn;
    private javax.swing.JButton addbtn;
    private javax.swing.JTable depTable;
    private javax.swing.JButton facultyv;
    private javax.swing.JTable ftable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel parentp;
    private javax.swing.JLabel txtStudentId;
    private javax.swing.JTextField txtStudentno;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtdep;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
