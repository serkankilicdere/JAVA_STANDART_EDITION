import java.util.Scanner;

public class RunnerOrnek_003 {
    public static void main(String[] args) {
        System.out.println("arac fiyatı");
        double fiyat = new Scanner(System.in).nextDouble();
        System.out.println("motor hacmi");
        int motorHacmi = new Scanner(System.in).nextInt();
        double otvTutari = otvHesapla(fiyat, motorHacmi);
        System.out.println("aracin ötv'si  " + otvTutari);
        System.out.println("aracın ötv'si:  " + otvHesapla(fiyat, motorHacmi));

    }//END OF MAIN METHOD

    /*
    bir araça ait ötv oranını hesaplayan kodu yazınız
     */
    public static double otvHesapla(double fiyat, int motorHacmi) {
        //0-1000 %50
        //1001-1500 %80
        //1501-2000 %110
        //2000 ve üzeri %220
        double otv = 0;
        if (motorHacmi < 1000) {
            otv = fiyat * 0.5;
        } else if (motorHacmi <= 1500) {
            otv = fiyat * 0.8;
        } else if (motorHacmi <= 2000) {
            otv = fiyat * 1.1;
        } else {
            otv = fiyat * 2.2;
        }

        return otv;
    }

}//END OF CLASS
