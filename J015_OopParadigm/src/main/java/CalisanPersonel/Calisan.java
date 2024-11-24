package CalisanPersonel;

public class Calisan {

    private String ad;
    private String soyad;
    private String olusturmaTarihi;
    private String brans;

    public Calisan() {

    }
    public Calisan(String ad, String soyad, String olusturmaTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.olusturmaTarihi = olusturmaTarihi;

        System.out.println("calisan constructor");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getOlusturmaTarihi() {
        return olusturmaTarihi;
    }

    public void setOlusturmaTarihi(String olusturmaTarihi) {
        this.olusturmaTarihi = olusturmaTarihi;
    }
}
