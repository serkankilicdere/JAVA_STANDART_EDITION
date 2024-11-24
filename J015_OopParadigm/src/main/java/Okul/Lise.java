package Okul;

public class Lise extends OkulGenel {
    private int sinifSayisi;
    private int katSayisi;

    public Lise(){
        super();
        System.out.println("lise constructor");
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
