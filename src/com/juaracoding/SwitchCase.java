package com.juaracoding;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int harga = 0, j_inap, total, ruangan;


        System.out.println("1. VIP");
        System.out.println("2. Kelas 1");
        System.out.println("3. Kelas 2");
        System.out.println("4. Kelas 3");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Pilih No Tipe Ruangan : ");

        ruangan = scan.nextInt();


        System.out.print("Jumlah Hari Rawat Inap : ");
        j_inap = scan.nextInt();


        switch (ruangan) {
            case 1 -> harga = 200000;
            case 2 -> harga = 150000;
            case 3 -> harga = 90000;
            case 4 -> harga = 50000;
            default -> System.out.println("Tidak ada kelas");
        }
        total = harga * j_inap;
        System.out.println("Total biaya rumah sakit anda adalah " + total);
    }
}
