/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onlinebanking;
import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;
import static onlinebanking.Transfer.AccountNo;
import static onlinebanking.Transfer.ReceiverAccountNum;

/**
 *
 * @author Admin
 */
public class Withdraw extends javax.swing.JFrame {

    public String AccNum = new Login().AccountNum;
    public Connection conn;
    private static String DB_URL ="jdbc:sqlserver://localhost:1500;" 
            + "databaseName=NTD_Bank;" + "integratedSecurity=true";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "03082004khoi";
    public String AmountWithdraw;
    /**
     * Creates new form Withdraw
     */
    public Withdraw() {
        initComponents();
        GetAccountInfo();
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
        Heading = new javax.swing.JPanel();
        HeadingLb = new javax.swing.JLabel();
        AccountNumber = new javax.swing.JLabel();
        AvailableBalance = new javax.swing.JLabel();
        AccNumTF = new javax.swing.JTextField();
        BalanceTF = new javax.swing.JTextField();
        Amount = new javax.swing.JLabel();
        AmountTF = new javax.swing.JTextField();
        WithdrawBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JLabel();
        TotalRemaining = new javax.swing.JLabel();
        RemainingTF = new javax.swing.JTextField();
        ShowBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WithdrawHis = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Heading.setBackground(new java.awt.Color(0, 204, 153));

        HeadingLb.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        HeadingLb.setForeground(new java.awt.Color(255, 255, 255));
        HeadingLb.setText("WITHDRAW");

        javax.swing.GroupLayout HeadingLayout = new javax.swing.GroupLayout(Heading);
        Heading.setLayout(HeadingLayout);
        HeadingLayout.setHorizontalGroup(
            HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HeadingLb)
                .addGap(423, 423, 423))
        );
        HeadingLayout.setVerticalGroup(
            HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadingLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(HeadingLb)
                .addGap(39, 39, 39))
        );

        AccountNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccountNumber.setText("Account Number:");

        AvailableBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AvailableBalance.setText("Available Balance:");

        AccNumTF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        AccNumTF.setEnabled(false);

        BalanceTF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BalanceTF.setEnabled(false);

        Amount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Amount.setText("Amount:");

        AmountTF.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        WithdrawBtn.setBackground(new java.awt.Color(0, 204, 153));
        WithdrawBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WithdrawBtn.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawBtn.setText("Withdraw");
        WithdrawBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WithdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/goback.png"))); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        TotalRemaining.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalRemaining.setText("Total Remaining Amount:");

        RemainingTF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        RemainingTF.setEnabled(false);

        ShowBtn.setBackground(new java.awt.Color(0, 204, 153));
        ShowBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/check-sm.png"))); // NOI18N
        ShowBtn.setText("Show");
        ShowBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("$");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("$");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("$");

        WithdrawHis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WithdrawHis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "AccountNumber", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(WithdrawHis);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Withdraw History");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackBtn)
                .addContainerGap())
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AccountNumber)
                            .addComponent(AvailableBalance)
                            .addComponent(Amount)
                            .addComponent(TotalRemaining)
                            .addComponent(AccNumTF, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(BalanceTF)
                            .addComponent(AmountTF)
                            .addComponent(RemainingTF))
                        .addGap(18, 18, 18)
                        .addComponent(ShowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(WithdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountNumber)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(AccNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvailableBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BalanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(Amount)
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(TotalRemaining)
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RemainingTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(54, 54, 54)
                        .addComponent(WithdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(BackBtn)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_BackBtnMouseClicked

    private void WithdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawBtnActionPerformed
        // TODO add your handling code here:
        String Remaining = RemainingTF.getText();
        AmountWithdraw = AmountTF.getText();
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
           String query = "Update CustomerDetail set Balance='"+Remaining+"' where AccountNumber='"+AccNum+"'";
           PreparedStatement pst = conn.prepareStatement(query);
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           String Date = sdf.format(new java.util.Date());
           String query2 = "Insert into WithdrawHistory(Date,AccountNumber,Amount) values('"+Date+"','"+AccountNo+"','"+AmountWithdraw+"')";
           PreparedStatement pst2 = conn.prepareStatement(query2);
           pst.execute();
           pst2.execute();
           JOptionPane.showMessageDialog(null,"Withdraw Successfully !");
           WithdrawHistory();
           
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_WithdrawBtnActionPerformed

    private void ShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBtnActionPerformed
        // TODO add your handling code here:
        
        AmountWithdraw = AmountTF.getText();
        String Balance = BalanceTF.getText();
        int WithdrawAmount = Integer.parseInt(AmountWithdraw);
        int BalanceAvai = Integer.parseInt(Balance);
        
        try{
            if(WithdrawAmount > BalanceAvai || "0".equals(AmountWithdraw))
            {
                JOptionPane.showMessageDialog(null, "Amount you want to withdraw is out of your Available Balance or you cannot withdraw 0$ ! Please enter another amount !","ERROR",JOptionPane.ERROR_MESSAGE);
                AmountTF.setBackground(new Color(246,53,40));
                AmountTF.setText("");
                RemainingTF.setText("");
            }
            else
            {
                int Total = BalanceAvai - WithdrawAmount;
                String value = String.valueOf(Total);
                AmountTF.setBackground(new Color(0,204,153));
                RemainingTF.setText(value);
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_ShowBtnActionPerformed

    public void GetAccountInfo()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            String query = "Select LoginDetail.AccountNumber,CustomerDetail.Balance from LoginDetail inner join CustomerDetail on LoginDetail.AccountNumber=CustomerDetail.AccountNumber where LoginDetail.AccountNumber='"+AccNum+"'";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                AccNumTF.setText(rs.getString("AccountNumber"));
                String balance;
                balance = rs.getString("Balance");
                BalanceTF.setText(balance);
            }
            conn.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void WithdrawHistory()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            String query = "Select * from WithdrawHistory where AccountNumber='"+AccountNo+"'";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel)WithdrawHis.getModel();
            tableModel.setRowCount(0);
            while(rs.next())
            {
                String WithdrawDate = rs.getString("Date");
                String AccNumber = rs.getString("AccountNumber");
                String Amount = rs.getString("Amount");
                String SenderTableData[] ={WithdrawDate, AccNumber, Amount};
                tableModel = (DefaultTableModel)WithdrawHis.getModel();
                tableModel.addRow(SenderTableData);
            }
            conn.close();       
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccNumTF;
    private javax.swing.JLabel AccountNumber;
    private javax.swing.JLabel Amount;
    private javax.swing.JTextField AmountTF;
    private javax.swing.JLabel AvailableBalance;
    private javax.swing.JLabel BackBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JTextField BalanceTF;
    private javax.swing.JPanel Heading;
    private javax.swing.JLabel HeadingLb;
    private javax.swing.JTextField RemainingTF;
    private javax.swing.JButton ShowBtn;
    private javax.swing.JLabel TotalRemaining;
    private javax.swing.JButton WithdrawBtn;
    private javax.swing.JTable WithdrawHis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
