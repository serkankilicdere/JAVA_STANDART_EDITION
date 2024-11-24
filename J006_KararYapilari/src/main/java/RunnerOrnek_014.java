package com.serkan;

/*
asagıdaki sekli cızen kodu yaz

bir sayi gir 4

   1
  2 2
 3 3 3
4 4 4 4

 */
import java.util.Scanner;

public class RunnerOrnek_014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan n değerini al
        System.out.print("Bir n değeri girin: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Üçgenin sol tarafında boşluk bırak
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Rakamları sırayla yazdır
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
