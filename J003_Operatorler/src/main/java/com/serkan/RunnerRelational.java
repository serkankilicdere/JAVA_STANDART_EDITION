package com.serkan;

import java.util.Scanner;

public class RunnerRelational {
    public static void main(String[] args) {

        /**
         * iki değşkenin yada değeri bir birbirine göre durumu irdeleyen ve
         * sonuç olarak true/false dönen operatörler
         *
         *    == --> bu ooperatör iki değerin birbirine eşitliğini denetler (eşitmi veya eşitse gibi)
         *  >, >= --> iki değişkenden soldakinin sağdakinden büyük ve büyük eşit olduğunu sorgular( büyükmü veya büyükse gibi)
         *  <, <= --> iki değişkenden soldakinin sağdakinden küçükleünde true arar değilse false döner
         *  ! --> değil operatötürü not veya değeri tersine çevirir
         */

        String ka = "serkan", sf = "12345";
        System.out.println("kullanıcı adı doğrumudur?....   " + (ka == "serkan"));
        System.out.println("kullanıcı adı doğrumudur?....  " + (ka == "Serkan"));

        System.out.println("-------------------------  ");

        int ortalama = 69;

        System.out.println("okulu geçtimi?..." + (ortalama > 69));
        System.out.println("okulu geçtimi?...  " + (ortalama >= 69));

        System.out.println("------------------------------------");

        int kilo = 100;
        System.out.println("ben kilolumuyum?..  " + (kilo < 100));
        System.out.println("ben kilolumuyum?...  " + (kilo <= 100));

        System.out.println("------------------------------------");


        System.out.println("""
                   1-toplama
                   2-çıkartma
                   3-çarpma
                   4-bölme
                   0-çıkış
                """);
        System.out.println("lütfen seciniz.....:");
        int secim = new Scanner(System.in).nextInt();

        System.out.println("seciminiz...: " + secim);

        System.out.println("çıkış yaptımı?"+(secim==0));
        System.out.println("çıkış yapmadımı - devam ettimi?"+(secim !=0));






    }//end of method
}//end of class
