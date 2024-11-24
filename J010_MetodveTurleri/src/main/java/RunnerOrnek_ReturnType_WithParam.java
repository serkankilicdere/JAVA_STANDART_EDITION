import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class RunnerOrnek_ReturnType_WithParam {
    public static void main(String[] args) {
        System.out.println("""
                **** ALAN HESAPLAMA ****
                """);

        System.out.println("taban uzunlugu giriniz"   );
        int tabanUzunlugu=new Scanner(System.in).nextInt();
        System.out.println("yukseklik giriniz: ");
        int yukseklik=new Scanner(System.in).nextInt();
        double alan=ucgeninAlaniniHesapla(tabanUzunlugu,yukseklik);
        System.out.println("alan: "+alan);

    }//END OF MAIN METHOD

    /*
    HEM GERİ DÖNÜŞ TİPİ OLAN HEMDE PARAMETRE TALEP EDEN METODLARDIR
     */

    public static double ucgeninAlaniniHesapla(int yukseklik, int tabanUzunlugu){
        double alaniniHesapla = (yukseklik * tabanUzunlugu)/2;
        return alaniniHesapla;
    }

}//END OF CLASS
