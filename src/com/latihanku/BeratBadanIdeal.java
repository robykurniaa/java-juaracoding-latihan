package com.latihanku;

import java.util.Scanner;
public class BeratBadanIdeal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String jk;
        double berat, tinggi, bmi, meter, broca;

        System.out.println("Program Menghitung Berat Badan");
        System.out.println("--------------------------------------------------------");
        System.out.println("Jenis Kelamin");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan Jenis Kelamin : ");
        jk = input.nextLine();
        System.out.println("Masukkan Berat Badan : ");
        berat = input.nextDouble();
        System.out.println("Masukkan Tinggi Badan : ");
        tinggi = input.nextDouble();

        meter = tinggi / 100;
        //rumus
        bmi = (berat/(meter * meter));

        //cetak hasil
        System.out.println("BMI Anda adalah " + bmi);

        //kategori BMI
        if (bmi < 18.5 ) {
            System.out.println("Kurus");
        } else if (bmi <= 22.9){
            System.out.println("Normal");
        }else if (bmi <= 24.9 ){
            System.out.println("Overweight");
        }else {
            System.out.println(" Obesitas ");
        }

        //perhitungan dengan broca
        switch (jk) {
            case "male":
                broca = ((tinggi - 100) - (0.10 * (tinggi - 100)));
                break;
            case "female":
                broca = ((tinggi - 100) - (0.15 * (tinggi - 100)));
                break;
            default:
                broca = 0;
        }
            // cetak perhitungan broca
        System.out.println(" Rekomendasi Berat Badan Anda Menurut Broca adalah " + broca + " Kg");

    }
}
