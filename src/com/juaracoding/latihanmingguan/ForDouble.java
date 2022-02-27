package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class ForDouble {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a;
        int limit;

        a = scan.nextDouble();
        limit = scan.nextInt();
        double b = a;
        for (double i = 1 ; i <=limit; i++) {
            System.out.print(b + " ");
            b = a * b;
        }
}
}
