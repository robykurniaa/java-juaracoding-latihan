package com.juaracoding.latihanmingguan;

import java.util.*;
public class LoopingIII {
    public static void main(String[] args) {
        int limit;
        Scanner scan = new Scanner(System.in);
        limit = scan.nextInt();
        for (int i = 1; i <=limit ; i++) {
            System.out.println(i);
            for (int j = 1; j <limit; j++) {
                System.out.println("p");
            }
        }
    }
}
