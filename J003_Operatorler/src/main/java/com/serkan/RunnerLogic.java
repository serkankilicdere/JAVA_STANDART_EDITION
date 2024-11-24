package com.serkan;

import java.sql.SQLOutput;

public class RunnerLogic {
    public static void main(String[] args) {
        /**
         * birden fazla koşulun birlikte  incelenmesi için kullanılır mantıksal operatörler
         *
         *
         * (&& --> VE) -------- (|| --> VEYA)
         */

        String ka="serkan", sf="12345";
        System.out.println("kullanıcı adı doğrumudur   "+ (ka=="serkan"));
        System.out.println("şifre doğrumudur   "+ (sf=="12345"));


        System.out.println("kullanıcı adı ve sifre doğrumudur   "+ (ka=="serkan" && sf=="12345"));//TRUE
        System.out.println("kullanıcı adı ve sifre doğrumudur   "+ (ka=="Serkan" && sf=="12345"));//FALSE
        System.out.println("kullanıcı adı ve sifre doğrumudur   "+ (ka=="serkan" && sf=="123456"));//FALSE
        System.out.println("kullanıcı adı ve sifre doğrumudur   "+ (ka=="Serkan" && sf=="123456"));//FALSE

        System.out.println("---------------------------------");

        String il="Ankara";
        int yas=40;
        String cinsiyet="kadın";

        //bir sitemiz var siteye ankaralı olanlar ya da 40 yaş ve üzeri olanlar ya da kadın olanlar girerbilir.

        System.out.println("ankaralı 20 yaşında erkek   " +( il=="Ankara" || yas<=20 || cinsiyet=="erkek"));//TRUE
        System.out.println("izmirli 40 yaşında erkek    " +( il=="izmir" || yas>=40 || cinsiyet=="erkek"));//TRUE
        System.out.println("bursalı 39 yaşında erkek    " +( il=="bursa" || yas==39 || cinsiyet=="erkek"));//FALSE

        System.out.println("-----------------------------------------" );

/**
 * ilişkisel ve mantık operatörleri ile kullanılan ilişkisel sorgulamalarda ortaya
 * çıkan sonuç için bir atama yapmanız istenseydi sonucu hangi değişkene atardınız
 *
 * boolean ---> 1 bitlik - true/false
 * boolean isAnkara= true;
 *
 *
 */
//datatype     dataname    atama     value
   boolean     isAnkara      =      il =="Ankara";
        System.out.println("ankaramı?..  "+ isAnkara);


        yas=16;
        cinsiyet="Erkek";


        // yası 15+ olanlar ve erkek olanlar giriş yapabilir.


        boolean isLogin;

        //   değişken    atama      true     ve       true
             isLogin      =       yas>=15    &&     cinsiyet=="Erkek"   ;

        System.out.println("giriş yaptımı   "+ isLogin);

        System.out.println("----------------------------------------");

/**
 * kurallar;
 * bir sınavdan ortalama 60 ve üzeri alanlar geçecektir
 * ANCAK
 * öğretmen 5. soruyu yapanların direk gecebilceklerini söylemiştir
 * buna  göre aşağıda verilen bilgiler ışığında kodlamayı yapınız
 *
 */
int ortalamaOlmasiGereken = 60;
boolean  besinciSoruyuYaptiMi=true;

int ogrenciBirinciNotu=67;
int ogrenciIkinciNotu=54;
boolean ogrenciBesinciSoruCevabi= true;

boolean sonuc=(((ogrenciBirinciNotu + ogrenciIkinciNotu)/2) >= 60 || ogrenciBesinciSoruCevabi);// ortalama önce bulunup ortalama değişkenine atanıp
                                                                                                // ortalama olması gereken ile kıyaslanabilir

        System.out.println("öğrenci geçtimi?...   " +sonuc);


    }// end of main metod
}// end of class
