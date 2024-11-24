package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_005 {
    public static void main(String[] args) {


        double sayi1, sayi2, sonuc,secim;



        do{
            System.out.println("""
                *****************
                    ISLEMLER
                  1. Toplama
                  2. Cıkarma
                  3. Carpam
                  4. Bolme
                  0. Cıkıs
            """);

            Scanner input = new Scanner(System.in);

            System.out.println("lutfen secınız 1, 2 , 3 , 4 , 0:  ");

            secim = input.nextInt();


            if (secim==1) {
                System.out.println("1. sayiyi giriniz");
                sayi1 = input.nextInt();
                System.out.println("2. sayiyi giriniz");
                sayi2 = input.nextInt();
                System.out.println("toplama");
                sonuc=sayi1+sayi2;
                System.out.println("sonuc = " + sonuc);
            } else if (secim==2) {
                System.out.println("1. sayiyi giriniz");
                sayi1 = input.nextInt();
                System.out.println("2. sayiyi giriniz");
                sayi2 = input.nextInt();
                System.out.println("fark");
                sonuc=sayi1-sayi2;
                System.out.println("sonuc = " + sonuc);
            } else if (secim==3) {
                System.out.println("1. sayiyi giriniz");
                sayi1 = input.nextInt();
                System.out.println("2. sayiyi giriniz");
                sayi2 = input.nextInt();
                System.out.println("carpım");
                sonuc=sayi1*sayi2;
                System.out.println("sonuc = " + sonuc);
            } else if (secim==4) {
                System.out.println("1. sayiyi giriniz");
                sayi1 = input.nextInt();
                System.out.println("2. sayiyi giriniz");
                sayi2 = input.nextInt();
                System.out.println("bolme");
                sonuc=sayi1/sayi2;
                System.out.println("sonuc = " + sonuc);
            } else if (secim==0) {
                System.out.println("cıkıs yaptınız");
            }
            else {
                System.out.println("gecerli bir rakam giriniz");
                System.out.println("");
                System.out.println("");
            }

        }while(secim !=0);



    }// end of main method
}//end of class
