/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.util.Scanner;

/**
 *
 * @author mochr
 */
public class Bank {
    protected int saldo;

    // Konstruktor untuk mengatur saldo awal
    public Bank(int saldo) {
        this.saldo = saldo;
    }

    // Method untuk mendapatkan saldo saat ini dan menampilkannya
    public void cekSaldo() {
        System.out.println("Saldo saat ini: Rp" + saldo);
    }

    // Method untuk simpan uang
    public void simpanUang(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Simpan uang: Rp" + jumlah);
            cekSaldo();
        } else {
            System.out.println("Jumlah yang disimpan harus lebih dari Rp0.");
        }
    }

    // Method untuk ambil uang dengan pengecekan saldo
    public void ambilUang(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp" + jumlah);
            cekSaldo();
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    // Method untuk menampilkan menu dan mengelola logika interaksi
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== Menu Bank ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Simpan Uang");
            System.out.println("3. Ambil Uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                cekSaldo();
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah uang yang ingin disimpan: ");
                int simpan = scanner.nextInt();
                simpanUang(simpan);
            } else if (pilihan == 3) {
                System.out.print("Masukkan jumlah uang yang ingin diambil: ");
                int ambil = scanner.nextInt();
                ambilUang(ambil);
            } else if (pilihan == 4) {
                isRunning = false;
                System.out.println("Terima kasih telah menggunakan layanan kami.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            // Tanya apakah ingin melanjutkan atau tidak
            if (isRunning) {
                System.out.print("\nApakah Anda ingin melanjutkan? (y/n): ");
                String lanjut = scanner.next();
                if (!lanjut.equalsIgnoreCase("y")) {
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                }
            }
        }

        scanner.close();
    }
}
