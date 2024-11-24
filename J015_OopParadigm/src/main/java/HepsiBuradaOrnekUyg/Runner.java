package HepsiBuradaOrnekUyg;

public class Runner {
    public static void main(String[] args) {
        Urun urun = new Urun();
        Marka marka = new Marka();
        urun.marka = marka;
        marka.markaAdi = "casio";

        marka.model=new Model();

        marka.model.name = "g-shock";
        marka.model.tip = "dijital";
        marka.model.kordon = "iyon kaplama";
        marka.model.kasaMalzeme = "çelik";
        marka.model.kasaCapi = 45;


        System.out.println(urun.marka.markaAdi);


    }
}
