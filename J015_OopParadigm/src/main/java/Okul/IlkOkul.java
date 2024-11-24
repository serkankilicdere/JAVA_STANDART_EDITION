package Okul;

public class IlkOkul extends OkulGenel{
    private int sinifSayisi;
    private int katSayisi;

    public IlkOkul(String okulAd, int okulKapasite){
        super(okulAd, okulKapasite);
        System.out.println("ilk okul constructor");
    }

    public int getSinifSayisi() {
        return sinifSayisi;
    }

    public void setSinifSayisi(int sinifSayisi) {
        this.sinifSayisi = sinifSayisi;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }
}
