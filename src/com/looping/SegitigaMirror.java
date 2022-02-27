package com.looping;

import java.util.Scanner;

public class SegitigaMirror {
    public static void main(String[] args) {

//        int alas, tinggi;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Masukkan alas : ");
//        alas = scan.nextInt();
//
//        System.out.println("Masukkan tinggi : ");
//        tinggi = scan.nextInt();

        for (int i = 0; i <5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
