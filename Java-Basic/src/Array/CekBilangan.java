/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author mochr
 */
public class CekBilangan {
    private int[] bilangan = {9, 3, 7, 8, 2, 4};

    public void tampilkanBilangan(String pesan) {
        System.out.print(pesan + ": ");
        for (int num : bilangan) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void cekDanTukar() {
        int n = bilangan.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bilangan[j] > bilangan[j + 1]) {
                    int temp = bilangan[j];
                    bilangan[j] = bilangan[j + 1];
                    bilangan[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        CekBilangan cek = new CekBilangan();
        
        cek.tampilkanBilangan("Bilangan sebelum dicek");
        
        cek.cekDanTukar();
        
        cek.tampilkanBilangan("Bilangan setelah dicek");
    }
}
