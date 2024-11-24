package BankaMusteri;

public class BankaHesabi {
    /*
    bir banka hesabına ait tüm bilgileriniiçeren bankahesabı sınıfını oluşturun
    her müşterinin banka hesabıolucaktur
     */
    private static int sayac=0;

    private String ibanNo;
    private String hesapNo;
    private String hesapTuru;
    private String hesapTarih;
    private String hesapSifre;
    private String subeNo;


    public void hesapAc(String ibanNo,String hesapNo,String hesapTuru,String hesapTarih,String subeNo){

     this.ibanNo=ibanNo;
     this.hesapNo=hesapNo;
     this.hesapTuru=hesapTuru;
     this.hesapTarih=hesapTarih;
     this.subeNo=subeNo;

        sayac++;
    }

    public String hesapOku() {
        return hesapNo ;
    }


    public void HesapSifre(String hesapSifre) {
        if(sayac==0) System.out.println("önce hesap açınız");
        this.hesapSifre=hesapSifre;
    }


    public static void main(String[] args) {
        Musteri musteri01=new Musteri();
        musteri01.ad="Serkan";
        musteri01.adres="Izmir";
        musteri01.soyad="Kilicdere";

        musteri01.tcNoyaz("1245678");
        musteri01.telNoyaz("145796");



        BankaHesabi bh01=new BankaHesabi();
        bh01.hesapAc("12457","14789","normal","dun","izmir");
        bh01.HesapSifre("1784");

        System.out.println(bh01.hesapOku());

        System.out.println(musteri01.ad);
        System.out.println(musteri01.soyad);
        System.out.println(musteri01.adres);
        System.out.println(musteri01.tcNo());
        System.out.println(musteri01.telNo());


    }


































}