package com.serkan;

import java.util.Scanner;

public class RunnerOrnek_007 {
    public static void main(String[] args) {
       /*
       Pozitif bir sayi giriniz 3
       ***
       ***
       ***
       seklinde cıktı al

        */

        int input;

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz..: ");

        input = sc.nextInt();

        for(int i = 1 ; i<=input; i++) {

            for (int j = 1; j <= input; j++) {

                System.out.print("X ");

            }
            System.out.println("");
        }

        // tek for ile cozumu asagıdakı gibidir

        System.out.println("""
                
                ----------------------------------
                
                """);



        for(int i = 1 ; i<=input*input; i++) {
            System.out.print("* ");
                    if(i%input==0){ // i sayının katı ise veya tam bolunuyor ise demektir
                        System.out.println();
                    }
        }









    }//END OF MAIN METHOD
}//END OF CLASS
