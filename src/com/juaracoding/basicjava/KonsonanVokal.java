package com.juaracoding.basicjava;

import java.util.Scanner;
public class KonsonanVokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String i;

        System.out.println("Program Deteksi Huruf Konsonan dan Vokal");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukkan Karakter : ");
        i = input.nextLine();
        if (i. equalsIgnoreCase("a") || (i. equalsIgnoreCase("i"))
                || (i. equalsIgnoreCase("u")) || (i. equalsIgnoreCase("e")) ||
                (i. equalsIgnoreCase("o")))   {
            System.out.println(i + " adalah huruf vokal");
        } else {
            System.out.println(i + " adalah huruf konsonan");
        }

    }
}
