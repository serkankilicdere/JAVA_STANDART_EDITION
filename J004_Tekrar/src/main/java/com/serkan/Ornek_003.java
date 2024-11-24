package com.serkan;

import java.util.Scanner;

public class Ornek_003 {

    /*
    kullanıcıdan 3 sayi al ve sayilarin tümünün 0 dan büyük olup olmadıgını bulunuz
    sonucu true false şeklinde yazdırın ( boolean degiskeni olusturun)
     */

    public static void main(String[] args) {

        int sayi1 , sayi2 , sayi3;
        boolean sayilarBuyukmu;

        Scanner input = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        sayi1 = input.nextInt();
        System.out.println("2. sayiyi giriniz");
        sayi2 = input.nextInt();
        System.out.println("3. sayiyi giriniz");
        sayi3 = input.nextInt();

        sayilarBuyukmu= (sayi1>0 && sayi2>0 && sayi3>0);

        System.out.println(sayilarBuyukmu);


    }
}
