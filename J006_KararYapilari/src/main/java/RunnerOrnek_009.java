package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_009 {
    public static void main(String[] args) {
       /*
       Kullanıcıdan 3 adet sayi al ve bu sayiların en büyük ve en kücük olanlarını bul sonra bunlar arasındaki farkı bul
       ekrana enbüyük sayı en kucuk sayı bu ve farki yazdir
        */

        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,sayi3;

        System.out.println("1.sayiyi giriniz: ");
        sayi1 = input.nextInt();
        System.out.println("2.sayiyi giriniz: ");
        sayi2 = input.nextInt();
        System.out.println("3.sayiyi giriniz: ");
        sayi3 = input.nextInt();
/*
        int enBuyuk=sayi1;

        if(sayi1<sayi2 && sayi2>sayi3){
            enBuyuk=sayi2;
        } else if (sayi2<sayi3 && sayi3>sayi1) {
            enBuyuk=sayi3;

        }

        int enKucuk=sayi1;

        if(sayi1>sayi2 && sayi2<sayi3){
            enKucuk=sayi2;
        }else if(sayi2>sayi3 && sayi1>sayi3){
            enKucuk=sayi3;
        }

        int fark=enBuyuk-enKucuk;

        System.out.println("en buyuk sayi  "+ enBuyuk+ " en kucuk sayi "+enKucuk+ " farkalari "+fark);
*/

        int enb=sayi1;
        int enk=sayi1;

        if(enb<sayi2)enb=sayi2;
        if(enb<sayi3)enb=sayi3;

        if(enk>sayi2)enk=sayi2;
        if(enk>sayi3)enk=sayi3;

        int fark=enb-enk;

        System.out.println(enb+ " " + enk + " " + fark);





    }// END OF MAIN METHOD
}//END OF CLASS
