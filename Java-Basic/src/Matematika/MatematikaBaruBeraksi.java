/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

import java.util.Scanner;

/**
 *
 * @author mochr
 */
public class MatematikaBaruBeraksi {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            boolean isRunning = true;
            
            while (isRunning) {
                System.out.println("\n=== Menu Matematika ===");
                System.out.println("1. Pertambahan");
                System.out.println("2. Pengurangan");
                System.out.println("3. Perkalian");
                System.out.println("4. Pembagian");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu (1-5): ");
                
                int pilihan = scan.nextInt();
                
                if (pilihan >= 1 && pilihan <= 4) {
                    System.out.print("Masukkan nilai a: ");
                    int a = scan.nextInt();
                    System.out.print("Masukkan nilai b: ");
                    int b = scan.nextInt();
                    
                    switch (pilihan) {
                        case 1 -> System.out.println(a + " + " + b + " = " + MatematikaBaru.pertambahan(a, b));
                        case 2 -> System.out.println(a + " - " + b + " = " + MatematikaBaru.pengurangan(a, b));
                        case 3 -> System.out.println(a + " x " + b + " = " + MatematikaBaru.perkalian(a, b));
                        case 4 -> {
                            int hasilPembagian = MatematikaBaru.pembagian(a, b);
                            if (b != 0) {
                                System.out.println(a + " : " + b + " = " + hasilPembagian);
                            }
                        }
                    }
                } else if (pilihan == 5) {
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan program.");
                } else {
                    System.out.println("Error: Pilihan tidak valid. Silakan pilih antara 1 hingga 5.");
                }
            }
        }
    }
}