package com.serkan;

public class RunnerDegiskenTurleri {

    public static void main(String[] args) {

        /**
         *
         * Degisken türleri
         * 1. primitive data types - ilkel veri türleri
         * 2. referenced data types - referans (nesne) veri türleri
         *
         *
         * PRIMITIVE DATA TYPES ;
         *
         * 1.1 Sayısal veri türleri;
         *
         * Tam sayılar;
         *
         *1. byte : 8 adet kutucuk 8 bit yani 2^8 = 256 adet sayı
         * byte byteDegiskeni;
         * byteDegiskeni=90; ==> one statement yada bir satır kod
         *
         *2. short : 16 adet  kutucuk 16 bit ==> 2^16 = 65 bin küsür sayı
         *
         *3. int :  integer kısaltması 32 adet kutucuk 32 bit 2^32 adet sayı
         *
         * ÖNEMLİ NOT: javada defaul değerler ve değişkenler vardır  sayısal değerler için bu int'dir
         * bu durum ise bellekte adreslenme ve hacim ile ilgilidir
         *
         *4. long : 64 adet kutucuk 64 bit ve 2^64 adet sayı ==> Long değişkenini değerin sonuna
         *L koyarak belirtiriz
         *
         *
         * Ondalık sayılar - floating poiny number
         * float: 32 bit
         * double : 64 bit
         *
         *
         * Karakter Veri Türü
         * char
         *
         *
         *
         *
         *
         * REFERENCE DATA TYPES
         *
         * String: metinsel ifadeleri içeren değişken türümüz, karakter dizileri olarak tutulur.

         */
        byte byteDegiskeni;
        byteDegiskeni = 127;
        System.out.println("byteDegiskeni = " + byteDegiskeni);
        byteDegiskeni = (byte) 256; // explicit casting
        System.out.println("--------------------------------------");
        short shortDegiskeni;
        shortDegiskeni = 256;
        System.out.println("------------------------------------");
        int intDegiskeni;
        intDegiskeni = 256;
        System.out.println("--------------------------------------");
        //System.out.println("2 sayıyı toplayınız " + (85+5)); ==> burdaki bütün değerler bellekte adreslenir
        //  85 , 5 ve cümlede dahil bu yüzden 85 ve int olarak tanımlanıp adreslenir
        System.out.println("-----------------------------------");
        long longDegiskeni;
        longDegiskeni = 98000000000000L;

        /**
         * Dikkat!!!
         * daha büyük aynı tür değişkenler alt türlerini kapsar değer atanabilir
         * ancak alt türler üst değişken türlerine direkt atanamazlar bu yüzden cast işlemi vardır
         * cast işlemi 2 ye ayrılır implicist casting ve explicit casting implicit java kendisi küçükten
         * büyüğe yapar explicit coder yapar ve keywords kullanır.
         */
        int yeniSayi = 54000;
        long yeniUzunSayi = 7;
        byte yeniByte = 1;
        // yeniUzunSayi = yeniSayi;
        yeniByte = (byte) yeniUzunSayi;
        System.out.println("cast edilmiş byte değeri => " + yeniByte);

        System.out.println("----------------");
         // aşağıdaki örnekte long değeri olduğu belirtilmesiydi son çarpımda veri kaybı (default int olduğu) yaşanır
        int saniye = 1000; //ms
        int dakika = saniye * 60;
        int saat = dakika * 60;
        int gun = saat * 24;
        int ay = gun * 30;
        int yil = ay * 12;
        long yas = yil * 46L;
        System.out.println("ben doğalı kaç ms olmuş " + yas);

        System.out.println("-------------------------------------");

        /**
         * değişken tanımlarken dikkat
         *
         * değişken ismileri sayıyla başlamaz
         * özel karakterler(boşlukta dahil) ve javadaki keywordlar kullanılamaz
         * değişken isimlerinde _ ve para birimi sembolleri haricinde başka bir karakterle başlayamaz
         * ve değişken isimlerinde türkçe karakter kullanılmamalı
         * değişken ve metod isimlendirmelerinde lower camel case yöntemi kullanılır
         *
         */

        int toplamPara = 3568987; // bu şekilde sayının okumması zor o yüzden bunun için özel bir gösterim vardır
        toplamPara = 3_568_987;// özel gösterim bu şekildedir

        System.out.println("toplamPara = " + toplamPara);

        System.out.println("-------------------------------------");

        float ondalikSayi = 35_000.54f;// default değer doble o yüzden float tipin sonuna f konur

        int digerSayi = 5;
        float digerOndalik = digerSayi;
        System.out.println("diger ondalik sayi... " + digerOndalik);

        System.out.println("---------------------------");
        digerOndalik = 65.87f;
        digerSayi = (int) digerOndalik;
        System.out.println("diger tam sayi... " + digerSayi); // bu durumda round işlemi yapmaz burada ondalık kısmı atarak tam sayı
        // kısmını gösterir
        System.out.println("--------------------------------");
        double buyukOndalikSayi = 9_000_000_000_000_000.2_342_324_324_234_234d;// d kullanımında bir zorunluluk yok

        /**
         * DİKKAT!!!
         * TÜM İLKEL VERİ TÜRLERİNİN KAPSAYICI SINIFLARI (WRAPPER CLASS)
         * BU SINIFLAR BU TİPLERİ DAHA KOLAY YÖNETMEK VE UYGULAMA AŞAMASINDA KOLAYLIK SAĞLAR
         *
         * byte==>Byte
         * short==> Short
         * int==>Integer
         * float==>Float
         */

        System.out.println("byte min değer..." + Byte.MIN_VALUE); // bu propertymi yoksa metodmu öğren

        System.out.println("------------------------");

        char karakterDegiskeni;
        karakterDegiskeni = 'A';// karakterin kendisi tek tırnak içinde atanabilir
        System.out.println("karakterDegiskeni = " + karakterDegiskeni);
        karakterDegiskeni = 66; // karakter değerini sayısal olarak atayabilirsiniz
        System.out.println("karakterDegiskeni = " + karakterDegiskeni);
        karakterDegiskeni = '6';


        // aşagıdaki örnekleri inceleyiniz !!!!!!
        System.out.println("karakterDegiskeni = " + karakterDegiskeni);
        System.out.println("karakterDegiskeni = " + (int) karakterDegiskeni);
        System.out.println("karakter......." + karakterDegiskeni + 5);
        System.out.println("karakter......" + (karakterDegiskeni + 5));


        System.out.println("----------------------------");

        String ad = "serkan";
        System.out.println("adınız......." + ad);

        /**
         * bir durumu tespit etmekte, anahtar yapılı akışlarda sıklıkla
         * kullanılan özel bir değişkenimiz
         * boolean-> 1 bitlik değeri ile bir çok alanda kullanılmaktadır
         * 1 bit--> 0-1 değeri/ evet-hayır/ doğru-yanlıi/ TRUE-FALSE
         */
        System.out.println("----------------------");

        boolean booleanDegiskeni = true;// evet,doğru
        booleanDegiskeni = false;// hayır,yanlış


        // alternatifi ne olabilir aşağıda
        byte isActive = 'e'; // evet için veya true yerine  bu 8 bit kaplar--> verimli değil


    } //End of main metod
}// end of Runner DegiskenTurleri sınıfı
