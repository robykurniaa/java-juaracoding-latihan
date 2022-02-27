package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int awal, akhir, tambah;
        awal = scan.nextInt();
        akhir = scan.nextInt();
        tambah = scan.nextInt();
        System.out.println("Deret aritmatika");
        for (int i = awal; i <akhir ; i++) {
            System.out.print(i  +" ");
            i = i + tambah-1;

        }
    }
}
