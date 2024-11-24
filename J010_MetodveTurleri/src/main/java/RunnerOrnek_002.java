import java.util.Scanner;
// todo
public class RunnerOrnek_002 {
    public static void main(String[] args) {
        ekranaYaz();

        switch (secimYap()) {
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
        int s1=sayiAl();
        int s2=sayiAl();
        int toplam = s1 + s2;
        System.out.println("sayi toplami: " + toplam);

    }

    public static void cikarmaYap() {
        int s1=sayiAl();
        int s2=sayiAl();
        int fark = s1 - s2;
        System.out.println("sayi farki: " + fark);
    }

    public static void carpmaYap() {
        int s1=sayiAl();
        int s2=sayiAl();
        int carpim = s1 * s2;
        System.out.println("sayi carpim: " + carpim);
    }

    public static int secimYap(){
        System.out.println("bir sayi giriniz:  ");
        int sayi1= new Scanner(System.in).nextInt();

        return sayi1;
    }

    public static int sayiAl (){
        System.out.println("bir sayi giriniz:  ");
        int sayi= new Scanner(System.in).nextInt();
    return sayi;
    }


}//END OF CLASS
