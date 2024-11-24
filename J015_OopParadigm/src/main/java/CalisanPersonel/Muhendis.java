package CalisanPersonel;

public class Muhendis extends Calisan {
    public Muhendis(String ad,String soyad,String olusturmaTarihi) {
        super(ad,soyad,olusturmaTarihi);
        this.setBrans("mühendis");
        System.out.println("Muhendis constructor");
    }
    public Muhendis() {
        this.setBrans("muhendis");
    }


}
