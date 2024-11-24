import java.util.Scanner;

public class RunnerOrnek_002 {
    public static void main(String[] args) {

        /*
        4 adet değer alan int dizisi oluştur kullanıcıdan iste
         */

        Scanner input = new Scanner(System.in);

        int[] sayilar= new int[4];

        int sayi;

        for (int i = 0; i < 4; i++) {  // i< sayilar.length olabilir

            System.out.println((i + 1) + " sayiyi gir..:  ");
            sayi = input.nextInt(); // tek bir değişkenle halledilebilir
            sayilar[i] = sayi; // sayilar[i]= input.nextInt(); şeklinde tek satıra düşürülebilir

        }


    }//END OF METHOD
}//END OF CLASS
