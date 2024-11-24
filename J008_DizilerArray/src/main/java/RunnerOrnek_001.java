import java.util.Scanner;

public class RunnerOrnek_001 {
    public static void main(String[] args) {
        /*
        Dizi tanımlama
         */

        int[] sayilar;

        Scanner input = new Scanner(System.in);

        System.out.println("kac sayi olusturmak isterseniz..: ");

        int adet = input.nextInt();

        sayilar = new int[adet]; // 3 girmis olsun

        int sayi;

        for (int i = 0; i < adet; i++) {

        System.out.println((i+1)+ " sayiyi gir..:  ");
        sayi = input.nextInt(); // tek bir değişkenle halledilebilir
        sayilar[i] = sayi;

       /* System.out.println("2. sayiyi gir..: ");
          sayi = input.nextInt();
          sayilar[1] = sayi;


        System.out.println("3. sayiyi gir..: ");
        sayi = input.nextInt();
        sayilar[2] = sayi;



        */
        }
        System.out.println("program bitti");

    }// end method
}// end class
