/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author mochr
 */
public class MatematikaCanggih extends Matematika{
    
    void pertambahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + hasil);
    }
    
    void pengurangan(double a, double b, double c) {
        double hasil = a - b - c;
        System.out.println(a + " - " + b + " - " + c + " = " + hasil);
    }
    
    void perkalian(double a, double b, double c) {
        double hasil = a * b * c;
        System.out.println(a + " x " + b + " x " + c + " = " + hasil);
    }
    
    void pembagian(double a, double b, double c) {
        double hasil = a / b / c;
        System.out.println(a + " : " + b + " : " + c + " = " + hasil);
    }
    
    void modulus(int a, int b) {
        int hasil = a % b;
        System.out.println(a + " % " + b + " = " + hasil);
    }
};