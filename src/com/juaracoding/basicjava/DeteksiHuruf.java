package com.juaracoding.basicjava;

import java.util.Scanner;
public class DeteksiHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char i;

        System.out.println("Program Deteksi Huruf Konsonan dan Vokal");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukkan Karakter : ");
        i = input.nextLine().charAt(0);
        if (i == 'a' || i == 'i' || i == 'u' || i == 'e' || i == 'o' ||
                i == 'A' || i == 'I' || i == 'U' || i == 'E' || i == 'O') {
            System.out.println(i + " adalah huruf vokal");
        } else {
            System.out.println(i + " adalah huruf konsonan");
        }

    }
}
