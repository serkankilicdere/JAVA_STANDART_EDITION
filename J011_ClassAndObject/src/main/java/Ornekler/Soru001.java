package Ornekler;

public class Soru001 {
    public static void main(String[] args) {
    /*
    müsterilistesi sınıfı içinde
    müsterileri listeleyen bir metod
    istenilen indexe müsteri ekleyen bir method
    aranılan müşterinin indexini dönen bir method
    indexi verilen müşteriyi dönen bir method

    DİKKAT müsterilistesi ilk başta boş bir dizidir ve bu nedenle
    dizinin başlatılması gerekmektedir--> bu işlemi yapan metodo yazın
    bu metod dizinin boyutunu istesin ve diziyi oluştursun
    diğer metodlar dizi balatılmadan çalışırsa uyarı versim
     */
        MusteriListesi musteriListesi = new MusteriListesi();
        musteriListesi.diziBaslat(3);
        musteriListesi.musteriEkle("ahmet", 1);
        musteriListesi.musteriEkle("mehmet", 0);
        musteriListesi.musteriEkle("mehmet", 2);
        musteriListesi.musteriListele();
        musteriListesi.musteriIndexBul("ahmet");
        System.out.println("index no  " + musteriListesi.musteriIndexBul("ahmet"));
        musteriListesi.musteriGetir(1);
        System.out.println("isim " + musteriListesi.musteriGetir(1));
    }
}