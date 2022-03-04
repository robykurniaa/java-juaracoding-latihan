package com.juaracoding.latihanku;

import java.util.*;
public class luasSegitiga {
    public static void main(String[] args) {
    double a, t, rumus;
    Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan alas");
        a = scan.nextDouble();
        System.out.println("Masukkan tinggi");
        t = scan.nextDouble();
        rumus = 0.5 * a * t;

        System.out.println("Luas Lingkaran adalah " + rumus + " cm") ;


    }
}
