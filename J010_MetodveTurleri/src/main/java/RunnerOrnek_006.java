public class RunnerOrnek_006 {
    public static void main(String[] args) {
        /*
        3 sayi değeri alan ve sayılardan en büyük 2 tanesinin farkının en küçük
        sayıdan büyük olup olmadığını dönen methodu yazınız
         */
        ucSayi(5,7,9);
    }//END OF MAIN METHOD

    public static boolean ucSayi(int sayi1, int sayi2, int sayi3) {
        int enb1, enb2, enk;

        // İlk en büyük sayıyı bulalım ve ona göre diğer en büyük ve en küçük sayıyı belirleyelim
        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            enb1 = sayi1;
            enb2 = (sayi2 >= sayi3) ? sayi2 : sayi3;
            enk = (sayi2 <= sayi3) ? sayi2 : sayi3;
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            enb1 = sayi2;
            enb2 = (sayi1 >= sayi3) ? sayi1 : sayi3;
            enk = (sayi1 <= sayi3) ? sayi1 : sayi3;
        } else {
            enb1 = sayi3;
            enb2 = (sayi1 >= sayi2) ? sayi1 : sayi2;
            enk = (sayi1 <= sayi2) ? sayi1 : sayi2;
        }

        System.out.println("En büyük iki sayı: " + enb1 + " ve " + enb2);
        System.out.println("En küçük sayı: " + enk);

        int fark=enb1-enb2;

                return fark>enk;
    }

}//END OF CLASS
