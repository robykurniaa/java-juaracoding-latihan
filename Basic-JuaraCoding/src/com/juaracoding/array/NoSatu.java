package com.juaracoding.array;

import java.util.Scanner;

public class NoSatu {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String[] juara = new String[3];
		 for( int i = 0; i < juara.length; i++ ){
	            juara[i] = scan.nextLine();
	        }
		 for( String b : juara ){
	            System.out.print(b + " ");
	        }
	}

}
