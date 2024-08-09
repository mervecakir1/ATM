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
public class costumers {


   
     private String name;
     private int accountNo;
     private double amount;
     private int password;
     

    public costumers(String name, int accountNo, double amount, int password) {
        this.name = name;
        this.accountNo = accountNo;
        this.amount = amount;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPassword(int password) {
        this.password = password;
    }
     public int getPassword() {
        return password;
    }
    public costumers() {
        
    }
    
     boolean login(String password) {
        if (password == null || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty.");
            return false;
        }
        try {
            int pass = Integer.parseInt(password);
            if (pass == this.password) {
                JOptionPane.showMessageDialog(null, "Hello, welcome " + this.name);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect password.");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid password format. Please enter numbers only.");
            return false;
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid withdrawal amount. Please enter a positive number.");
            return;
        }
        if (this.amount >= amount) {
            this.amount -= amount;
            JOptionPane.showMessageDialog(null, "You have withdrawn " + amount);
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds.");
        }
    }
    @Override
    public String toString() {
        return "account{" + "name=" + name + ", accountNo=" + accountNo + ", amount=" + amount +'}';
    }
    void info(){
        JOptionPane.showMessageDialog(null, toString());
    }
    void deposte (double a){
        this.amount+=a;
        JOptionPane.showMessageDialog(null,"you sucessfully deposite "+a+"\n you now have "+this.amount);
    }
    void balanace (){
        JOptionPane.showMessageDialog(null,"you have "+this.amount);
    }
    void changePassword(double a){
        
            if(a==this.password){
               String  code = JOptionPane.showInputDialog("Enter the new password");
               int newPassword = Integer.parseInt(code);
                this.password=newPassword;
                JOptionPane.showMessageDialog(null, "YOU HAVE CHANGED YOUR PASSWORD SUCESSFULLY");
            }else
                JOptionPane.showMessageDialog(null, "you didnot enter the correct password good bay!");
    }
    void  exchange (){
        String a = JOptionPane.showInputDialog("ENTER 1 FOR $ TO TL or 2 TL TO $");  
        int getOp = Integer.parseInt(a);
        if(getOp==1){
            String b = JOptionPane.showInputDialog("how much:");
            double dollars = Double.parseDouble(b);
            double temp =dollars;
            dollars = dollars * 28;
           String c = JOptionPane.showInputDialog("you have exchange "+temp+"$ to "+dollars+"tl \nwill you accept this? (1,0)");
            int accept=Integer.parseInt(c);
            if(accept==1){
                JOptionPane.showMessageDialog(null, "okay take your exchanged money!");
            }
            else{
                JOptionPane.showMessageDialog(null,"okay we are retruning your money.");
            }
        }
        else{
            String b = JOptionPane.showInputDialog("how much:");
            double turkish = Double.parseDouble(b);
            double  tempturk = turkish;
            turkish = turkish / 28;
           String r = JOptionPane.showInputDialog("you have exchanged "+tempturk+"tl to "+turkish+ "will you accept this? (1,0)");
              int accept=Integer.parseInt(r);
            if(accept==1){
                JOptionPane.showMessageDialog(null,"okay take your exchanged money!");
            }
            else{
                JOptionPane.showMessageDialog(null,"okay take your money!");
            }
        } 
    }
}