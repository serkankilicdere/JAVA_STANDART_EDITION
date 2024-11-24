package Okul;

public class OrtaOkul extends OkulGenel{
    private int sinifSayisi;
    private int katSayisi;

    public OrtaOkul(){
        super();
        System.out.println("ortaokul constructor");
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
