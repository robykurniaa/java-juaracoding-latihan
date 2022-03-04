package com.juaracoding.latihanku;

import java.util.*;
public class kelilingSegitiga {
    public static void main(String[] args) {
        int SisiA, SisiB, SisiC, total;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Sisi A");
        SisiA = scan.nextInt();
        System.out.println("Masukkan Sisi B");
        SisiB = scan.nextInt();
        System.out.println("Masukkan Sisi C");
        SisiC = scan.nextInt();

        total = SisiA + SisiB + SisiC;

        System.out.println("Jumlah Keliling Segitiga Adalah " + total);
    }
}
