package com.serkan;

import java.util.Scanner;

public class RunnerAritmetik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // sistem girişlerini taramak icin

        int sayi1 , sayi2 , sonuc; // degisken türü önemlidir double belirtmek gerekebilir(bölme işlemi ondalık çıkabilir

        System.out.println("""
                **********************************
                ********ARITMETIK ISLEMLER********
                **********************************
                """);

        System.out.println("lutfen 1. sayıyı giriniz...:  ");
        sayi1 = sc.nextInt();
        System.out.println("lutfen 2. sayıyı giriniz...:  ");
        sayi2 = sc.nextInt();
        sonuc = sayi1+sayi2;
        System.out.println("iki sayinin toplami...."+sonuc);
        sonuc = sayi1-sayi2;
        System.out.println("iki sayinin farkı...."+sonuc);// sonuc degiskeninin icindeki deger akıs suresınce degisebilir
        sonuc = sayi1/sayi2;
        System.out.println("iki sayinin bölumu...."+sonuc);
        sonuc = sayi1*sayi2;
        System.out.println("iki sayinin carpımı...."+sonuc);
        sonuc = sayi1%sayi2;
        System.out.println("iki sayinin modu...."+sonuc);



    }//END OF MAIN METHOD

}// END OF CLASS
