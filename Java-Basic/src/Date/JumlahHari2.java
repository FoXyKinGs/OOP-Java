/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Date;

/**
 *
 * @author mochr
 */
public class JumlahHari2 {
    // Method untuk menghitung jumlah hari berdasarkan tahun dan bulan
    public int hitungHari(int tahun, int bulan) {
        int jumlahHari;

        switch (bulan) {
            case 1: // Januari
            case 3: // Maret
            case 5: // Mei
            case 7: // Juli
            case 8: // Agustus
            case 10: // Oktober
            case 12: // Desember
                jumlahHari = 31;
                break;
            case 4: // April
            case 6: // Juni
            case 9: // September
            case 11: // November
                jumlahHari = 30;
                break;
            case 2: // Februari
                // Cek tahun kabisat
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29; // Tahun kabisat
                } else {
                    jumlahHari = 28; // Bukan tahun kabisat
                }
                break;
            default:
                // Ini tidak seharusnya terjadi karena sudah divalidasi
                jumlahHari = 0; 
                break;
        }
        return jumlahHari;
    }
}
