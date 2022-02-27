package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class DecimalFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double harga1 = scan.nextDouble();
        int x = (int) harga1;

        double harga2 = scan.nextDouble();
        int z = (int) harga2;
        System.out.println("Harga 1: " + x );
        System.out.println("Harga 2: " + z );
    }
}
