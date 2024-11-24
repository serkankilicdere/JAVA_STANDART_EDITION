import java.util.Scanner;

public class RunnerOrnek_004 {
    public static void main(String[] args) {
        /*
        kullanıcıdan kaç adet sayi girmesi gerektiğini alın
        girdiği sayilari bir diziye ata sonra dizideki sayıların en büyük olanini en küçük olNİNİ
        ve ortalamasını bulup yazdırın
         */
        Scanner input = new Scanner(System.in);
        System.out.println("sayi adedini giriniz..: ");
        int adet = input.nextInt();
        int[] dizi = new int[adet];

        for (int i = 0; i < adet; i++) {
            System.out.println((i + 1) + ". elemanı giriniz");
            dizi[i] = input.nextInt();
        }

        for (int i = 0; i < adet; i++) {
            System.out.print(dizi[i] + " ");
        }


        int max = dizi[0];

        for (int i = 0; i < adet; i++) {
            if (dizi[i] > max) {
                max = dizi[i];
            }
        }
        int min = dizi[0];
        for (int i = 0; i < adet; i++) {
            if (dizi[i] < min) {
                min = dizi[i];
            }
            System.out.println();

        }
        System.out.println("max " + max + " min " + min);

        double ort = 0;
        double toplam = 0;

        for (int i = 0; i < adet; i++) {
            toplam += dizi[i];
        }
        ort = toplam / adet;


        System.out.println("ort " + ort + " toplam " + toplam);



          /*
         * Kullanıcıdan kaç adet sayı girmesi gerektiğini alıp
         * girdiği sayıları bir diziye atıyoruz. sonra bu dizinin
         * içerisindeki sayıların;
         * 1- En büyük olanını
         * 2- En küçük olanını
         * 3- tüm sayıların ortalamasını bulup
         * ekrana yazdırıyoruz.

        Scanner sc = new Scanner(System.in);
        System.out.print("lütfen girmek istediğiniz sayı adediniz giriniz....: ");
        int adet = sc.nextInt();
        int[] sayilar = new int[adet];
        for(int i=0;i<adet;i++){
            System.out.print(i+1+". sayıyı giriniz....: ");
            sayilar[i] = sc.nextInt();
        }
        // en büyük sayı : {3,33,4,9,0,22}
        int enb = sayilar[0]; // 3
        int enk = sayilar[0]; // 3
        int ort, toplam=0;
        for(int i=0;i<adet;i++){
            if(enb<sayilar[i]) enb = sayilar[i];
            if(enk>sayilar[i]) enk = sayilar[i];
            toplam += sayilar[i];
        }
        System.out.println("En büyük sayı...: "+ enb);
        System.out.println("En küçük sayı...: "+ enk);
        ort = toplam / adet;
        System.out.println("ortalama.......: "+ ort);

         */

    }// end of method
}// end of class
