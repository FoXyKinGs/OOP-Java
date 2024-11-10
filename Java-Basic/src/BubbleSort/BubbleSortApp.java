/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BubbleSort;

import java.util.Scanner;

/**
 *
 * @author mochr
 */
public class BubbleSortApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        
        int[] bilangan = new int[n];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen " + (i + 1) + ": ");
            bilangan[i] = scanner.nextInt();
        }

        BubbleSort bubbleSort = new BubbleSort(bilangan);
        bubbleSort.tampilkanBilangan("Bilangan sebelum diurutkan");
        bubbleSort.sort();
        bubbleSort.tampilkanBilangan("Bilangan setelah diurutkan");

        scanner.close();
    }
}
