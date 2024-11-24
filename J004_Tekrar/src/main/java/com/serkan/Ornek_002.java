package com.serkan;

import java.util.Scanner;

public class Ornek_002 {

    /*
       kullanıcıdan alınan bir sayinin 50 sayısından büyük olup olmadıgını true/false
       şeklinde ekrana yazdırın
     */


    public static void main(String[] args) {

        int kistas, girilenSayi;

        kistas = 50;
        Scanner input = new Scanner(System.in);
        System.out.println("kiyaslamak istediginiz sayiyi giriniz");
        girilenSayi = input.nextInt();
        boolean buyukMudur;
        buyukMudur = girilenSayi > kistas;
        System.out.println(buyukMudur);


/*
        System.out.println("girilenSayi kistastan buyukmu  :" + (girilenSayi>kistas));
        System.out.println("girilenSayi kistastan kucukmu  :" + (girilenSayi<kistas));
        System.out.println("girilenSayi kistastan kucukmu  :" + (girilenSayi==kistas));
*/
    }// END OF MAIN METHOD
}// END OF CLASS
