package com.juaracoding.latihanku;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean run = true;
        String cekPalindrom, answer;

        while(run){
            System.out.print("cek palindrome ? (ya/tidak) ? ");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("ya")) {
                System.out.print("Masukkan Text : ");
                cekPalindrom = scan.nextLine();
                StringBuilder sb = new StringBuilder(cekPalindrom);
                sb.reverse();
                String polindrome = sb.toString();

                System.out.println("Text Original : " + cekPalindrom);
                System.out.println("Text Polindrome : " + polindrome);

                if (cekPalindrom.equalsIgnoreCase(polindrome)) {
                    System.out.println("Polindrome");
                }else{
                    System.out.println("Bukan Polindrome");
                }


            }
            else{
                System.out.println("Program Selesai");
            }

        }



    }
}
