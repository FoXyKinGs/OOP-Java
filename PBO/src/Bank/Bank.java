/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author mochr
 */
public class Bank {
    protected int saldo;
    
    public Bank(int saldo) {
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: " + jumlah);
        System.out.println("Saldo saat ini: " + getSaldo());
    }
    
    public void ambilUang(int jumlah) {
        saldo -= jumlah;
        System.out.println("Ambil uang: " + jumlah);
        System.out.println("Saldo saat ini: " + getSaldo());
    }
}
