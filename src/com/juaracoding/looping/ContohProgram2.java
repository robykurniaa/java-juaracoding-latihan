package com.juaracoding.looping;

import java.util.Scanner;

public class ContohProgram2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        String jawab;

        int select,sisi1,sisi2, panjang, lebar, jari2, alas, tinggi;
        double luas, phi = 3.14;



        while (running){
            System.out.println("apakah mau mencoba rumus lain (ya/tidak) ?");
            jawab = scan.nextLine();
            if (jawab.equalsIgnoreCase("ya")){
                System.out.println("Rumus bidang datar");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("-----------------------------------------------");
                System.out.print("Pilih Rumus : ");
                select = scan.nextInt();
                switch(select){
                    case 1 :
                        System.out.println("Anda Memilih Rumus Mencari Luas Segitiga");
                        System.out.println("Masukkan sisi pertama");
                        sisi1 = scan.nextInt();
                        System.out.println("Masukkan sisi kedua");
                        sisi2 = scan.nextInt();
                        luas =  sisi1 *  sisi2;
                        System.out.println("Luas Persegi adalah " + luas);
                        break;
                    case 2 :
                        System.out.println("Anda Memilih Rumus Mencari Keliling Persegi Panjang");
                        System.out.println("Masukkan Panjang");
                        panjang = scan.nextInt();
                        System.out.println("Masukkan Lebar");
                        lebar = scan.nextInt();
                        luas =  panjang +  lebar;
                        System.out.println("Luas Persegi adalah " + luas);
                        break;
                    case 3 :
                        System.out.println("Anda Memilih Rumus Menghiutng luas segitiga");
                        System.out.println("Masukkan alas");
                        alas = scan.nextInt();
                        System.out.println("Masukkan tinggi");
                        tinggi = scan.nextInt();
                        luas =  1/2 * alas * tinggi;
                        System.out.println("Luas Persegi adalah " + luas);
                        break;
                    case 4 :
                        System.out.println("Anda Memilih Rumus Menghiutng luas lingkaran");
                        System.out.println("Masukkan Jari - jari");
                        jari2 = scan.nextInt();
                        luas =  phi*jari2*jari2;
                        System.out.println("Luas Persegi adalah " + luas);
                        break;
                    default:
                        System.out.println("Tidak ada rumus");
                }

            }else{
                System.out.println("Program Selesai");
            }
        }



    }
}
