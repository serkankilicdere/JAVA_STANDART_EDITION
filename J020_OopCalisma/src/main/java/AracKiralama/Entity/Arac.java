package AracKiralama.Entity;

import java.util.UUID;

public class Arac extends BaseEntity{

    private String plaka;
    private int yil;
    private String sanziman;
    private String yakitTuru;
    private int km;
    private boolean kiralanabilirMi;
    private Marka marka;
    private  Model model;
//    public boolean kirala(){//       if(kiralanabilirMi){
//            kiralanabilirMi = false;
//            return true;
//        }
//        return false;
//    }


    public Arac() {
    }

    public Arac(boolean kiralanabilirMi, int km, String yakitTuru, String sanziman, int yil, String plaka,Marka marka, Model model ) {
        this.marka=marka;
        this.model=model;
        this.kiralanabilirMi = kiralanabilirMi;
        this.km = km;
        this.yakitTuru = yakitTuru;
        this.sanziman = sanziman;
        this.yil = yil;
        this.plaka = plaka;


    }


    // get set


    public Marka getMarka() {
        return marka;
    }

    public Model getModel() {
        return model;
    }

    public boolean isKiralanabilirMi() {
        return kiralanabilirMi;
    }

    public int getKm() {
        return km;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public String getSanziman() {
        return sanziman;
    }

    public int getYil() {
        return yil;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void setSanziman(String sanziman) {
        this.sanziman = sanziman;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setKiralanabilirMi(boolean kiralanabilirMi) {
        this.kiralanabilirMi = kiralanabilirMi;
    }
}
