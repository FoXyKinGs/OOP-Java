/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perkalian;

import java.util.Scanner;

/**
 *
 * @author mochr
 */
public class Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Bilangan Pertama: ");
        int bilangan1 = input.nextInt();
        
        System.out.println("Masukan Bilangan Kedua: ");
        int bilangan2 = input.nextInt();
        
        System.out.println("Hasil perkalian : " + (bilangan1 * bilangan2));
    }
}
