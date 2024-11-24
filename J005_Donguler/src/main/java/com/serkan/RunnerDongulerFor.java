package com.serkan;

public class RunnerDongulerFor {
    /*
    LOOP ;

    For loop
    syntax ==>   for(1.alan tanım; 2. alan koşul;3.alan değiştirme) {
    tekrara girecek kod for döngüsünün içine yazılır
    }
    for döngüsünün devam edebilmesi için 2. alan da bulunan koşulun geçerliliğini
    koruyo olması gerekmektedir. geçerliliğini koruduğu sürece döngü(loop) devam eder

     */

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println("Serkan Kilicdere");
        }

/*
 DIKKAT !!!
bir for dongusunun govdesi her zaman {} ler ile belirtilmek zorunda degildir yani {}
olmadanda for dongusu tek satır bir kodu kendi govdesinde isletebilir burada dikkat etmeniz gereken husus
 for dongusu ile ; arasında kalan alanın for'un gövdesi olarak kabul edilmektedir [ FOR'DAN sonraki ilk satır ]
*/
        for (int i = 0; i < 10; i++)
            System.out.println("Serkan Kilicdere"); // 10 kez yazar for'a dahil olan satır [ilk noktali virgül]
        System.out.println("Serkan Kilicdere");// 1 kez yazar for'a dahil degil

/*
for dongusunu bazen sonsuz yapmak isteyebiliriz asagıda gordugunuz gibi
 */
/*  for(;;){

      System.out.println("Serkan Kilicdere");
}
*/
 int dongu=0;  //===> efektif bir kullanım degil
 for (; dongu < 6;) {                          // baska bir kullanım türü, artırım kod blogu icinde yapılıyor
     System.out.println("Serkan Kilicdere");
     dongu++;
 }



    }//END OF MAIN METHOD
}// END OF CLASS