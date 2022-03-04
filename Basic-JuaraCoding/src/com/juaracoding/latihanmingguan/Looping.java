package com.juaracoding.latihanmingguan;

public class Looping {
    public static void main(String[] args) {
        int i=5; int j;
        do {
            j=i;
            do {
                System.out.print(j);
                --j;
            }while(j>=1);
            --i;
            System.out.println();
        }while (i>=1);
    }
}

