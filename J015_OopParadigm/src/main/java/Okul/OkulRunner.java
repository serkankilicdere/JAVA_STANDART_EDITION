package Okul;

public class OkulRunner {
    public static void main(String[] args) {
        IlkOkul ilk = new IlkOkul("ilkokul",250);


        ilk.setSinifSayisi(5);
        System.out.println("kat sayisi "+ilk.getKatSayisi());
        System.out.println("sinif sayisi "+ilk.getSinifSayisi());
        System.out.println("ilkokul ad "+ilk.getOkulAd());
    }
}
