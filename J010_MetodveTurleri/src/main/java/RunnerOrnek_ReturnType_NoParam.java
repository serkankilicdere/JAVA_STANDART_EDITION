import java.util.Scanner;

public class RunnerOrnek_ReturnType_NoParam {
    public static void main(String[] args) {

        int sayi1,sayi2,toplam;

       sayi1= kullanicidanBirSayiAl();
               sayi2= kullanicidanBirSayiAl();
                       toplam= sayi1+sayi2;
        System.out.println(toplam);

    }// END OF MAIN METHOD

    public static int kullanicidanBirSayiAl(){
        System.out.println("bir sayi giriniz:  ");
        int sayi1= new Scanner(System.in).nextInt();
        /*
        return metodun  returnType ne ise ona uygun bir değeri döner
        return ifadesi bu metodun sonlandığını ifade eder
        return[] ; ifadesinden sonra kodlama yapılmaz çünkü method sonlanmıştır
         */
        return sayi1;
    }

}//END OF CLASS
