package com.serkan;

import java.util.Random;
import java.util.Scanner;

public class RunnerOrnek_010 {
    public static void main(String[] args) {
        /*
        rasgele olarak sayi üretmek icin random sınıfı kullanılır
        Random rd = new Random(100) ya da rd.next(100); şeklinde

        buna göre bir oyun tasarlıyoruz rasgele bir sayı seciyoruz kullanıcının
        sectigimiz sayıyı tahmin edebilmesi icin ona yukari ya da asagı diye
        yönlendirme yapmamız gerekir  kullanıcı sayıyı bulana kadar böyle devam edilcek
         */

        Random random = new Random();
        int pcSayisi = random.nextInt(100);
        System.out.println("secilen sayi : " + pcSayisi);

        Scanner sc = new Scanner(System.in);
        //   System.out.println("lütfen sayıyı tahmin ediniz");


        int inputSayisi;
        do {
            System.out.println("lütfen sayıyı tahmin ediniz");
            inputSayisi = sc.nextInt();

            if (inputSayisi < pcSayisi) System.out.println("yukari");

            if (inputSayisi > pcSayisi) System.out.println("asagi");

            if (inputSayisi == pcSayisi) System.out.println("bildiniz");


        } while (inputSayisi != pcSayisi);


    }//END OF MAIN METHOD
}//END OF CLASS
