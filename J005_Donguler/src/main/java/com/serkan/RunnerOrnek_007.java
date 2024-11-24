package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_007 {
    public static void main(String[] args) {
        /*,
        kullanıcını vermiş olduğu sınırlardaki sayıların toplamını
        bulan kodu yazınız
         */
        Scanner input = new Scanner(System.in);

        int start, end, toplam;

        toplam = 0;

        System.out.println("baslangic sayisini giriniz...");
        start = input.nextInt();
        System.out.println("bitis degerini giriniz...:");
        end = input.nextInt();

        for (int i = start; i <= end; i++) {
            toplam += i;//toplam = toplam + i
        }

        System.out.println(toplam);

    }//end of metod
}//end of class
