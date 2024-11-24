package Ornekler;

public class MusteriListesi {
    String[] musteriler;
    boolean baslatildiMi = false;


    public void diziBaslat(int adet) {
        musteriler = new String[adet];
        baslatildiMi = true;

    }
    public void musteriListele() {
        if (!baslatildiMi) {
            System.out.println("dizi başlatılmadı.");
            return;
        }
        for (int i = 0; i < musteriler.length; i++) {
            System.out.println(musteriler[i]);
        }
    }
    public void musteriEkle(String musteriAdi,int index) {
        if (!baslatildiMi) {
            System.out.println("dizi başlatılmadı.");
            return;
        }
        if(musteriler.length <= index || index < 0) {
            System.out.println("gecerli bir index giriniz");
            return;
        }
        musteriler[index] = musteriAdi;

    }
    public int musteriIndexBul(String musteriAdi) {
        if (!baslatildiMi) {
            System.out.println("dizi başlatılmadı.");
            return -1;
        }

        for (int i = 0; i < musteriler.length; i++) {
            if (musteriler[i].equals(musteriAdi))
                return i;
        }
        System.out.println("Müşteri bulunamadı: ");
        return -1;
    }
    public String musteriGetir(int index) {
        if (!baslatildiMi) {
            System.out.println("dizi başlatılmadı.");
            return null;
        }
        if(musteriler.length <= index || index < 0) {
            System.out.println("gecerli bir index giriniz");
            return null;
        }
        return musteriler[index];
    }
}
