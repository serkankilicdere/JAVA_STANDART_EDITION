package com.serkan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RunnerOrnek_016 {
    public static void main(String[] args) {

        int secim;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("""
                    ****Otel Otomasyon*****
                    1-Kayıt
                    2-Müşteri Arama
                    3-Oda Ekleme
                    4-Oda Listesi
                    5-Oda Arama
                    6-Raporlama
                    0-Çıkış
                    """);

            System.out.println("lütfen seçiniz..: ");
            secim = input.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    break;
            }


        } while (secim != 0);
    }
}
