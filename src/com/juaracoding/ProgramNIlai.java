package com.juaracoding;

import java.util.Scanner;
public class ProgramNIlai {
    public static void main(String[] args) {

        String nama, nim, predikat;
        char grade;
        double tugas, quis, uts, uas, akhir;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();

        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Quiz : ");
        quis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        uas = input.nextDouble();

        akhir = (0.15 * tugas + 0.20 * quis + 0.30 * uts + 0.35 * uas);
        if (akhir < 75) {
            grade = 'D';
        } else if (akhir < 85) {
            grade = 'C';
        } else if (akhir < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println(nama + " dengan NIM " + nim +
                " Memiliki Nilai Akhir Sebesar " + akhir + " dengan grade " + grade);
    }
}
