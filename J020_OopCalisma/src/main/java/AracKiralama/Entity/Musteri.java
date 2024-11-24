package AracKiralama.Entity;

public class Musteri extends BaseEntity{
    private String ad;
    private String adres;
    private String telefon;
    private int ehliyetNo;



    public Musteri(String ad, String adres, String telefon, int ehliyetNo) {

        this.ad = ad;
        this.adres = adres;
        this.telefon = telefon;
        this.ehliyetNo = ehliyetNo;
    }

    public String getAd() {
        return ad;
    }

    public String getAdres() {
        return adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public int getEhliyetNo() {
        return ehliyetNo;
    }
}
