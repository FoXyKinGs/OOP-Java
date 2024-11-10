/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sepeda;

/**
 *
 * @author mochr
 */
public class SepedaGunung extends Sepeda{
    private int sadel;
    
    void setGir(int pertambahanGir) {
        super.setGir(pertambahanGir);
        // error karena gir sudah dibuat private
        gir = 2 * getGir();
    }
    
    void setSadel(int jumlah) {
        sadel = getGir() - jumlah;
    }
    
    int getSadel() {
        return sadel;
    }
}
