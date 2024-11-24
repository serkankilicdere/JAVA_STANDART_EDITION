import java.util.Scanner;

public class RunnerOrnek_001 {
    public static void main(String[] args) {

        ekranaYaz();
        System.out.println("lutfen seciniz:  ");
        int secim = new Scanner(System.in).nextInt();
        switch (secim) {
            case 1:
                toplamYap();
                break;

            case 2:
                cikarmaYap();
                break;

            case 3:
                carpmaYap();
                break;
            default:
                System.out.println("yanlis secim");
        }
        System.out.println("kod bitti");


    }// END OF MAIN METOD

    public static void ekranaYaz() {
        System.out.println("""
                **************************
                *        ISLEMLER        *
                **************************
                *        1-TOPLAMA       *
                *        2-ÇIKARMA       *
                *        3-ÇARPMA        *
                **************************
                """);
    }

    public static void toplamYap() {
        System.out.println("1. sayi");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.println("2. sayi");
        int sayi2 = new Scanner(System.in).nextInt();
        int toplam = sayi1 + sayi2;
        System.out.println("sayi toplami: " + toplam);

    }

    public static void cikarmaYap() {
        System.out.println("1. sayi");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.println("2. sayi");
        int sayi2 = new Scanner(System.in).nextInt();
        int fark = sayi1 - sayi2;
        System.out.println("sayi farki: " + fark);
    }

    public static void carpmaYap() {
        System.out.println("1. sayi");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.println("2. sayi");
        int sayi2 = new Scanner(System.in).nextInt();
        int carpim = sayi1 + sayi2;
        System.out.println("sayi carpim: " + carpim);
    }

}//END OF CLASS
