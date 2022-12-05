package Login;

import CEO.CEOHomePage;
import CEO.CreateProject;
import CEO.HandleEmployeeRecords;
import CEO.HandlePromotions;
import CEO.Projects;
import CEO.SpecificProject;
import HRManager.HRManagerHomePage;
import HRManager.HireNewEmployee;
import HRManager.ManageEmployees;
import HRManager.ViewAllApplications;
import HRManager.ViewShortlistedApplications;
import Login.CurrentUser;
import ProjectManager.NewMessage;
import ProjectManager.NoticeBoard;
import ProjectManager.ProjectManagerHome;
import SoftwareDeveloper.SoftwareDevHome;
import SoftwareDeveloper.ViewTask;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
   public static Connection conn = null;


    
    public Login() {
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

        loginPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        appNameLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        forgotPasswordBtn = new javax.swing.JButton();
        loginImage = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App");
        setBackground(new java.awt.Color(255, 255, 255));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        menuPanel.setBackground(new java.awt.Color(46, 133, 243));

        appNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        appNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        appNameLabel.setText("WorkOtter");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(appNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(592, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appNameLabel)
                .addContainerGap())
        );

        loginLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(46, 133, 243));
        loginLabel.setText("Login");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameLabel.setText("Username:");

        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel.setText("Password:");

        forgotPasswordBtn.setBackground(new java.awt.Color(46, 133, 243));
        forgotPasswordBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        forgotPasswordBtn.setForeground(new java.awt.Color(255, 255, 255));
        forgotPasswordBtn.setText("Login");
        forgotPasswordBtn.setBorder(null);
        forgotPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordBtnActionPerformed(evt);
            }
        });

        loginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image.png"))); // NOI18N

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(loginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(forgotPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(loginImage)
                        .addGap(102, 102, 102))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(forgotPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:      
        
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void forgotPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordBtnActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == forgotPasswordBtn)
        {
                String userText;
            String pwdText;
               String cu = "";
              int f = 0;
            userText =  usernameTextField.getText();
            pwdText  =   jPasswordField1.getText();
            
            Statement statement;
            try {
                statement = conn.createStatement();
                 String q  = "SELECT * FROM employees ";
                 ResultSet rs = statement.executeQuery(q);
             
                 while(rs.next())
                 {
                        String u = rs.getString("username");
                        String p = rs.getString("password");
                        
                        
                        if(userText.equals(u)  && pwdText.equals(p))
                        {
                            String d = rs.getNString("designation");
                            cu = u;
                          
                            if(d.equals("CEO"))
                                 f  =  1;
                            else if(d.equals("Project Manager"))
                                 f = 2;
                                 else if(d.equals("HR"))
                                     f = 3;
                                 else if(d.equals("Developer"))
                                     f = 4;
                                 
                                
                        }
                       
                            
                 }
            
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
     
             if (f == 3) {
                 CurrentUser.setUser(cu);
                HRManagerHomePage  p = new HRManagerHomePage();
                p.show();
                dispose();
            }
             else if(f == 1)
             {
                CurrentUser.setUser(cu);
              CEOHomePage  c = new CEOHomePage();
                c.show();
                dispose();
             }
             else if(f == 2)
             {
                CurrentUser.setUser(cu);
                ProjectManagerHome  h = new ProjectManagerHome();
                h.show();
                dispose();
             
             }
             
             else if(f == 4)
             {
                 CurrentUser.setUser(cu);
                SoftwareDevHome  s = new SoftwareDevHome();
                 s.show();
                dispose();
             }
             else  if(f == 0){
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        
        }
    }//GEN-LAST:event_forgotPasswordBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
 
     
     
 
    
    
    
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn =  DBCon.connectDB();
         
          
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("ConnectionUtil : "+ex.getMessage());
           
        }
        
    
    
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
                //new HRManagerHomePage().setVisible(true);
                
                //new ManageEmployees().setVisible(true);
                
               // new HireNewEmployee().setVisible(true);
               
               //new ViewAllApplications().setVisible(true);
               
               //new ViewShortlistedApplications().setVisible(true);
               
               //new CEOHomePage().setVisible(true);
               
              // new CreateProject().setVisible(true);
              
              //new HandleEmployeeRecords().setVisible(true);
              
              //new HandlePromotions().setVisible(true);
              
              //new SpecificProject().setVisible(true);
              
              //new Projects().setVisible(true);
              
              //new NewMessage().setVisible(true);
              //new NoticeBoard().setVisible(true);
              
              //new ViewTask().setVisible(true);
              
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JButton forgotPasswordBtn;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel loginImage;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
