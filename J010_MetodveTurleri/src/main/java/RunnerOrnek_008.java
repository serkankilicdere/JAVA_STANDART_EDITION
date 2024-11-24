import java.util.Scanner;

public class RunnerOrnek_008 {
    public static void main(String[] args) {
        /*
        İFADE ALIN İLK VE SON HARFİNİ YAZDIRIN
         */
        ifade();
    }//END OF MAIN METHOD
    public static String ifade(){
        System.out.println("ifadeyi giriniz:  ");
        String ifade= new Scanner(System.in).nextLine();
        String sonuc="";
        char ilkDeger=ifade.charAt(0);
        char sonDeger=ifade.charAt(ifade.length()-1);
        return sonuc;
    }
}//END OF CLASS
