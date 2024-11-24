package com.serkan;

public class RunnerGorev {

    /**
     * Class gövdesi içinde değişken ve metod ve inner class tanımlanabilir
     * kodlama ve iş akışlarını yazamazsınız
     * kodlar metodlar içinde yürütülebilir.
     *
     */
    public static void main(String[] args) {
        /**
         * = --> assignment(atama operatörü) yada görev operatörü
         * görev operatörleri bir değişkene bir değeri atamak için kullanılır
         * bazende bir nesneni referansını değişkene aktarmak için kullanılır
         */

        int sayi1;// tanımlama
        sayi1=5;//değer atama
        int sayi2=45;//initialize (başlatmak)// bellekte adreslenebilmesi için değişkenin initialize edilmesi gerekir

        /**
         * += , -= , /= , %= , *=
         */

        int vizeNotu=60;
        int finalNotu=87;

        vizeNotu += finalNotu;//  vizeNotu= vizeNotu + finalNotu; demektir

        System.out.println("vizeNotu = " + vizeNotu);

        System.out.println("---------------------------");

int stok=100;
int satısAdedi=4;
stok-=satısAdedi; // stok= stok-satısAdedi; demektir

        System.out.println("stok = " + stok);


        System.out.println("-----------------");

        int adet=5;
        int tekrarSayisi=3;
        adet *=tekrarSayisi; // adet= adet * tekrarSayisi;
        System.out.println("adet = " + adet);

        System.out.println("---------------------------");

        adet /=2;
        System.out.println("adet = " + adet);

        System.out.println("----------------------------");

        int mevcutTekrar=2354;
        mevcutTekrar %=8;
        System.out.println("mevcut = " + mevcutTekrar);

        System.out.println("-------------------------------");
    }// end of method
}// end of class
