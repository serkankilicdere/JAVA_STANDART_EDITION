package com.serkan;

public class RunnerOrnek_004 {

    public static void main(String[] args) {
        /*
        1 ile 100 arasındaki 5 ve ya 8'e bolunen sayıları bulunuz
         */

        for (int i = 1; i <=100 ; i++) {

            if(i%5==0){
                System.out.println(i+ " 5 ebolunur");
                {
                    if(i%8==0){
                        System.out.println(i+ " 8 ebolunur");
                    }
        }

        System.out.println("---------------------------------------");
/*
                for (int j = 1; j <=100 ; j++) {
                    if(j%5==0 || j%8==0){
                        System.out.println(j+ " 5e veya 8e bolunur");
                    }

                }
*/





/*      Asagıdakı ornekte else if kullanıldıgı ıcın hem 5e hem 8e bolunen sayılarda else blogu calıstırılmadı ve 8e
        8e bolundugu yazmadı 40 veya 80 de ki gibi


        for(int i=1; i<=100; i++){

            if (i%5==0){
                System.out.println(i + " 5e bolunur");
            }else if (i%8==0){
                System.out.println(i + " 8e bolunur");

 */
            }
        }

    }//END OF MAIN METHOD

}//END OF CLASS
