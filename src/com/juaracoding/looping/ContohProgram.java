package com.juaracoding.looping;

import java.util.Scanner;

public class ContohProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select, persegi, persPanjang,
                segitiga, lingkaran, luas,
                sisi1,sisi2, panjang, lebar;
        String input;
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
          default:
              System.out.println("Tidak ada rumus");
        }

        System.out.println("Mencoba Rumus Lain ? ");
      input = scan.nextLine();
        if (input.equals(select)){

        }
    }
}
