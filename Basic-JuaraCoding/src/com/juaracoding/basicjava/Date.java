package com.juaracoding.basicjava;

import java.util.*;

public class Date {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        GregorianCalendar date = new GregorianCalendar();

        String nama;
        int tahunLahir, tahun, usia;

        nama = scan.nextLine();
        tahunLahir = scan.nextInt();
        tahun = date.get(Calendar.YEAR);

        usia = tahun - tahunLahir;

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Lahir: " + tahunLahir);
        System.out.println(usia);

    }
}