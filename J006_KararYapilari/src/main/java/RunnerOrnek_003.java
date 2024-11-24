package com.serkan;

public class RunnerOrnek_003 {
    public static void main(String[] args) {
        /*
        OGRENCİLERİN ORTALAMA NOTLARININ HARF KARSILIKLARINI BULAN KODU YAZINIZ

        ----------else if kullanımına ornektir--------------

        for==> {} kullanılmazsa ;'e kadar olan kısım for'a dahildir benzeri if kullanımındada mevcuttur

         */

        int ortalama=76;

        if(ortalama>0 && ortalama<=10){
            System.out.println("FF");
        }else if(ortalama>10 && ortalama<=20) {
            System.out.println("FD");
        }else if(ortalama>20 && ortalama<=30) {
            System.out.println("DD");
        }else if(ortalama>30 && ortalama<=40) {
            System.out.println("DC");
        }else if(ortalama>40 && ortalama<=50) {
            System.out.println("CC");
        }else {
            System.out.println("AA");
        }

        /*
        FOR'daki gibi bir kullanım ornegi asagıdadır ve suslu parantezler kaldırılmıstır


             if(ortalama>0 && ortalama<=10)
            System.out.println("FF");
        else if(ortalama>10 && ortalama<=20)
            System.out.println("FD");
        else if(ortalama>20 && ortalama<=30)
            System.out.println("DD");
        else if(ortalama>30 && ortalama<=40)
            System.out.println("DC");
        else if(ortalama>40 && ortalama<=50)
            System.out.println("CC");
        }else
            System.out.println("AA");

         */


    }//END OV MAIN METHOD
}//END OF CLASS
