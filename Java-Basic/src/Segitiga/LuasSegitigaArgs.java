/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segitiga;

/**
 *
 * @author mochr
 */
public class LuasSegitigaArgs {
    public static void main(String[] args) {
        if (args.length == 2){
            double alas  = Double.parseDouble(args[0]);
            double tinggi = Double.parseDouble(args[1]);
            double luas = (alas*tinggi)/2;
            System.out.println("Luas Segitiga : " + luas);
        }else{
             System.out.println("Penggunaan Argument  Salah!");
             System.out.println("Contoh: java LuasSegitigaArgs 30 20");
       }
    }

}
