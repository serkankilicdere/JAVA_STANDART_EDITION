import java.util.Scanner;

public class RunnerOrnek_001 {
    public static void main(String[] args) {
        /*
        OKUL OTOMASYON
        ders listesi --> String[] dersList // 5 ders girilecek müdür talimatı
        ve bu bir arayüzle olucak örnek aşagıda

        ****** OKUL OTOMASYON *******

        1-ders ekleme    // kac ders girmek istersiniz 1. 2. 3. ders.....
        2-ders listesi   // ders listesi vericeksiniz
        **** ders listesi ****
        1-
        2-
        3-


        3-ders arama
        ders adı....: mat gibi

        0-cıkıs

         */
        int secim;
        Scanner input = new Scanner(System.in);
        int adet=0;
        String[] dersler=null;
        do {
        System.out.println("""
         *******************************
         *       OKUL OTOMASYON        *
         *******************************  
         *     1- DERS EKLEME          *
         *     2- DERS LİSTESİ         *
         *     3- DERS ARAMA           *     
         *     0- ÇIKIŞ                *
         *******************************       
          """);


            System.out.println("lutfen seciniz:..");
        secim = input.nextInt();


switch (secim) {
    case 1:
        // ders adedi belirleme

        System.out.println("Kac adet ders eklemek istersiniz:  ");
        adet = input.nextInt();
        dersler = new String[adet];

        System.out.println();

        // ders ekleme
     input=new Scanner(System.in);
        for (int i = 0; i < adet; i++) {
            System.out.println("lütfen eklemek istediğiniz " + (i + 1) + "." + " dersi giriniz");
            dersler[i] = input.nextLine();
        }
        break;


    // ders listesi gösterme
    case 2:
        for (int i = 0; i < adet; i++) {
            System.out.println((i + 1) + "." + " ders " + dersler[i]);
        }
        break;
    // ders arama

    case 3:
        System.out.println("lutfen aradıgınız dersi giriniz: ");
        input=new Scanner(System.in);
        String aranilan = input.nextLine();
        for (int i = 0; i < adet; i++) {
            if (dersler[i].equals(aranilan)) {
                System.out.println((i + 1) + "." + " ders " + dersler[i]);
            } else if (adet == 0) {
                System.out.println("önce ders giriniz");
            }else {
                System.out.println();
            }
            if(!(dersler[i].equals(aranilan))) {
                System.out.println("aradıgınız ders bulunmamaktadır");
            }
        }
        break;
        case 0:
            System.out.println("uygulamadan cıktınız");
            break;
            default:
                System.out.println("gecerli bir secim yapınız");

}

}while(secim!=0);

    }//END OF MAIN METHOD
}//END OF CLASS
