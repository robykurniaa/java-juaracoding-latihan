package com.juaracoding.basicjava;

public class Polindrome {
    public static void main(String[] args) {
    String cekPolindrome= "";
    StringBuilder build = new StringBuilder(cekPolindrome);
    build.reverse();
    String cek = build.toString();
        System.out.println("Original Text : " + cekPolindrome);
        System.out.println("Cek Polindrome : " + cek);
        if (cekPolindrome.equalsIgnoreCase(cek)) {
            System.out.println("Polindrome");
        }else{
            System.out.println("Not Polindrome");
        }

    }
}
