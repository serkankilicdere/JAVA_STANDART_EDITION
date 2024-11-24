import java.util.Scanner;

public class RunnerOrnek_009 {
    public static void main(String[] args) {
        /*
        bir ifadenalan ve bu ifadenin kelimekerini terş çevirerek
        sting bir değer dönen kod
         */
ifadeAl();
ifadeTersCevir();

    }//END OF MAIN METHOD

    public static String ifadeAl(){
        System.out.println("metni yazınız: ");
       String ifade = new Scanner(System.in).nextLine();
return ifade;
    }//END OF IFADEAL

    public static String ifadeTersCevir(){
        String ifade=ifadeAl();

return ifade;
    }

}//END OF CLASS
