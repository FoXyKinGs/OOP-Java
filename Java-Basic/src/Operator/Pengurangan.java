/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operator;

/**
 *
 * @author mochr
 */
public class Pengurangan {
    public static void main(String[] args) {
        int x, y, z;
        x = 42;
        y = x--;
        
        System.out.println("X : " + x + ", Y : " + y);
        
        z = --x;
        
        System.out.println("X : " + x + ", Z : " + z);
    }
}
