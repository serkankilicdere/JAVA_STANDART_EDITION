package com.serkan;
/*
asagıdaki sekli cizen kodu yazin ( ıcı bos kare)

* * * * *
*       *
*       *
*       *
* * * * *




 */

import java.util.Scanner;

public class RunnerOrnek_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        // Kullanıcıdan n değerini al
        System.out.print("Kare boyutunu girin: ");
        int n = scanner.nextInt();

        // Kareyi çiz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // İlk veya son satırda ya da ilk veya son sütunda isek
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

*/
        System.out.println("""
                
                
                
                
                """);







                // Kullanıcıdan n değerini al
                System.out.print("Kare boyutunu girin: ");
                int n = scanner.nextInt();

                int i = 0;
                while (i < n) {
                    int j = 0;
                    while (j < n) {
                        // İlk veya son satırda ya da ilk veya son sütunda isek
                        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                        j++;
                    }
                    System.out.println();
                    i++;
                }





    }
}
