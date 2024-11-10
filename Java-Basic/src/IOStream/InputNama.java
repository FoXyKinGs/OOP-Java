/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOStream;

import java.util.Scanner;

/**
 *
 * @author mochr
 */
public class InputNama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama lengkap Anda: ");
        String namaLengkap = scanner.nextLine();
        
        int indexSpasiTerakhir = namaLengkap.lastIndexOf(" ");
        
        String namaBelakang = namaLengkap.substring(indexSpasiTerakhir + 1);
        
        int panjangNamaBelakang = namaBelakang.length();
        
        System.out.println("Nama belakang Anda: " + namaBelakang);
        System.out.println("Panjang karakter nama belakang: " + panjangNamaBelakang);
    }
}
