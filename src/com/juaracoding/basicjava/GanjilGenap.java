package com.juaracoding.basicjava;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        a = scan.nextInt();
        b = scan.nextInt();

        if (a % 2 == 0 && b %2 == 0  ){
            System.out.print("Tanggal genap dan plat nomor genap");
        }
       else if (a % 2 != 0 && b %2 != 0 ){
            System.out.println("Tanggal ganjil dan plat nomor ganjil");
        }else if (a % 2 == 0 && b %2 != 0){
            System.out.println("Tanggal genap dan plat nomor ganjil");
        }
    }
}
