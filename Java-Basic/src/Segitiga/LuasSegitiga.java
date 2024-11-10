/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segitiga;

import java.util.Scanner;

/**
 *
 * @author mochr
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Alas Segitiga: ");
        int alas = input.nextInt();
        
        System.out.print("Masukan Tinggi Segitia: ");
        int tinggi = input.nextInt();
        
        double luas = (double)(alas*tinggi)/2;
        
        System.out.println("Luas Segitiga : " + luas);
    }
}
