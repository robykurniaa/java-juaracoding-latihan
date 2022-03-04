package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class fori {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        for (int i=1; i<=limit; i++){
            for (int j=limit; j>=i; j--){
                if (j % 3 == 0) {
                    System.out.print("*");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        }
    }

