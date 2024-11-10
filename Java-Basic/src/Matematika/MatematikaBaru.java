/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author mochr
 */
public class MatematikaBaru {
    public static int pertambahan(int a, int b) {
        return a + b;
    }
    
    public static int pengurangan(int a, int b) {
        return a - b;
    }
    
    public static int perkalian(int a, int b) {
        return a * b;
    }
    
    public static int pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a / b;
    }
}

