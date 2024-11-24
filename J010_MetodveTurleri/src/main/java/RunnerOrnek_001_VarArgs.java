public class RunnerOrnek_001_VarArgs {
    public static void main(String[] args) {
        /*
        METOD STRİNG İFADE ALACAK VE DEVAMINDA İNT TİPİNDE
        İNDEX DEĞERLERİ ALACAK. İNR DEĞERLER İFADE İÇİNDEKİ
        İNDEXLERE KARŞILIK GELECEK VE İLGİLİ KARAKTERİ DÖNECEK
         */
String lokma=ifadeKes("poooott", 1,3);
        System.out.println(lokma);

    }//END OF MAIN METHOD

    public static String karakterAl(String ifade, int... indexList){

        String result = "";
        for (int i = 0; i < indexList.length; i++){
            int index = indexList[i];
            char bulunanKarakter=ifade.charAt(index);
                    result+=bulunanKarakter;
        }
        return result;
    }

    /*
    bir string ifade al, int tipinde startIndex ve endIndex seklinde
    2 değişken alacak bu metod ifadeyi kes metodu olucak
    başlangıç değeri bitişten büyük olduğunda uyarı ver boş dön
    başlangıç yada bitiş ifadenin sınırlarını aştığında uyarı ver boş dön
     */

    public static String ifadeKes(String ifade,int startIndex , int endIndex) {
        String result = "";
        if (startIndex < endIndex && startIndex >= 0 && endIndex < ifade.length()) {

      result =ifade.subSequence(startIndex, endIndex).toString();//substring kullanılabilir

        }else  {
            System.out.println("gecerli deger girin");
            return null;
        }
        return result;
    }


}//END OF CLASS
