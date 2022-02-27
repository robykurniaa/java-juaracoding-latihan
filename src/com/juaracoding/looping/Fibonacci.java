package com.juaracoding.looping;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
                int limit, past, current, fibonacci;
                Scanner input = new Scanner(System.in);
                System.out.print("Masukan banyak bilangan yang mau ditampilkan: ");
                limit = input.nextInt();
                past = 1;
                current = 1;
                fibonacci = 1;
                for (int i =1; i <= limit; i++){
                    System.out.print(current + ", ");
                    fibonacci = past + current;
                    past = current;
                    current = fibonacci;
                }
            }
        }

