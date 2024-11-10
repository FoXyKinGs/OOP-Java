/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Format;

import java.text.DecimalFormat;

/**
 *
 * @author mochr
 */
public class DecimalFormatDemo {
    public static void main(String[] args) {
        DecimalFormat formatku = new DecimalFormat("###.##");
        
        System.out.println(formatku.format(45.8398767));
    }
}
