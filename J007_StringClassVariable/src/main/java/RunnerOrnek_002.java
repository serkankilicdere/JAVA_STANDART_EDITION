public class RunnerOrnek_002 {
    public static void main(String[] args) {
        /*
        BİR SOSYAL MEDYA PLATFORMU UYGULAMASI İÇİN
        PAYLAŞILAN YORUMLAR DÜZENLENMEK İSTENMEKDEDİR
        BU NEDENLE TEL NO PAYLAŞANLARI BULMAK VE UYARMAK
        İSTİYOR NASIL?
         */
        String yorum = "bu post çokta güzel değil bana ulaşarak daha" +
                "etkili ve güzel postlar atabilirsiniz. beni ara: 0 555 999 7744";

        String Yorum = yorum.replaceAll(" ", "");
        for (int i = 1; i <= 9; i++) {
            if (Yorum.contains("0" + i))// 01,02,03,04,05,06,07,08,09 diye olur
                System.out.println("yorumlarda tlf bilgisi veremezsiniz..: " + Yorum.substring(Yorum.indexOf("0" + i)));
        }


    }//END METHOD
}//END CLASS
