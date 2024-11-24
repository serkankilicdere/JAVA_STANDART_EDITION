package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_008 {
    public static void main(String[] args) {
        /*
        f(x,y)=x^y gibi bir fonksiyon olsun burada islem x üzeri y seklinde
        sonuç veren bir fonksiyon buna göre kullanıcıdan alınan x ve y ile sonucu bulan for döngusunu yazan programı bulunuz
         */

        Scanner input = new Scanner(System.in);

        int  sonuc=1;

        System.out.println("taban degerini giriniz");
        int taban=input.nextInt();
        System.out.println("us degerini giriniz");
        int us=input.nextInt();

        for(int i=1; i<=us  ; i++){ // üs kadar taban degeri kendisiyle carpılıcak o yüzden i 1den üse kadar giderken
            sonuc*=taban;           // taban degeri kendiyle kod blogu icinde carpılcak
        }
        System.out.println(sonuc);

    }// end of metod
}//end of class
