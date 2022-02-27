package com.latihanku;

import java.util.Scanner;
public class LatihanBeratBadan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String gender;
        double tinggi, berat, meter, bmi, broca;


        System.out.println("Kalkulator Berat Badan");
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Male");
        System.out.println("1. Female");
        System.out.println("------------------------------------------------------------");
        System.out.println("Masukkan Jenis Kelamin Anda :");
        gender = input.nextLine();
        System.out.println("Masukkan Tinggi Badan Anda : ");
        tinggi = input.nextDouble();
        System.out.println("Masukkan Berat Anda : ");
        berat = input.nextDouble();

        meter = tinggi / 100;
        bmi = (berat / (meter*meter));

        System.out.println("BMI anda adalah " + bmi);

        if (bmi < 18.5 ){
            System.out.println(" Berat Badan Anda Kurus");
        } else if (bmi <= 22.9){
            System.out.println("Berat Badan Anda Normal");
        }else if (bmi <= 24.9){
            System.out.println("Berat Badan Anda Overweight");
        } else {
            System.out.println("Berat Badan Anda Obesitas");
        }

        switch (gender) {
            case "male":
                broca = ((tinggi - 100) - (0.10 * (tinggi - 100)));
                break;
            case "female":
                broca = ((tinggi - 100) - (0.15 * (tinggi - 100)));
                break;
            default:
                broca = 0;
        }
        System.out.println("Berat Yang Disarankan Broca adalah " + broca);
    }
}
