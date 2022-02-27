package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class TigaDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next(); int b = scan.nextInt();
        String c = scan.next(); int d = scan.nextInt();
        String e = scan.next(); int f = scan.nextInt();
        String digit1 = String.format("%03d", b);
        String digit2 = String.format("%03d", d);
        String digit3 = String.format("%03d", f);
        System.out.println("==============================");
        System.out.println(a +"          "+ digit1);
        System.out.println(c +"           "+ digit2);
        System.out.println(e +"          "+ digit3);
        System.out.println("==============================");


    }
}
