public class Metodlar {
    public static void main(String[] args) {






    }//END OF MAIN METOD


        /*
        METOD TANIMLAMA;
        --> GÖREV YERİNE GETİREN VE GÖREVİN TÜRÜNE GÖRE BİLGİ TALEPM EDEN , GÖREV
        BİTTİĞİNDE DURUMA GÖRE GERİ BİLDİRİMDE BULUNAN YA DA BULUNMAYAN İŞLEVSEL
        KOD YAPILARIDIR

        public --> access modifier erişim belirteci --> zorunlu değil
        bir access modifier ile metodlar tanımlanır

        static --> zorunlu değil, gerekli olduğ durumlarda yazılır -- bellek alanı ile ilgili

        final --> zorunlu değil --  bir varlığın değişmezliğini belirtir

        (object) --> returntype bu herhangi bir değişken olarak tanımlanabilir yada void olabilir
                     burada object olarak dönüyor --> herhangi bir tip dönebilir dizi, int , boolean gibi

        metod name --> görev yapısının metodun adıdır relational bir isimdir yapacagı işle ilgili

        metodun parantez kısmı() --> metodun işlem gerçekleştirirken ihtiyaç duyacaği öğeleri almak için kullanırız
        --> parametreler ve argümanlar-->HATIRLA

        {} --> Metod gövdesidir, görevin yerine getirildiği kod bloğudur

        return --> metod eğer görev sonunda bilgi vermek istiyor ise return type'a uygun cevap döner
        bu bunun için anahtar kelimedir



         */






    public static final Object toplamaIslemiYap(String gorevDetay, int sayi1 , int sayi2 , char devamDurumu,
    Object genelTanim, boolean zorunluMu, String[] diziler )
    {
        int toplam=sayi1+sayi2;
        System.out.println("burada islem oluyor");
        return "Deneme";

    }





}// END OF CLASS
