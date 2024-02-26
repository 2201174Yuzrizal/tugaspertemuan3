/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuann_3;

import java.util.Scanner;

public class Soal_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = input.nextInt();

        int jumlahMobil = hitungJM(jumlahPeserta);

        System.out.println("Jumlah mobil yang diperlukan: " + jumlahMobil);
    }

    public static int hitungJM(int jumlahPeserta) {
        int kapasitasMobil = 7;
        int jumlahMobil = jumlahPeserta / kapasitasMobil;
        
        if (jumlahPeserta % kapasitasMobil != 0) {
            jumlahMobil++;
        }

        return jumlahMobil;
    }
}

