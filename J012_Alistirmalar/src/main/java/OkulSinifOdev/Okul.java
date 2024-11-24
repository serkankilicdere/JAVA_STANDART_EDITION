package OkulSinifOdev;

import java.util.Scanner;

public class Okul {
    public String okulAdi;
    public String okulAdres;
    public String okulTelefon;
    public String OkulMudur;


  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    Sinif[] okulSinif=new Sinif[4];

      Sinif sinif=new Sinif();
      int i=0;

      while (i<4) {

          System.out.println("4 tane sınıf bilgisi girmelisiniz "+(i+1)+"."+" sınıfı giriniz");

          System.out.println("sınıf adı nedir?:   ");
          sinif.setSinifAdi(new Scanner(System.in).nextLine());
          System.out.println("sınıf kat nedir?:   ");
          sinif.setSinifKat(new Scanner(System.in).nextLine());
          System.out.println("sınıf oda no nedir?:   ");
          sinif.setSinifOdaNo(new Scanner(System.in).nextLine());
          System.out.println("sınıf ogrenci sayı nedir?:   ");
          sinif.setOgrenciSayi(new Scanner(System.in).nextLine());

          okulSinif[i] = sinif;
          i++;

      }


    for(i=0;i<okulSinif.length;i++) {
    System.out.println("sınıf adı:........"+sinif.getSinifAdi());
    System.out.println("sınıf kat no:....."+sinif.getSinifKat());
    System.out.println("sınıf oda no:....."+sinif.getSinifOdaNo());
    System.out.println("ogrenci sayisi:..."+sinif.getOgrenciSayi());
    System.out.println( """
           -----------------------------------------------
            """);
}

  }
}
