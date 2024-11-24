package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_002 {
    public static void main(String[] args) {
        /*
        KULLANICIDAN ALINAN 2 SAYIDAN HANGİSİNİN BUYUK OLDUGUNU BULAN KODU YAZINIZ
         */

        int sayi1;
        int sayi2;

        Scanner input = new Scanner(System.in);

        System.out.println("1. sayiyi giriniz..:  ");
        sayi1 = input.nextInt();
        System.out.println("2. sayiyi giriniz..:  ");
        sayi2 = input.nextInt();

        int buyukSayi = sayi1;
        if (buyukSayi < sayi2) {
            buyukSayi = sayi2;
        }
        System.out.println("buyuk sayi :  " + buyukSayi);
/*
        if(sayi1 > sayi2){
            System.out.println(sayi1 + " büyüktür "+ sayi2);
        }else if(sayi1 < sayi2){
            System.out.println(sayi2+" büyüktür "+ sayi1);
        }else {
            System.out.println(sayi1+" esittir "+sayi2);
        }

 */


        System.out.println("---------------");
        System.out.println("program bitti");

    }//END OF MAIN METHOD
}//END OF CLASS
