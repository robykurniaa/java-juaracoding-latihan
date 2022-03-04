package com.juaracoding.method;


	public class Math {
	
		public static void main(String[] args) {
			System.out.println("Perkalian A * B = "+perkalian(8, 3));
			System.out.println("Perkalian A * B = "+pengurangan(8, 3));
			
	
		}
	
		 static int perkalian(int a, int b) { //method parameter
				int hasil =  a *  b;
				return hasil;
			  }
			  
			  static int pengurangan(int a, int b) { //method parameter
				  int hasil =  a - b;
				return hasil;
			  }
	}
	

