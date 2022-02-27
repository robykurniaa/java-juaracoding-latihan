package com.juaracoding.basicjava;

import java.util.Scanner;

public class LowUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kata;

        kata = scan.nextLine();

        System.out.println(kata.length());
        System.out.println(kata.toUpperCase());
        System.out.println(kata. toLowerCase());
    }
}
