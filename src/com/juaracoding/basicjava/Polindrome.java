package com.juaracoding.basicjava;

public class Polindrome {
    public static void main(String[] args) {
        String cekPolindrome = "Katak";
        StringBuilder build = new StringBuilder(cekPolindrome);
        build.reverse();
        String polindrome = build.toString();

        System.out.println(polindrome);

    }
}
