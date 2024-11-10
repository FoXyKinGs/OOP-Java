/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author mochr
 */
public class BankAccount {
    private double balance; 
    private int accountNumber;

    public BankAccount(int accountNumber){
       balance = 0;
       this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
      balance = balance + amount;
    }

    public void withdraw(double amount){
	    balance = balance - amount;
    }
    
    public int getAccountNumber(){   
        return accountNumber;
    }
   
    public double getBalance(){
      return balance;
    }

}
