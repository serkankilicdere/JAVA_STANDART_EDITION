import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Locale;
import java.util.Scanner;
import java.net.URL;


public class RunnerOrnek_004 {
    public static void main(String[] args) throws IOException {
/*
1-koç
2-boğa
3-ikizler
4-yengeç
5-aslan
6-başak
7-terazi
8-akrep
9-yay
10-oğlak
11-kova
12-balık
 */

        System.out.println("""
                
                *******************************
                ***      burç yorumu        ***
                *******************************
                
                
                """);


        System.out.println("Burcunuz nedir?..: ");
        int secim = new Scanner(System.in).nextInt();

        String burc = switch (secim) {
            case 1 -> "koc";
            case 2 -> "boga";
            case 3 -> "ikizler";
            default -> "";
        };
//        switch (secim){
//            case 1: burc="koc"; break;
//            case 2: burc="boga"; break;
//            case 3: burc="ikizler"; break;
//        }




    URL url = new URL("https://www.elle.com.tr/astroloji/" + burc.toLowerCase());

    Scanner scannerWebSite = new Scanner(url.openStream(), "UTF-8");

        while(scannerWebSite.hasNext())

    {
        //  System.out.println(scannerWebSite.nextLine());
        String satir = scannerWebSite.nextLine();
        if (satir.contains("<p>") && satir.contains("</p>")) {

            satir = satir.replace("<p>", "")
                    .replace("</p>", "")
                    .replace("<br>", "");
            System.out.println(satir);
            break;
        }

    }


    }//end method
}//end class
