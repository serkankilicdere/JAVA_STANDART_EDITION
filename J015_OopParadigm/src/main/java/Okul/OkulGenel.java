package Okul;

public class OkulGenel {

    private String okulAd;
    private int okulKapasite;

    public OkulGenel() {

    }
    public OkulGenel(String okulad, int okulKapasite) {
        System.out.println("okul genel constructor");
        this.okulAd = okulad;
        this.okulKapasite = okulKapasite;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getOkulKapasite() {
        return okulKapasite;
    }

    public void setOkulKapasite(int okulKapasite) {
        this.okulKapasite = okulKapasite;
    }
}
