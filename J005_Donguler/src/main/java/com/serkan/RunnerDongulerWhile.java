package com.serkan;

import java.util.Scanner;

public class RunnerDongulerWhile {
    /*
    while(condition){} burada condition dogru oldugu surece dongu devam eder.

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim=1;
       /* while(secim==1 || secim==2 || secim==3 || secim==4 || secim==5){ //1,2,3,4,5 ten birisini secmesi donguyu devam ettirir
            System.out.println( """
            ****************************
            **********ISLEMLER**********
            ****************************
            1-TOPLAMA
            2-CIKARMA
            3-CARPMA
            4-BOLME
            5-MOD
            6-UST ALMA
            7-KAREKOK
            8-LOGARITMA
            0-CIKIS
            """);

            System.out.println("lutfen seciniz....: ");
            secim = input.nextInt();
          */

        while(secim!=0){ //1,2,3,4,5... ten birisini secmesi donguyu devam ettirir o donguyu sonlandırır
            System.out.println( """
            ****************************
            **********ISLEMLER**********
            ****************************
            1-TOPLAMA
            2-CIKARMA
            3-CARPMA
            4-BOLME
            5-MOD
            6-UST ALMA
            7-KAREKOK
            8-LOGARITMA
            0-CIKIS
            """);
            System.out.println("lutfen seciniz....: ");
            secim = input.nextInt();

        }



    }// END OF MAIN METHOD
}//END OF CLASS
