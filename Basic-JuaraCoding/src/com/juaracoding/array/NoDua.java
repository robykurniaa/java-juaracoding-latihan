package com.juaracoding.array;

import java.util.Scanner;

public class NoDua {

	public static void main(String[] args) {
        String[] num = new String[8];
        Scanner scan = new Scanner(System.in);


        for( int i = 0; i < num.length; i++ ){
            num[i] = scan.nextLine();
        }

        // menampilkan semua isi array
        System.out.println("Jumlah Murid : " +num.length);
        
	}

}
