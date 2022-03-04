package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class LoopingX {
    public static void main(String[] args) {
        int hasil, nilai, limit;

        Scanner scan = new Scanner(System.in);
        nilai = scan.nextInt();
        limit = scan.nextInt();
        for (int i = 1; i <=limit ; i++) {
            hasil = nilai * i;
            System.out.print(nilai);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = "+ hasil);
            System.out.println(" ");
        }
    }
    }

