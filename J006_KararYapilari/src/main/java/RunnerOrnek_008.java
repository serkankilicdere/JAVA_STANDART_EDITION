package com.serkan;

public class RunnerOrnek_008 {
    public static void main(String[] args) {
        /*
        1 İLE 100 arasındaki tek sayıların adedini bulan programı yazınız
        KENDI COZUMUNU DUZENLE
         */

        int saya = 1;

        while (saya <= 100) {
            if (saya % 2 != 0) {
                System.out.println(saya);
            }
            saya++;
        }

        System.out.println("""
                
                -------------------------------------
                
                """);

        int sayac = 0;

        // 1 ile 100 arasındaki sayıları kontrol et
        for (int i = 1; i <= 100; i++) {
            // Eğer sayı tek ise sayaç arttır
            if (i % 2 != 0) {
                sayac++;
            }
        }

        // Tek sayıların adedini ekrana yazdır
        System.out.println("1 ile 100 arasındaki tek sayıların adedi: " + sayac);


    }//END OF MAIN METHOD
}//END OF CLASS
