package com.latihanku;

public class kelipatan {

    public static void main(String[] args) {
        for (int i = 1; i <20 ; i++) {
             if (i % 3 == 0 && i % 4 == 0) {
                System.out.print("DINGSDONG");
            }
             else if (i % 3 == 0) {
                 System.out.print("DING");
             }
           else if (i % 4 == 0) {
                System.out.print("DONG");
            }

            else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
