package AracKiralama.Entity;

public class Firma extends BaseEntity {
    private String firmaAdi ;
    private String firmaAdres ;
    private String firmaMudur ;

    public Firma(String firmaAdi, String firmaAdres, String firmaMudur) {
        this.firmaAdi = firmaAdi;
        this.firmaAdres = firmaAdres;
        this.firmaMudur = firmaMudur;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public String getFirmaAdres() {
        return firmaAdres;
    }

    public String getFirmaMudur() {
        return firmaMudur;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public void setFirmaAdres(String firmaAdres) {
        this.firmaAdres = firmaAdres;
    }

    public void setFirmaMudur(String firmaMudur) {
        this.firmaMudur = firmaMudur;
    }
}
