package com.serkan;


/*

4 basamakli sayilarin basamak degerlerini bulup ekrana yazdiran kodu yaz

binler 3 yüzler 5 onlar 3 birler 2 gibi

 */

import java.util.Scanner;

public class RunnerOrnek_013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 1 ile 4 basamaklı bir sayı al
        System.out.print("1 ile 4 basamaklı bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Basamak değerlerini yazdır
        System.out.println("Girilen sayının basamak değerleri:");

        int basamak = 1;
        while (sayi > 0) {
            int basamakDegeri = sayi % 10;
            System.out.println(basamak + ". basamak: " + basamakDegeri);
            sayi /= 10;
            basamak++;
        }
    }
}

