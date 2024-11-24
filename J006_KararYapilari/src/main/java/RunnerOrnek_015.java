package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_015 {
    public static void main(String[] args) {

       /*
       1...12 arasında yılın aylarını kullanıcının değer girdiğinde seçtiği ayı yazdıran
       switcH..case kodunu yazınız
        */


        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 1 ile 12 arasında bir değer al
        System.out.print("Bir ay numarası girin (1-12): ");
        int ay = scanner.nextInt();

        switch (ay) {
            case 12, 1, 2:
                System.out.println("kış");
                break;
            case 3, 4, 5:
                System.out.println("ilkbahar");
                break;
            case 6, 7, 8:
                System.out.println("yaz");
                break;
            case 9, 10, 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("gecerli bir sayi girin");
        }


        // Switch-case kullanarak ayın adını yazdır
        switch (ay) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Lütfen 1 ile 12 arasında bir değer girin.");
                break;
        }


    }//END OF MAIN METHOD
}//END OF CLASS
