/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author mochr
 */
public class AC implements InterfaceAC{
    int statusAC;
    int suhuRuangan = 21;
    
    public void hidupkanAC() {
        if (statusAC == AC_MATI) {
            statusAC = AC_NYALA;
            System.out.println("AC Nyala");
        } else {
            System.out.println("AC Sudah Dalam Keadaan Nyala");
        }
    }
    
    public void matikanAC() {
        if (statusAC == AC_NYALA) {
            statusAC = AC_MATI;
            System.out.println("AC Mati");
        } else {
            System.out.println("AC Sudah Dalam Keadaan Mati");
        }
    }
    
    public void panaskanAC() {
        if (statusAC == AC_NYALA) {
            suhuRuangan++;
            System.out.println("Berhasil Menambahkan Suhu Ruangan Ke: " + suhuRuangan);
        } else {
            System.out.println("AC-nya Mati!");
        }
    }
    
    public void dinginkanAC() {
        if (statusAC == AC_NYALA) {
            suhuRuangan--;
            System.out.println("Berhasil Mengurangi Suhu Ruangan ke: " + suhuRuangan);
        } else {
            System.out.println("AC-nya Mati!");
        }
    }
}
