import java.util.Scanner;

public class RunnerOrnek_007 {
    public static void main(String[] args) {
        /*
        İKİ STRİNG İFADE ALARAK 1. İFADENİN İÇİNDE
        2. İFADENİN YER ALIP ALMADIĞINI DÖNEN METODU YAZINIZ
         */
        ikiIfade();
    }//END OF MAIN METHOD

    public static boolean ikiIfade(){
        System.out.println("ilk ifadeyi giriniz");
       String ifade1=new Scanner(System.in).nextLine().toLowerCase();
        System.out.println("ikinci ifadeyi giriniz");
       String ifade2=new Scanner(System.in).nextLine().toLowerCase();
        if(ifade1.contains(ifade2)){
            return true;
        }else{
            return false;
        }
    }

}//END OF CLASS
