package com.latihanku;

import java.util.Scanner;
public class DeteksiGanjilGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long angka;
        System.out.println("Program Deteksi Bilangan Ganjil Genap");
        System.out.println("Masukkan Angka : ");
        angka = input.nextInt();
        if (angka % 2 == 0) {
            System.out.println(angka + " Adalah angka Genap");
        } else {
            System.out.println(angka + " Adalah angka Ganjil");
        }
    }
}
