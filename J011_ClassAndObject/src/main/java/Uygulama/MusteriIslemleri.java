package Uygulama;

import java.util.Scanner;

public class MusteriIslemleri {
    /*
   1- müsteri listele
   2- musteri borc listele
   3- musteri ödemi al
   4- musteri arama
     */
    Veriler veriler=new Veriler();
    public void initialize(){
        int secim;
        do{




        secim=secimAl();
        switch(secim){
            case 1: musteriListele();
            break;
            case 2: borcListele();
            break;
            case 3: odemeAl();
            break;
            case 4: musteriArama();
            break;
            case 0:
                System.out.println("çıktın");
                break;
                default:
                    System.out.println("gecerli gir");
        }
        }while (secim!=0);
    }
    public int secimAl(){
        System.out.println("""
        ***************************************
        *           MUSTERI TAKIP             *
        ***************************************
        *             1- ML                   *
        *             2- BL                   *
        *             3- OA                   *
        *             4- MA                   *
        *             0- CIK                  * 
        ***************************************    
                        """);
        System.out.println("seciniz");
        int secim=new Scanner(System.in).nextInt();
        return secim;
    }
    public void musteriListele(){

        System.out.println("""
                ***MUSTERI LISTESI***
                """);
        for(int i=0;i<veriler.mL.length;i++){
            System.out.println("musteri adı...:  "+veriler.mL[i]);
        }
        System.out.println("""
                --------------------------
                """);
    }
    public void borcListele(){

        System.out.println("""
                ***BORC LISTESI***
                """);
        for(int i=0;i<veriler.mL.length;i++){
            System.out.print("musteri adi/borcu....:  ");
            System.out.println(veriler.mL[i]+veriler.bL[i]);
        }
        System.out.println("""
                ------------------------------
                """);
    }
    public void odemeAl(){

        System.out.println("kim için(index)");
        int index = new Scanner(System.in).nextInt();
        System.out.println("yapılan odeme...:  ");
        double odemeTutari= new Scanner(System.in).nextDouble();
        veriler.oL[index]+=odemeTutari;
        System.out.println("odeme alınmıştır");
        System.out.println("""
                ---------------------------------
                """);
    }
    public void musteriArama(){

        System.out.println("kim?");
        String aranan=new Scanner(System.in).nextLine();
        int bulunanIndex=-1;
        for(int i=0;i<veriler.mL.length;i++){
            if(aranan.equalsIgnoreCase(veriler.mL[i])){
                bulunanIndex=i;
                break;
            }
        }
        if(bulunanIndex==-1){
            System.out.println("kayit yok");
            return;
        }
        System.out.println(veriler.mL[bulunanIndex]);
        System.out.println(veriler.bL[bulunanIndex]);
        System.out.println(veriler.oL[bulunanIndex]);
        System.out.println("""
                -------------------------------
                """);
    }
}
