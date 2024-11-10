/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author mochr
 */
public class NegaraKota {
    public static void main(String[] args) {
        String[][] negaraKota = {
            {"Amerika", "Washington, D.C."},
            {"Inggris", "London"},
            {"Jepang", "Tokyo"},
            {"Perancis", "Paris"},
            {"Indonesia", "Jakarta"},
            {"Iran", "Teheran"},
            {"Irak", "Baghdad"}
        };

        tampilkanIbukota(negaraKota, "Indonesia");
        tampilkanIbukota(negaraKota, "Jepang");
        tampilkanIbukota(negaraKota, "Iran");
    }

    public static void tampilkanIbukota(String[][] negaraKota, String negara) {
        for (String[] pasangan : negaraKota) {
            if (pasangan[0].equalsIgnoreCase(negara)) {
                System.out.println("Ibukota " + pasangan[0] + " adalah " + pasangan[1]);
                return;
            }
        }
        System.out.println("Negara " + negara + " tidak ditemukan dalam data.");
    }
}
