package com.latihanku;

import java.util.Scanner;
public class kalkulatorSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka1, angka2, choice, result = 0;

        System.out.println("Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa bagi");
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Masukkan Angka Pertama");
        angka1 = input.nextInt();
        System.out.println("Masukkan Angka Kedua");
        angka2 = input.nextInt();
        System.out.println("Masukkan Operasi matematika");
        choice = input.nextInt();


        switch (choice)
        {
            case 1 : result = angka1 + angka2;break;
            case 2 : result = angka1 - angka2;break;
            case 3 : result = angka1 / angka2;break;
            case 4 : result = angka1 * angka2;break;
            case 5 : result = angka1 % angka2;break;
            default: System.out.println("Operasi Tidak Ada");

        }
        System.out.println("Hasil " + result);
    }
}
