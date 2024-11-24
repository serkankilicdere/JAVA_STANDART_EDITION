import java.util.Scanner;

public class RunnerOrnek_Scope {
    /*
    GÖVDESİ OLAM HERHANGİ BİR KOD BLOĞUNUN {} LERİ ARASINDA
    KALAN KISIM ONUN SCOPEUDUR ANCAK ÖZEL DURUMLARDA BELLİ
    KOŞULLAR ALTINDA DEĞİŞKENLER SCOPE DIŞINDAN ERİŞİLEBİLİRLER
    ANCAK DEĞİŞKENLERİN VARLIKLARI KENDİ SCOPELARI İÇİNDEDİR
     */

    //asagıdaki değişkenler class içindeki tüm metodlarda erişilebilir olur
    // DİKKAT statik metodlar sadece statik değişkenler ile çalışır
    int sayi;
    String metin;
    static Scanner input ;
    static String deger;
    static double fiyat;

    public static void main(String[] args) {
        fiyat=123d;
        // aşağıdaki gibi statik olan tüm tanımlar uygulama derlenmeden önce belleklenir(adreslenir)
     //   sayi=6;//  statik değişken değil

        RunnerOrnek_Scope obj=new RunnerOrnek_Scope(); //incele anla
        obj.sayi=1;   // todo

    }//END OF MAIN METHOD
public void deneme() {
        deger3=5;
deger2=5;
}

    static int deger2;
    int deger3;
}//END OF CLASS
