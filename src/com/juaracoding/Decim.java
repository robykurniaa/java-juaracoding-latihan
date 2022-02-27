package com.juaracoding;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Decim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat x = new DecimalFormat("#.##");

        double a;
        String nama;

        nama = scan.nextLine();
        a = scan.nextDouble();

        System.out.println("nama: " + nama);
        System.out.println("nilai: " + x.format(a));


    }
}
