package com.serkan;

public class RunnerOrnek_010 {
    public static void main(String[] args) {
        /*
        1 den 60 kadar sayıların içerisinde 4e bolunebilen sayıları cıktılayan
        for, while ve do while il
         */

        for (int i=0; i<=60;i+=4){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("--------------------------------------");


        int k=0;
        while(  k<=60){
            System.out.print(k+" ");
            k+=4;
        }
        System.out.println(" ");
        System.out.println("--------------------------------------");

        int j=0;
        do{
            System.out.print(j+" ");
            j+=4;

        }while(j<=60 );

    }//END OF MAIN METHOD
}//END OF CLASS
