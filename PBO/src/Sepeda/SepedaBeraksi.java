package Sepeda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mochr
 */
public class SepedaBeraksi{
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();

                sepedaku.setGir(1);
                System.out.println("Gir saat ini:" + sepedaku.getGir());

                sepedaku.setGir(3);	
                System.out.println("Gir saat ini:" + sepedaku.getGir());
        }
}

