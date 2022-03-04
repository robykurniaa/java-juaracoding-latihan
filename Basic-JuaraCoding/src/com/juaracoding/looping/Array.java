package com.juaracoding.looping;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        String[] kopi = new String [3];

        for (int i = 0; i < kopi.length; i++){
            System.out.print("Kopi ke " + (i+1) + ": ");
            kopi[i] = Scan.nextLine();
        }

        System.out.println("------------------------------------------");
        for (String i : kopi ) {
            System.out.println(i);
        }
    }
}
