package com.juaracoding.basicjava;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String week;

        week = scan.nextLine();

        switch(week){
            case "Weekday" :
                System.out.println("Senin Selasa Rabu Kamis Jum'at"); break;
            case "Weekend" :
                System.out.println("Sabtu Minggu");break;
            default:
                System.out.println("Invalid Input");break;
        }
    }
}
