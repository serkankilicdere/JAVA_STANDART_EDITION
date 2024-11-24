package com.serkan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ornek_001 {
    public static void main(String[] args) {
/*
  kullanıcı adı --> String userName;
  sifre --> String password;

  Örnek1 : Kullanıcıdan aldığınız 2 sayının 4 işleme tabi tutulmuş sonuçlarını
  ekrana yazdıran kodu yazınız

 */

// Örnek 1:

        double sayi1, sayi2 , toplam , fark, bolum, carpim,mod;
        Scanner input = new Scanner(System.in);
        System.out.println("1 sayiyi giriniz: ");
        sayi1 = input.nextDouble();
        System.out.println("2 sayiyi giriniz: ");
        sayi2 = input.nextDouble();

        toplam = sayi1+sayi2;
        fark=sayi1-sayi2;
        bolum=sayi1/sayi2;
        carpim=sayi1*sayi2;
        mod=sayi1%sayi2;

        System.out.println(sayi1 + " + " + sayi2 + " = " + toplam);
        System.out.println(sayi1 + " - " + sayi2 + " = " + fark);
        System.out.println(sayi1 + " / " + sayi2 + " = " + bolum);
        System.out.println(sayi1 + " * " + sayi2 + " = " + carpim);
        System.out.println(sayi1 + " % " + sayi2 + " = " + mod);








    } //END OF MAIN METHOD
}//END OF CLASS