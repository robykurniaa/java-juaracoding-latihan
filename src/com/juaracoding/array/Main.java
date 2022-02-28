package com.juaracoding.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] kopi = new String[3];

        for (var i=0;i< kopi.length;i++){
            System.out.print("Kopi ke - "+ (i+1) +" :");
            kopi[i] = scan.nextLine();
        }
        System.out.println("=========================================");
        for (String i :kopi) {
            System.out.println(i);
        }
        }
    }
