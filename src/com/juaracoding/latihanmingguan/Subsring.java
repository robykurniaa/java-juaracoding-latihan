package com.juaracoding.latihanmingguan;

import java.util.Scanner;

public class Subsring {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda :");
        String nama=input.nextLine();


        int length1 = input.nextInt();
        int length2 = input.nextInt();


        //mencetak nama belakang
        System.out.println(nama.substring(length1,length2));
            }
        }

