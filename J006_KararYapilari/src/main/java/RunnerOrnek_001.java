package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_001 {
    public static void main(String[] args) {
        /*
        kullanıcıdan alınan vize ve final notlarının ort göre ogrencinin
        gec kal sonucunu bulan prog
         */

        int vizeNotu, finalNotu, ortalama;

        Scanner input = new Scanner(System.in);

        System.out.println("vize notunuzu giriniz...:  ");
        vizeNotu = input.nextInt();
        System.out.println("final notunuzu giriniz...:  ");
        finalNotu = input.nextInt();

        ortalama = (vizeNotu + finalNotu) / 2;

        if (ortalama >= 65) {
            System.out.println("gectin");
        } else {
            System.out.println("kaldın");
        }


    }// END OF MAIN METHOD
}//END OF CLASS
