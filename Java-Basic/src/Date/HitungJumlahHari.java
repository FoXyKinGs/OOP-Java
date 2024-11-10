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
public class HitungJumlahHari {
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

        int jumlahHari;
        switch (bulan) {
            case 1: // Januari
            case 3: // Maret
            case 5: // Mei
            case 7: // Juli
            case 8: // Agustus
            case 10: // Oktober
            case 12: // Desember
                jumlahHari = 31;
                break;
            case 4: // April
            case 6: // Juni
            case 9: // September
            case 11: // November
                jumlahHari = 30;
                break;
            case 2: // Februari
                // Cek tahun kabisat
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29; // Tahun kabisat
                } else {
                    jumlahHari = 28; // Bukan tahun kabisat
                }
                break;
            default:
                // Ini tidak seharusnya terjadi karena sudah divalidasi
                jumlahHari = 0; 
                break;
        }

        System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah " + jumlahHari + " hari.");

        scanner.close();
    }
}
