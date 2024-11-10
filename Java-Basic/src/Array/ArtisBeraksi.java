/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.ArrayList;

/**
 *
 * @author mochr
 */
public class ArtisBeraksi {
    public static void main(String[] args) {
        ArrayList<String> artis = new ArrayList<>();

        artis.add("Raisa");
        artis.add("Agnez Mo");
        artis.add("Tulus");
        artis.add("Afgan");
        artis.add("Isyana Sarasvati");

        System.out.println("Daftar artis awal: " + artis);

        artis.add("Rizky Febian");
        System.out.println("Setelah menambahkan artis di akhir: " + artis);

        artis.add(2, "Judika");
        artis.add(3, "Fiersa Besari");
        System.out.println("Setelah menyisipkan artis di indeks 2 dan 3: " + artis);

        artis.set(4, "Nikita Willy");
        System.out.println("Setelah mengganti artis di indeks 4: " + artis);
    }
}
