package com.serkan;

import java.util.Scanner;

public class KararYapilariSwitchCase {
    public static void main(String[] args) {

        /*
        switch(durum){
        case(1.durum):1.işlem;break;
        case(2.durum):2.işlem;break;
        *
        *
        default:default işlem:;break;


         */


        // ORNEK!!!
        System.out.println("""
                **** İŞLEMLER ******
                1- Toplama
                2- Çıkartma
                3- ÇArpma
                4- Bölme
                5- Mod Alma
                0- ÇIKIŞ                
                """);


        System.out.print("lütfen seçiniz...: ");
        int secim = new Scanner(System.in).nextInt();
        if(secim==1) System.out.println("Toplama yapıldı");
        else if(secim==2) System.out.println("Çıkartma yapıldı");
        else if(secim==3) System.out.println("Çarpma yapıldı");
        else if(secim==4) System.out.println("Bölme yapıldı");
        else if(secim==5) System.out.println("Mod alma yapıldı");
        else if(secim==0) System.out.println("ÇIKIŞ yapıldı");
        else System.out.println("Geçersiz seçim yaptınız");

        switch (secim){
            case 1:
                System.out.println("Toplama yapıldı");
                int yenisayi = 5+9;
                int toplam = yenisayi * 9 + 988;
                System.out.println(toplam);
                break;
            case 2: System.out.println("Çıkartma yapıldı"); break;
            case 3: System.out.println("Çarpma yapıldı"); break;
            case 4: System.out.println("Bölme yapıldı"); break;
            case 5: System.out.println("Mod alma yapıldı"); break;
            case 0: System.out.println("ÇIKIŞ yapıldı"); break;
            default:
                System.out.println("Lütfen geçerli bir seçim yapınız.");
        }

        System.out.println("""
                
                
                """);

        /**
         * 1...12 yılın ayları vardır, kullanıcı bu aralıkta bir rakam seçtiğinde
         * o rakama karşılık gelen ayı yazdıran switch..case kodunu yazınız.
         */

        System.out.print("Lütfen ay giriniz...: ");
        int ay = new Scanner(System.in).nextInt();
        switch (ay) {
            case 1: System.out.println("OCAK");break;
            case 2: System.out.println("SUBAT");break;
            case 3: System.out.println("MART");break;
            default:
                System.out.println("LÜTFEN GEÇERLİ BİR SEÇİM YAPINIZ");
        }

        switch (ay){ // JavaSE 14+
            case 12,1,2 : System.out.println("KIŞ"); break;
            case 3,4,5 : System.out.println("İLK BAHAR"); break;
            case 6,7,8 : System.out.println("YAZ"); break;
            case 9,10,11 : System.out.println("SON BAHAR"); break;
            default: System.out.println("LÜTFEN GEÇERLİ BİR SEÇİM YAPINIZ");
        }

        String mevsim;

        mevsim = switch (ay){
            case 12,1,2 -> "KIŞ";
            case 3,4,5 -> "İLK BAHAR";
            case 6,7,8 -> "YAZ";
            case 9,10,11 -> "SON BAHAR";
            default -> "";
        };
        System.out.println("return type....: "+ mevsim);

        System.out.println("""
                
                
                """);
// Ornek 3 ?? YARIM KALDI!!
        int ssecim;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("""
                **** Otel Otomayon ****
                1- Kayıt
                2- Müşteri Arama
                3- Oda Ekleme
                4- Oda Listesi
                5- Oda Arama
                6- Raporlama
                0- ÇIKIŞ
                """);
            System.out.print("Lütfen seçiniz......: ");
            ssecim = sc.nextInt();
            switch (secim) {
                case 1: System.out.println("");break;
                case 2: System.out.println("");break;
                case 3: System.out.println("");break;
                case 4: System.out.println("");break;
                case 5: System.out.println("");break;
                case 6: System.out.println("");break;
                case 0: System.out.println("");break;
                default: System.out.println("");break;
            }
        }while (ssecim!=0); // diyelim 1 seçtim -> 1 0 a eşit değil midir? EVET - true






    }//END OF MAIN METHOD
}//END OF CLASS
