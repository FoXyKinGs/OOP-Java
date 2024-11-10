/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author mochr
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC AC_Ruangan = new AC();
        
        System.out.println("Keadaan AC Mati dengan suhu awal: " + AC_Ruangan.suhuRuangan);
        AC_Ruangan.hidupkanAC();
        AC_Ruangan.matikanAC();
        AC_Ruangan.matikanAC();
        AC_Ruangan.hidupkanAC();
        AC_Ruangan.hidupkanAC();
        AC_Ruangan.panaskanAC();
        AC_Ruangan.panaskanAC();
        AC_Ruangan.panaskanAC();
        AC_Ruangan.dinginkanAC();
        AC_Ruangan.dinginkanAC();
        AC_Ruangan.matikanAC();
        AC_Ruangan.dinginkanAC();
        AC_Ruangan.panaskanAC();
    }
}
