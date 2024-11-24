package com.serkan;

public class RunnerOrnek_006 {
    public static void main(String[] args) {

        /*
        1 ve 7 arasındaki sayıların toplamını bulan kodu yazınız
         */
        int i = 1;
        int toplam = 0;
        for (i = 1; i <= 7; i++) {
            toplam = toplam + i;//toplam+=i

        }
        System.out.println(toplam);


    }// end of method
}// end of class
