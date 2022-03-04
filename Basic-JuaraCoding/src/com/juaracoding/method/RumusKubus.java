package com.juaracoding.method;

import java.util.Scanner;

public class RumusKubus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jawab, select;
    
        	while (true) {
        		System.out.println("apakah mau mencoba rumus lain (ya/tidak) ?");
                jawab = scan.nextLine();
                if (jawab.equalsIgnoreCase("ya")){
                    System.out.println("Rumus bidang datar");
                    System.out.println("1. Luas Kubus");
                    System.out.println("2. Volume Kubus");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Pilih Rumus : ");
                    select = scan.nextLine();
                
                    switch (select) {
                        case "luas kubus." -> {
                        System.out.print("Masukkan Panjang Permukaan : ");
                        int panjang = scan.nextInt();
                        System.out.print("Masukkan lebar : ");
                        int lebar = scan.nextInt();
                        System.out.print("Masukkan Tinggi : ");
                        int tinggi = scan.nextInt();
                        luasKubus(panjang,lebar,tinggi);
                        }
                        
                        case "volume kubus" -> {
                        	System.out.println("Anda Memilih Rumus Mencari volume balok");
                        	System.out.print("Masukkan Panjang : ");
                        	int panjang = scan.nextInt();
                         	System.out.print("Masukkan Lebar : ");
                           int lebar= scan.nextInt();
                           System.out.print("Masukkan Tinggi : ");
                           int tinggi= scan.nextInt();
                        	
                            volumeKubus(panjang, lebar, tinggi);
                        }

                        default -> System.out.println("Tidak ada rumus");
                    }
                }

            }
        	}
            
       private static void luasKubus(int panjang ,int lebar, int tinggi){
    	   System.out.println("Anda Memilih Rumus Mencari Luas Kubus");
          double luas = 2 * ((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
            System.out.println("Luas Persegi adalah " + luas);
        }
        
        static void volumeKubus(int panjang, int lebar, int tinggi){       
           int luas = panjang*lebar*tinggi;
            System.out.println("Luas Persegi adalah " + luas);

        }
    }

