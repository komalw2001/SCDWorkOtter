/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HRManager;
import Login.CurrentUser;
import Login.DBCon;
import Login.Login;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class ViewShortlistedApplications extends javax.swing.JFrame {

    /**
     * Creates new form ViewShortlistedApplications
     */
    Connection con = null;
    public void LoadTable()
    {
        try {
            
         if (con == null){
         Class.forName("com.mysql.cj.jdbc.Driver");
        
            
            con = DBCon.connectDB();
         }
            String query = "Select * from shortlisted";
            Statement st = con.createStatement();
            ResultSet res;//
            res = st.executeQuery(query);
            
     /*
            while(res.next()){
            System.out.println(res.getString("name")+ " ");
            System.out.print(res.getString("password") + " ");
            System.out.print(res.getString("name") + " ");
            System.out.print(res.getString("salary") + " ");
            System.out.print(res.getString("designation"));
             }*/
            
              
        
            
            
            DefaultTableModel dtm = new DefaultTableModel();   
            String[] colName = {"name","id","designation","hiringstatus","contact"};
            dtm.setColumnIdentifiers(colName);
            jTable2.setModel(dtm);
            
            
            PreparedStatement pst = con.prepareStatement("Select name,id,designation,contact,hiringstatus from shortlisted ");
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) {
                
                
                String uname = rs.getString("id");
                String name = rs.getString("name");
                String salary = rs.getString("designation");
                String designation = rs.getString("hiringstatus");
                String skills = rs.getString("contact");
                
                
                dtm.addRow(new Object[]{uname, name, salary, designation,skills});
                
                System.out.println(uname + " " + name + " " + salary + " " + designation + " " + skills);
                
                i++;
            
          }
            
            //con.close();
     }
        catch (SQLIntegrityConstraintViolationException ex) {
            
            System.out.println("Primary key SQLEXception");
            ex.printStackTrace();
        }
     catch(Exception exc)
     {
         System.out.println("SQLEXception");
            exc.printStackTrace();
     }
    }
            
    public ViewShortlistedApplications() {
        
        initComponents();
        LoadTable();
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        appNameLabel = new javax.swing.JLabel();
        homeBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Nabeeha", null, "Project Manager", "12/10/2001", null, null},
                {"2", "Komal", null, "HR Manager", "12/10/2002", null, null},
                {"3", "Nisa", null, "Developer", "12/10/2003", null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Hiring_Status", "Age", "Degree", "Experience", "Recent Job"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        menuPanel.setBackground(new java.awt.Color(46, 133, 243));

        homeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(46, 133, 243));
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        appNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        appNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        appNameLabel.setText("WorkOtter");

        homeBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homeBtn1.setForeground(new java.awt.Color(46, 133, 243));
        homeBtn1.setText("Logout");
        homeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeBtn)
                .addGap(27, 27, 27)
                .addComponent(homeBtn1)
                .addGap(27, 27, 27))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appNameLabel)
                    .addComponent(homeBtn)
                    .addComponent(homeBtn1))
                .addGap(46, 46, 46))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HRManager/viewapplication.PNG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Shortlisted Applications");

        jTable2.setBackground(new java.awt.Color(204, 204, 255));
        jTable2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(51, 51, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Nabeeha", "NOT", "12", "HR", "2", "2"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Hiring_Status", "Age", "Degree", "Experience", "Recent Job"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(153, 153, 255));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        HRManagerHomePage hp = new HRManagerHomePage();
        hp.show();
        dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void homeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn1ActionPerformed
        // TODO add your handling code here:
        Login lgn = new Login();
        lgn.show();
        CurrentUser.logOut();
        dispose();
    }//GEN-LAST:event_homeBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewShortlistedApplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewShortlistedApplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewShortlistedApplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewShortlistedApplications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewShortlistedApplications().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton homeBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
