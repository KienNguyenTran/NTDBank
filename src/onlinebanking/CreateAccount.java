/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlinebanking;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CreateAccount extends javax.swing.JFrame {
    public static String AccNum;
    public Connection conn;
    private static String DB_URL ="jdbc:sqlserver://localhost:1500;" 
            + "databaseName=NTD_Bank;" + "integratedSecurity=true";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "03082004khoi";

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
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

        Background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        AccountNumber = new javax.swing.JTextField();
        AccNumLB = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        UsernameLB = new javax.swing.JLabel();
        PasswordLB = new javax.swing.JLabel();
        RePassLB = new javax.swing.JLabel();
        CreateBtn = new javax.swing.JButton();
        BackButton = new javax.swing.JLabel();
        CloseButton = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        rePassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackgroundMouseEntered(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add profile.png"))); // NOI18N

        Heading.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(0, 204, 153));
        Heading.setText("Create Your Bank Account");

        AccountNumber.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        AccountNumber.setToolTipText("Enter your Account Number");
        AccountNumber.setEnabled(false);

        AccNumLB.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        AccNumLB.setText("Account Number");

        Username.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        Username.setToolTipText("Enter your Username");

        UsernameLB.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        UsernameLB.setText("Username");

        PasswordLB.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        PasswordLB.setText("Enter Password");

        RePassLB.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        RePassLB.setText("Re-enter Password");

        CreateBtn.setBackground(new java.awt.Color(0, 204, 153));
        CreateBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        CreateBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateBtn.setText("Create");
        CreateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/goback.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });

        CloseButton.setBackground(new java.awt.Color(255, 0, 0));
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close-btn.png"))); // NOI18N
        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });

        Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        rePassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(Heading)
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseButton))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(CreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(377, 377, 377))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(Logo)
                        .addGap(394, 394, 394))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordLB)
                            .addComponent(AccNumLB)
                            .addComponent(AccountNumber)
                            .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(UsernameLB)
                            .addComponent(RePassLB)
                            .addComponent(Password)
                            .addComponent(rePassword))
                        .addGap(298, 298, 298))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addComponent(Heading)
                .addGap(18, 18, 18)
                .addComponent(AccNumLB)
                .addGap(18, 18, 18)
                .addComponent(AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UsernameLB)
                .addGap(18, 18, 18)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordLB)
                .addGap(18, 18, 18)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RePassLB)
                .addGap(18, 18, 18)
                .addComponent(rePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new InfoCreate().setVisible(true);
    }//GEN-LAST:event_BackButtonMouseClicked

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // TODO add your handling code here:
        boolean PassLength = PasswordLength();
        boolean PassCheck = PasswordCheck();
        
        if(PassLength == true && PassCheck == true)
        {
           try
           {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
                String query = "insert into LoginDetail(AccountNumber, Username, Password) values(?,?,?)";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, AccountNumber.getText());
                pst.setString(2, Username.getText());
                pst.setString(3, Password.getText());
                pst.execute();
                setVisible(false);
                dispose();
                new AccountCreated().setVisible(true);
           }catch(ClassNotFoundException | SQLException e)
           {
               JOptionPane.showMessageDialog(null, e);
           }
         
        }
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void BackgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseEntered
        // TODO add your handling code here:
        String AC = new InfoCreate().AccNumber;
        AccountNumber.setText(AC);
    }//GEN-LAST:event_BackgroundMouseEntered
    public boolean PasswordLength()
    {
        String pass = Password.getText();
        if(pass.length()>5 && pass.length()<=12)
        {
            Password.setBackground(new Color(0,204,153));
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please enter valid password with minimum 6 characters and maximum 12 characters !");
            Password.setBackground(new Color(246,53,40));
            return false;
        }
    }
    public boolean PasswordCheck()
    {
        String pass = Password.getText();
        String repass = rePassword.getText();
        if(pass.equals(repass))
        {
            rePassword.setBackground(new Color(0,204,153));
            return true;
        }
        else
        {
            if("".equals(repass))
            {
                JOptionPane.showMessageDialog(null, "Please enter Re-Password !");
                return false;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter the same Password !");
                rePassword.setBackground(new Color(246,53,40));
                return false;
            }
        }
    }
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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccNumLB;
    private javax.swing.JTextField AccountNumber;
    private javax.swing.JLabel BackButton;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordLB;
    private javax.swing.JLabel RePassLB;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel UsernameLB;
    private javax.swing.JPasswordField rePassword;
    // End of variables declaration//GEN-END:variables
}
