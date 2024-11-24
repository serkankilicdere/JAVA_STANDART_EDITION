package com.serkan;
/*
x...n e kadar olan sayilar icindeki asal sayilari bulan kodu yaz ( x, n kullanıcı giriyor)
 */



import java.util.Scanner;

public class RunnerOrnek_012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan x ve y değerlerini al
        System.out.print("Başlangıç değerini girin (x): ");
        int x = scanner.nextInt();

        System.out.print("Bitiş değerini girin (y): ");
        int y = scanner.nextInt();

        int sayac = 0;

        // x ve y arasındaki sayılar için
        for (int i = x; i <= y; i++) {
            boolean asal = true;

            if (i <= 1) {
                asal = false; // 1 ve 1'den küçük sayılar asal değildir
            }

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    asal = false; // i j'ye bölünüyorsa asal değildir
                }
            }

            if (asal) {
                System.out.println(i + " bir asal sayıdır.");
                sayac++;
            }
        }

        // Asal sayıların adedini yazdır
        System.out.println("Toplam " + sayac + " adet asal sayı bulundu.");
    }
}

