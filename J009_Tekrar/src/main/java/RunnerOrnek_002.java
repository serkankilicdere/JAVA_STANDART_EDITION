import java.util.Scanner;

public class RunnerOrnek_002 {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir cümle alacagız ve icinde tekrar eden
        kelimeleri bulup listele eger yok ise bunu belirten sonuc gir
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen metni yazınız: ");
        String metin = input.nextLine();

        String[] kelimeler = metin.split(" ");
        boolean tekrarVarmi=false;

        // müdür müdür müdür ile serkan serkan

        for(int i=0; i<kelimeler.length; i++) {
            int sayac=0;
            for(int j=i+1; j<kelimeler.length; j++) {
                if(kelimeler[i].equals(kelimeler[j])){

                    tekrarVarmi=true;
                    sayac++;
                }
            }
            if(sayac>0) System.out.println(sayac+" kere "+kelimeler[i]+" tekrar etmektedir");

        }

       if(!tekrarVarmi) System.out.println("tekrar yoktur"); // todo; burayı anlamadım ve cözemedim

    }//END OF MAIN METHOD
}//END OF CLASS
