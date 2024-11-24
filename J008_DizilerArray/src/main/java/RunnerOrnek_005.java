import java.util.Scanner;

public class RunnerOrnek_005 {
    public static void main(String[] args) {
        int secim;
        String[] ogrenciler=new String[3];

        do {
            System.out.println("""
                    1-Öğrenci Ekleme
                    2-Öğrenci Listeleme
                    0-Çıkış
                    """);

            System.out.println("Lütfen Seçiniz..:");
            secim = new Scanner(System.in).nextInt();

            switch (secim) {
                case 1:
                    for (int i = 0; i < ogrenciler.length; i++) {
                        System.out.println((i+1)+"öğrencinin adı soyadı");
                        ogrenciler[i] = new Scanner(System.in).nextLine();
                    }

                    break;
                case 2:

                    for (int i = 0; i < ogrenciler.length; i++) {
                        System.out.println((i+1)+" öğrenci "+ogrenciler[i]);
                    }
                    break;

                case 0:
                    System.out.println("Çıkış Yapıldı");
                    break;

                default:
                    System.out.println("Geçerli bir seçim yapınız");
                    break;
            }

        }while(secim!=0);


    }// END METHOD
}//END CLASS
