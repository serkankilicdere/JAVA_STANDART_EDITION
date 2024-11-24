package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_005 {
    public static void main(String[] args) {
        /*
        kullanıcıdan alınan ad bilgisi ve adının kaç defa
        yazdıralacagı bilgisi ile kod yazınız
         */
        int tekrarSayisi;
        String ad;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adinizi yazin:...");
        ad = input.nextLine();
        System.out.println("Lutfen tekrar sayisini yazin:...");
        tekrarSayisi = input.nextInt();

        for (int i = 0; i < tekrarSayisi; i++) {
            System.out.println(ad);
        }


    }//END OF MAIN METHOD
}//END OF CLASS
