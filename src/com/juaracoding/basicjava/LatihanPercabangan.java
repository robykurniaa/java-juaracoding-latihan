package com.juaracoding.basicjava;

import java.util.Scanner;

public class LatihanPercabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total, jumlah, harga = 25000;

        System.out.println("Harga Satu Buku 25000");
        System.out.print("Masukkan Jumlah Buku yang Dibeli : ");
        jumlah = input.nextInt();

        total = jumlah * harga;

        System.out.println("Total Belanja Anda adalah " + total);

        if (total >= 100000) {
            System.out.println(" Selamat Anda mendapatkan Hadiah");
        }else {
            System.out.println("Total belanja anda kurang dari Rp. 100.000 anda tidak mendapatkan hadiah");
        }
    }
}
