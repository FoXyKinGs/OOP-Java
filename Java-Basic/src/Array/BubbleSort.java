/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author mochr
 */
public class BubbleSort {
    private int[] bilangan = {34, 86, 15};

    public void tampilkanBilangan(String pesan) {
        System.out.print(pesan + ": ");
        for (int num : bilangan) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void urutkanBilangan() {
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
        BubbleSort sorter = new BubbleSort();
        
        sorter.tampilkanBilangan("Bilangan sebelum diurutkan");
        sorter.urutkanBilangan();
        sorter.tampilkanBilangan("Bilangan setelah diurutkan");
    }
}
