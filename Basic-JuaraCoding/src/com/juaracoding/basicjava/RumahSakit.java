package com.juaracoding.basicjava;

import java.util.Scanner;

public class RumahSakit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String ruangan;
        int jumlahOrang, harga = 0, j_inap, total;


        System.out.println("1. VIP");
        System.out.println("2. Kelas 1");
        System.out.println("3. Kelas 2");
        System.out.println("4. Kelas 3");

        System.out.println("Pilih Tipe Ruangan : ");

        ruangan = scan.nextLine();

        System.out.print("Masukkan Jumlah Pasien : ");
        jumlahOrang = scan.nextInt();

        System.out.print("Jumlah Rawat Inap : ");
        j_inap = scan.nextInt();
        total = harga * j_inap;

        if (ruangan. equalsIgnoreCase("VIP")) {
            harga = 200000;
            System.out.println("Total biaya rumah sakit anda adalah " + total);
        }else if (ruangan. equalsIgnoreCase("kelas 1")) {
            harga = 150000;
            System.out.println("Total biaya rumah sakit anda adalah " + total);
        } else if (ruangan. equalsIgnoreCase("kelas 2")) {
            harga = 90000;
            System.out.println("Total biaya rumah sakit anda adalah " + total);
        }
        else if (ruangan. equalsIgnoreCase("kelas 3")) {
            harga = 50000;
            System.out.println("Total biaya rumah sakit anda adalah " + total);
        }else {
            System.out.println("kelas tidak ada");
        }


    }
}
