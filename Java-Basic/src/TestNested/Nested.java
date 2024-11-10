/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestNested;

/**
 *
 * @author mochr
 */
public class Nested {
    public void arrow(int length) {
        // Bagian atas piramida
        for (int i = 0; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }

        // Bagian bawah piramida
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
    
    public void square(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length + 1; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
