package com.serkan;

public class KararYapilariIf {

    public static void main(String[] args) {
        /*
        if(true/false){
        }
        -------------------
        if(true/false){true is
        }
        else{false ise
        }
        -------------------
        if(true/false){
        }
        else if(true/false){
        }
        else{
        }
        ----------------------------------

        DİKKAT!!!! ===> KOSUL İLK SAGLANIGI ANDA KOD ISLETIMI IF BLOGUNDAN CIKAR

         */
        int ort = 67;
        //ogrencilerin gecme notu 50 olsun
        if (ort > 50) {
            System.out.println("gecti");
        } else {
            System.out.println("kaldı");
        }
        System.out.println("program sonlandı");


    }// END OF MAIN METHOD
}//END OF CLASS