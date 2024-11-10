/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author mochr
 */
public class SwapNumber {
    public static void main(String[] args) {
        int[] bil = {34, 86, 15};

        System.out.println("Sebelum penukaran:");
        tampilkanArray(bil);

        int temp = bil[1];
        bil[1] = bil[0];
        bil[0] = temp;

        System.out.println("Setelah penukaran:");
        tampilkanArray(bil);
    }

    public static void tampilkanArray(int[] bil) {
        for (int num : bil) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
