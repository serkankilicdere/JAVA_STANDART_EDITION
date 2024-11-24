package AracKiralama.Entity;

public class Kiralama extends BaseEntity {

    private Arac arac;
    private Musteri musteri;
    private Firma  firma;
    private String kiralamaTarihi;
    private double kiralamaBedeli;


    public Kiralama(double kiralamaBedeli, String kiralamaTarihi, Firma firma, Musteri musteri, Arac arac) {
        this.kiralamaBedeli = kiralamaBedeli;
        this.kiralamaTarihi = kiralamaTarihi;
        this.firma = firma;
        this.musteri = musteri;
        this.arac = arac;
    }

    public double getKiralamaBedeli() {
        return kiralamaBedeli;
    }

    public String getKiralamaTarihi() {
        return kiralamaTarihi;
    }

    public Firma getFirma() {
        return firma;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public Arac getArac() {
        return arac;
    }
}
