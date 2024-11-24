package com.serkan;

public class RunnerArtirimEksiltim {
    public static void main(String[] args) {

        /*
           (++) ---> bir değişkenin değerini bir artırır
           (--) ---> bir değişkenin değerini bir eksiltir
           prefix , suffix ( önde , sonda kullanım)
           eğer ++ , -- değişkenin sonunda tanımlanır ise önce değişken sonra işlem gerçekleşir
           " " " " " "  değişkenin önünde tanımlanır ise önce işlem gerçekleşir sonra değer

         */

        int sayi = 1;
        System.out.println("sayının değeri..   : " + sayi);
        sayi = sayi + 1;
        System.out.println("sayinin değeri..   : " + sayi);
        sayi += 1;
        System.out.println("sayinin değeri..   : " + sayi);
        sayi++;
        System.out.println("sayinin değeri..   : " + sayi);
        ++sayi;
        System.out.println("sayinin değeri..   : " + sayi);
        sayi--;
        System.out.println("sayinin değeri..   : " + sayi);
        --sayi;
        System.out.println("sayinin değeri..   : " + sayi);

        System.out.println("------------------------------");

        int toplam = 10;
        System.out.println("toplam..  :" + toplam);
        System.out.println("sayi..   : " + sayi);
        toplam = sayi++;
        System.out.println("toplam..  : " + toplam);
        System.out.println("sayi..   : " + sayi);

        System.out.println("---------------------------------");

        int s1=6 , s2=8 , s3= -2;
        toplam= s1++ + ++s2 + ++s3 - s3-- - --s1 + s3++ + s2++;
        System.out.println("toplam..  : " + toplam);
        System.out.println("s1..  : "+ s1);
        System.out.println("s2..  : "+ s2);
        System.out.println("s3..  : "+ s3);

    }//end of main method

}//end of class
