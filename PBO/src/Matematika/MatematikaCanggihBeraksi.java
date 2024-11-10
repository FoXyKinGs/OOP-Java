/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author mochr
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mc = new MatematikaCanggih();
        
        mc.pertambahan(12.5, 28.7, 14.2);
        mc.pertambahan(23, 24);
        mc.pertambahan(12, 28, 14);
        /*
            ini error karena method yg kena overide dan parameternya double
            butuh 3 parameter
        */
        mc.pertambahan(3.4, 4.9);
    }
}
