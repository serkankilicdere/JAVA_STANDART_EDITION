package com.serkan;
import java.util.Scanner;

public class RunnerOrnek_017 {
    public static void main(String[] args) {

        /*

         . . . . .
         . . . . .
         . . * . .
         . . . . .
         . . . . .

yıldızı sağa sola hareket ettiriniz


         */



                Scanner scanner = new Scanner(System.in);

                // Yıldızın başlangıç pozisyonu (1'den başlıyor)
                int starX = 3;  // X pozisyonu (1'den başlayacağı için)
                int starY = 3;  // Y pozisyonu (1'den başlayacağı için)

                while (true) {
                    // 5x5 kareyi ekrana çizme
                    for (int y = 1; y <= 5; y++) {
                        for (int x = 1; x <= 5; x++) {
                            if (x == starX && y == starY) {
                                System.out.print("* ");
                            } else {
                                System.out.print(". ");
                            }
                        }
                        System.out.println();
                    }

                    // Kullanıcıdan hareket komutu alma
                    System.out.print("Hareket için w/a/s/d girin: ");
                    String input = scanner.next();  // Kullanıcıdan input alıyoruz

                    // Yıldızın hareketini switch-case ile belirle
                    switch (input) {
                        case "w":  // Yukarı hareket
                            starY--;
                            break;
                        case "s":  // Aşağı hareket
                            starY++;
                            break;
                        case "a":  // Sola hareket
                            starX--;
                            break;
                        case "d":  // Sağa hareket
                            starX++;
                            break;
                        default:
                            System.out.println("Geçersiz giriş. Lütfen w, a, s, d girin.");
                    }

                    // Döngüsel hareket: sınırları geçerse öbür tarafa sarar
                    if (starX < 1) {
                        starX = 5;  // sola taşarsa sağdan başlar
                    } else if (starX > 5) {
                        starX = 1;  // sağa taşarsa soldan başlar
                    }

                    if (starY < 1) {
                        starY = 5;  // yukarı taşarsa aşağıdan başlar
                    } else if (starY > 5) {
                        starY = 1;  // aşağı taşarsa yukarıdan başlar
                    }

                    // Boş satırlar ekleyerek önceki çıktıyı aşağı kaydır
                    for (int i = 0; i < 10; i++) {
                        System.out.println();
                    }
                }

                /*
                Açıklama:
Koordinatlar (1'den Başlayan): starX = 3 ve starY = 3 başlangıç konumu olarak kullanılır, çünkü karede ortadan başlatıyoruz ve pozisyonları 1 ile 5 arasında hareket ettiriyoruz.

Kare çizimi: for döngüsü ile kareyi 1'den 5'e kadar sayılarla çizeriz. Eğer x == starX ve y == starY ise o noktaya * basılır, aksi halde . basılır.

Kullanıcı Girdisi: Kullanıcıdan next() ile string olarak giriş alıyoruz. Bu giriş switch-case yapısı ile kontrol edilir (w, a, s, d).

Döngüsel Hareket: Sınırları aştığında (örneğin, x < 1 veya x > 5) yıldız karşı taraftan tekrar görünür. Bu sayede yıldız sınırsız bir şekilde kare içinde dolaşır:

Eğer starX 1'den küçükse (starX < 1), starX 5 olarak ayarlanır (yani sol taraftan sağa geçer).
Eğer starX 5'ten büyükse (starX > 5), starX 1 olarak ayarlanır (yani sağ taraftan sola geçer).
Aynı mantık starY için yukarı/aşağı hareketlerde de geçerlidir.
Ekranı Temizleme: Önceki çizimi kaydırmak için boş satırlar eklenerek bir nevi ekran "temizliği" yapılır, böylece her adımda yeni bir kare gösterilir.

Bu kod, yıldızın sınırsız bir şekilde 5x5 kare içinde hareket etmesini sağlar ve kullanıcı girdilerine göre hareket yönünü switch-case ile kontrol eder.







                 */






    }// END OF MAİN METHOD

}//END OF CLASS
