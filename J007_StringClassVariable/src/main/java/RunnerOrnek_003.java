import java.util.Scanner;

public class RunnerOrnek_003 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan adını yaşını ve cinsiyetini alın eğer kullanıcının
        2 adı var ise veya yaşı 50+ ise veya kadın ise uygulamadan 100 tl ödül kazanacaktır
        bunu yapan kodu yazın
         */

        String ad;
        int yas;
        String cins;



        Scanner input = new Scanner(System.in);
        System.out.print("Enter ad: ");
        ad = input.nextLine();
        System.out.print("Enter yas: ");
        yas = input.nextInt();
        input.nextLine();
        System.out.print("Enter cins: ");
        cins=input.nextLine();


        if(ad.contains(" ")|| yas>50 || cins.equals("kadın")){
            System.out.println("100 tl kazandınız");
        }else{
            System.out.println("kazanamadınız");
        }





    }//END METHOD
}//END CLASS
