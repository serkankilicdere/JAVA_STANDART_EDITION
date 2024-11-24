import java.util.Scanner;

public class RunnerOrnek_001 {
    public static void main(String[] args) {
        /*
        kullanıcıda adını alın ve tersten yazdırın
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Adınızı giriniz");

        String str = sc.nextLine();

        for(int i=str.length()-1; i>=0; i--){

            System.out.println(str.charAt(i));
        }

    }// END METHOD
}//END CLASS
