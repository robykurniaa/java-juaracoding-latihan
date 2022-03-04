package com.juaracoding.array;

import java.util.Scanner;

public class NoTiga {

	public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scan = new Scanner(System.in);


        for( int i = 0; i < num.length; i++ ){
            num[i] = scan.nextInt();
        }

        // menampilkan semua isi array
        System.out.println(num[2]);
	}

}
