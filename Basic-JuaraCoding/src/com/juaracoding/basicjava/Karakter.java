package com.juaracoding.basicjava;

import java.util.Scanner;
public class Karakter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nama = scan.nextLine();
        String grade = scan.nextLine();
        int batch = scan.nextInt();


        System.out.println(nama);
        System.out.println(batch);
        System.out.println(grade);

    }
}
