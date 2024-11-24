package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_006 {
    public static void main(String[] args) {
        /*
        kullanıcının  bir sayı alarak (5 ile 10 arasi ) asagıdakı gorsel elde edecek
        bir kodlama yazınız

        1
        12
        123
        1234
        12345
        123456
         */


        int girilenSayi;

        Scanner inp = new Scanner(System.in);
        System.out.println("Girilen sayi giriniz: ");

        girilenSayi = inp.nextInt();

        for(int i=1; i<=girilenSayi; i++)
        {
            System.out.println("");

            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");

            }
        }




    }//END OF MAIN METHOD
}//END OF CLASS
