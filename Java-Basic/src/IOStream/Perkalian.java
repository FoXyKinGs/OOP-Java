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
public class Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan pertama: ");
        int bilangan1 = input.nextInt();
        
        System.out.print("Masukan bilangan kedua: ");
        int bilangan2 = input.nextInt();
        
        System.out.println("Hasil Perkalian: " + (bilangan1 * bilangan2));
    }
}
