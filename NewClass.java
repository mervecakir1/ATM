/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmprojectfinal;


/**
 *
 * @author ABDUURAHMAN
 */
public class NewClass extends javax.swing.JFrame {
   
     
       private costumers[] customers;
    javax.swing.JButton EnteringThePassword;
    javax.swing.JTextPane greeting;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTextPane jTextPane1;
    javax.swing.JPasswordField password;
    
     public NewClass() {
        initComponents();
    }
     public void setCustomers(costumers[] customers) {
        this.customers = customers; // Set the customers array
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        EnteringThePassword = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        greeting = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        password = new javax.swing.JPasswordField();

        
        

        EnteringThePassword.setBackground(new java.awt.Color(51, 255, 0));
        EnteringThePassword.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        EnteringThePassword.setForeground(new java.awt.Color(0, 0, 0));
        EnteringThePassword.setText("ENTER");
        EnteringThePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnteringThePasswordActionPerformed(evt);
            }
        });

        greeting.setBackground(new java.awt.Color(255, 102, 102));
        greeting.setFont(new java.awt.Font("Stencil", 3, 24)); // NOI18N
        greeting.setForeground(new java.awt.Color(51, 0, 51));
        greeting.setText("WELCOME TO SIMA BANK ATM");
        jScrollPane1.setViewportView(greeting);

        jTextPane1.setBackground(new java.awt.Color(255, 102, 102));
        jTextPane1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane1.setText("PLEASE ENTER THE PASSWORD");
        jScrollPane2.setViewportView(jTextPane1);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(EnteringThePassword)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnteringThePassword)
                .addGap(99, 99, 99))
        );

        pack();
    }                     

    private void EnteringThePasswordActionPerformed(java.awt.event.ActionEvent evt) {   
        seconScreen o =new seconScreen();
        String pass =password.getText();
        int a = Integer.parseInt(pass),r=0;
            for (int i = 0; i < customers.length; i++) {
                if(a==customers[i].getPassword()){
                    r=i;
                    break;
                }
            }
         o.setrank(r);
         o.setCustomers(customers);
        if(customers[r].login(pass)==true){
            o.setVisible(true);
        } 
    }                                          
    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                         
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewClass().setVisible(true);
                costumers costumer[]= new costumers[57];
            }
            
        });  
    }
}
