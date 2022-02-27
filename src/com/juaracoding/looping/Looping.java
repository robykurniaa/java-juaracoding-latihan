package com.juaracoding.looping;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Limit :");

       int limit = scan.nextInt();

        for (int i = limit; i >= 1 ; i = i-2) {
                System.out.print(i + " ");
        }

    }
}
