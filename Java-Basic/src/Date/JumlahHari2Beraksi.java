/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Date;

import java.util.Scanner;

/**
 *
 * @author mochr
 */
public class JumlahHari2Beraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = 0;
        boolean validTahun = false;

        // Validasi input tahun
        while (!validTahun) {
            if (scanner.hasNextInt()) {
                tahun = scanner.nextInt();
                validTahun = true;
            } else {
                System.out.println("Error: Harap masukkan tahun yang valid (digit).");
                scanner.next(); // membersihkan input yang tidak valid
            }
        }

        System.out.print("Masukkan bulan (1-12): ");
        int bulan = 0;
        boolean validBulan = false;

        // Validasi input bulan
        while (!validBulan) {
            if (scanner.hasNextInt()) {
                bulan = scanner.nextInt();
                if (bulan >= 1 && bulan <= 12) {
                    validBulan = true;
                } else {
                    System.out.println("Error: Bulan harus antara 1 hingga 12.");
                }
            } else {
                System.out.println("Error: Harap masukkan bulan yang valid (digit).");
                scanner.next(); // membersihkan input yang tidak valid
            }
        }

        // Membuat objek JumlahHari2
        JumlahHari2 jumlahHari = new JumlahHari2();
        // Menghitung jumlah hari
        int hari = jumlahHari.hitungHari(tahun, bulan);
        
        System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah " + hari + " hari.");

        scanner.close();
    }
}
