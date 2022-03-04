package com.juaracoding.basicjava;

import java.util.Scanner;

public class Donor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int usia, berat;

        System.out.print("Masukkan Usia :");
        usia = scan.nextInt();

        System.out.print("Masukkan berat badan :");
        berat = scan.nextInt();

        if (usia >= 17 ) {
            if (berat >= 50) {
                System.out.println("Boleh Donor Darah");
            }else{
                System.out.println("Tidak Boleh donor");
            }

        }
    }
}
