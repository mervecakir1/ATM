/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmprojectfinal;
import javax.swing.JOptionPane;

/**
 *
 * @author ABDUURAHMAN
 */
public class seconScreen extends javax.swing.JFrame {
    private costumers[] customers;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton balance;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton deposte;
    private javax.swing.JButton exchange;
    private javax.swing.JButton information;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton withdraw;
     private int rank; 
            
            public void setrank(int a){
                this.rank=a;
            }
    public seconScreen() {
       
        initComponents();
    }
     public void setCustomers(costumers[] customers) {
        this.customers = customers; // Set the customers array
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    

   
    @SuppressWarnings("unchecked")
     private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        withdraw = new javax.swing.JButton();
        information = new javax.swing.JButton();
        deposte = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        changePassword = new javax.swing.JButton();
        exchange = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        EXIT = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 102));
        setForeground(new java.awt.Color(255, 51, 51));

        withdraw.setBackground(new java.awt.Color(0, 204, 204));
        withdraw.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        withdraw.setForeground(new java.awt.Color(0, 0, 0));
        withdraw.setText("withdraw");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        information.setBackground(new java.awt.Color(255, 255, 51));
        information.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        information.setForeground(new java.awt.Color(0, 0, 0));
        information.setText("information");
        information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationActionPerformed(evt);
            }
        });

        deposte.setBackground(new java.awt.Color(255, 255, 51));
        deposte.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        deposte.setForeground(new java.awt.Color(0, 0, 0));
        deposte.setText("deposte");
        deposte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposteActionPerformed(evt);
            }
        });

        balance.setBackground(new java.awt.Color(0, 204, 204));
        balance.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        balance.setForeground(new java.awt.Color(0, 0, 0));
        balance.setText("balance");
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });

        changePassword.setBackground(new java.awt.Color(0, 204, 204));
        changePassword.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        changePassword.setForeground(new java.awt.Color(0, 0, 0));
        changePassword.setText("change password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });

        exchange.setBackground(new java.awt.Color(255, 255, 51));
        exchange.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        exchange.setForeground(new java.awt.Color(0, 0, 0));
        exchange.setText("exchange");
        exchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangeActionPerformed(evt);
            }
        });

        jTextPane1.setBackground(new java.awt.Color(153, 153, 255));
        jTextPane1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(204, 0, 0));
        jTextPane1.setText("WELCOME TO OUR  ATM");
        jScrollPane1.setViewportView(jTextPane1);

        EXIT.setBackground(new java.awt.Color(204, 0, 51));
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(balance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdraw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deposte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exchange, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(information, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(EXIT)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(information, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(changePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(EXIT)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>    
    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String b =JOptionPane.showInputDialog("HOW MUCH MONAY DO YOU WANT?");    
        double w = Double.parseDouble(b);
        customers[this.rank].withdraw(w);   
    }                                        
    private void informationActionPerformed(java.awt.event.ActionEvent evt) {                                            
        customers[this.rank].info();   
    }                                           
    private void deposteActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String b =JOptionPane.showInputDialog("HOW MUCH MONAY DO YOU WANT TO DEPOSTE?");    
        double w = Double.parseDouble(b);
       customers[this.rank].deposte(w);
    }                                       
    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {                                        
        customers[this.rank].balanace();
    }                                       
    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String pass= JOptionPane.showInputDialog("Enter the old password:");
        int a = Integer.parseInt(pass);
        customers[this.rank].changePassword(a);
    }                                              
    private void exchangeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        customers[this.rank].exchange();         
    }                                       
    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {                                     
        System.exit(0);
        
        
        
    }                                    
   
   
    public static void main(String args[]) {
     

      
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(seconScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seconScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seconScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seconScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seconScreen().setVisible(true);
            }
        });
    }
}
