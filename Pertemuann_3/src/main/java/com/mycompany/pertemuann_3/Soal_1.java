/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuann_3;

import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        int b1 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int b2 = scanner.nextInt();
        
        if (b1 % 2 == 0 && b2 % 2 == 0) {
            
            int hasilPenjumlahan = b1 + b2;
            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        } else if (b1 % 2 != 0 && b2 % 2 != 0) {
            
            int hasilPerkalian = b1 * b2;
            System.out.println("Hasil perkalian: " + hasilPerkalian);
        } else {
            System.out.println("Kedua bilangan tidak memenuhi syarat.");
        }
        
        scanner.close();
    }
}
