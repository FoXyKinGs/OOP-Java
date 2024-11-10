/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author mochr
 */
public class MobilKu {
    public static void main(String[] args) {
        //Declare constructor karena wajib, tapi nanti diganti sama data baru
        Mobil mobilku = new Mobil("Hitam", 2000);
        
        mobilku.warna = "Putih";
        mobilku.TahunProduksi = 1990;
        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun Produksi: " + mobilku.TahunProduksi);
    }
}
