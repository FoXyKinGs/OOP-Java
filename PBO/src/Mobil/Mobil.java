/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author mochr
 */
public class Mobil {
    String warna;
    int TahunProduksi;
    
    public Mobil(String warna, int tahunProduksi) {
        this.warna = warna;
        this.TahunProduksi = tahunProduksi;
    }
    
    public void info() {
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + TahunProduksi);
    }
}
