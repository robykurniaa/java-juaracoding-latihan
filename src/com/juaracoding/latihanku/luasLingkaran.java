package com.juaracoding.latihanku;

import java.util.*;
public class luasLingkaran {
    public static void main(String[] args) {
    double r, luas, phi = 3.14;

    Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan Panjang Jari-Jari");
        r = scan.nextDouble();
        luas = phi * r * r;
        System.out.println("Luas lingkaran adalah " + luas);
    }
}
