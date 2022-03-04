package com.juaracoding.basicjava;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cekPolindrome;
        boolean run = true;
    while(run) {
        System.out.print("Masukkan Text : ");
        cekPolindrome = scan.nextLine();
        StringBuilder build = new StringBuilder(cekPolindrome);
        build.reverse();
        String cek = build.toString();
        System.out.println("Original Text : " + cekPolindrome);
        System.out.println("Cek Polindrome : " + cek);
        if (cekPolindrome.equalsIgnoreCase(cek)) {
            System.out.println("Polindrome");
        } else {
            System.out.println("Not Polindrome");
        }
    }
    }
}
