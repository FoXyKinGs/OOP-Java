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
public class Matematika {
    private Scanner scanner;

    public Matematika() {
        scanner = new Scanner(System.in);
    }

    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return (double) a / b;
    }

    public int sisaBagi(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a % b;
    }

    public void tampilkanMenu() {
        System.out.println("\n=== Menu Matematika ===");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Sisa Bagi (Modulus)");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu: ");
    }

    public void menu() {
        boolean isRunning = true;

        while (isRunning) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 5) {
                System.out.print("Masukkan angka pertama: ");
                int angka1 = scanner.nextInt();

                System.out.print("Masukkan angka kedua: ");
                int angka2 = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Hasil pertambahan: " + pertambahan(angka1, angka2));
                        break;
                    case 2:
                        System.out.println("Hasil pengurangan: " + pengurangan(angka1, angka2));
                        break;
                    case 3:
                        System.out.println("Hasil perkalian: " + perkalian(angka1, angka2));
                        break;
                    case 4:
                        System.out.println("Hasil pembagian: " + pembagian(angka1, angka2));
                        break;
                    case 5:
                        System.out.println("Hasil sisa bagi: " + sisaBagi(angka1, angka2));
                        break;
                }
            } else if (pilihan == 6) {
                isRunning = false;
                System.out.println("Terima kasih telah menggunakan aplikasi.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
