public class RunnerOrnek_Varargs {
    public static void main(String[] args) {
        /*
        içine 2 adet değer taep eden ve bu değerleri
        toplayıp sonucunu geri dönen metodu yazın

        içine 50 adet sayı alan ve toplamı dönen metod yaz
         */

        int[] sayiDizisi={2,9,4,23,45,12,41,1,32};
        System.out.println(toplam(sayiDizisi));


    }//END OF MAIN METHOD

    public static int  toplam(int sayi1, int sayi2) {

        return sayi1 + sayi2;
    }

    public static int toplam(int[] sayilar){
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        return toplam;
    }

    public static int toplamVarArgs(int... sayiDizisi) {
        int toplam = 0;
        for (int i = 0; i < sayiDizisi.length; i++) {
            toplam += sayiDizisi[i];
        }
        return toplam;
    }
}// END OF CLASS
