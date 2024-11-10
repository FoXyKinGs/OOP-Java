/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingkaran;

/**
 *
 * @author mochr
 */
public class Lingkaran {
    private static final double PI = 3.141592;
    
    public static void hitungLuas(double r) {
        double luas = PI * r * r;
        
        // Menampilkan hasil dalam tiga bentuk bilangan
        System.out.println("Luas sebagai bilangan pecahan: " + luas);
        System.out.println("Luas sebagai bilangan bulat (type-casting): " + (int) luas);
        System.out.println("Luas dengan pembulatan (rounding): " + Math.round(luas));
    }
}
