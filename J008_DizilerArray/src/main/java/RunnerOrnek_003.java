public class RunnerOrnek_003 {
    public static void main(String[] args) {
        /*
        int[] sayilar={5,9,12,0,3}; --> değerlerini girdiğiniz diziyi oluşturur . bir yazım metodudur

         */

        int[] sayilar={5,9,12,0,3,98};


        // dizi içerisindeki değerleri bulalım

        int toplam=0;

        for(int i=0; i<sayilar.length;i++){

            toplam += sayilar[i];

        }
        System.out.println(toplam);

    }// end method
}// end class
