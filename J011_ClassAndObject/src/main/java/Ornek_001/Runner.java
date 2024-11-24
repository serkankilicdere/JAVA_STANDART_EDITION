package Ornek_001;

public class Runner {
    public static void main(String[] args) {
        Ogrenci ogrenci01 = new Ogrenci();
        ogrenci01.ad = "Serkan KILICDERE";
        ogrenci01.adres = "IZMIR";
        ogrenci01.sinif = "001";
        ogrenci01.okulNo = "OKUL-001";
        ogrenci01.veli = "TARKAN";


        Ogrenci ogrenci02 = new Ogrenci();
        ogrenci02.ad = "Serhan KILICDERE";
        ogrenci02.adres = "ADANA";
        ogrenci02.sinif = "002";
        ogrenci02.okulNo = "OKUL-002";
        ogrenci02.veli = "GURKAN";

        Ogrenci[] ogrenciler = new Ogrenci[2];
        ogrenciler[0] = ogrenci01;
        ogrenciler[1] = ogrenci02;

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(i + 1 + ". öğrencinin adı....: " + ogrenciler[i].ad);


        }
    }
}
