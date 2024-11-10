/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author mochr
 */
public class BankBeraksi {
    public static void main(String[] args){
        Bank bank = new Bank(150000);
        
        System.out.println("Slamat Datang di Bank ABC");
        System.out.println("Saldo Saat ini " + bank.getSaldo());
        bank.simpanUang(150000);
        bank.ambilUang(50000);
    }
}
