package com.latihanku;

import java.util.*;
public class CekUmur {
    public static void main(String[] args) {

        int tahunLahir, tahunSekarang, umur;
        String nama;
        Scanner input = new Scanner(System.in);
        Calendar kalender = Calendar.getInstance();

        tahunSekarang = kalender.get(Calendar.YEAR);

        System.out.println("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan Tahun lahir : ");
        tahunLahir = input.nextInt();

        //rumus
       umur = tahunSekarang - tahunLahir;

        System.out.println("Halo " + nama + " Umur Anda Adalah " + umur);

    }
}
