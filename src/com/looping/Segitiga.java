package com.looping;

import java.util.Scanner;

public class Segitiga {

    public static void main(String[] args) {
//        int alas, tinggi;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Masukkan alas : ");
//        alas = scan.nextInt();
//
//        System.out.println("Masukkan tinggi : ");
//        tinggi = scan.nextInt();
//
//        for (int i = 0; i <tinggi ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//
//        System.out.println("--------------------------------------------");
//
//        for (int i = 0; i <=tinggi ; i++) {
//            for (int j = i; j <=alas ; j++) {
//                System.out.print('*');
//            }
//            System.out.println(' ');
//        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i <=7 ; i++) {
            for (int j = i; j <=8-i ; j++) {
                if (j % 2 == 0 ) {
                    System.out.print("*");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println("");
        }

    }
}
