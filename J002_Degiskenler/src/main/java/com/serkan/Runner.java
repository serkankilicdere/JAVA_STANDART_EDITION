package com.serkan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {

    /**
     * class içerisinde;
     * 1. değişken
     * 2. metod
     * 3. inner class
     * tanımlanabilir. ancak temel kodlamalar class gövdesi içerisinde yapılamaz
     * bunlar metodların gövdelerinde yazılır (temel kodlamalar if ve for kullanımı gibi...)
     */

    public static void main(String[] args) {
        // 1. out kodlaması

        System.out.println("Hello World"); //metinde tırnaklı
        System.out.println(987); //sayısal değerlerde tırnaksız
        // print ve println farkı; yazını tam satıra yaz ve alt satıra geç demektir println
        // print ise kapladığı yerkadar satırda yazar
        System.out.print("merhaba bugün hava güzel  ");
        System.out.print("yine java yazıyoruz  ");
        System.out.print("algoritmalar devam edicek  ");
        System.out.println();
        System.out.println("-------------------------------------------------------");

        // 2. kullanıcıda bilgi almak ; INPUT
        Scanner scanner = new Scanner(System.in); // tanımlama yapılması;  Scanner sınıfını import eder
                                                   // Scanner mantığı yapılan girişi/input taramak ile ilgilidir

        System.out.println("lütfen bir sayi giriniz ; "); // kullanıcıya ekranda soru yöneltilir
        scanner.nextInt(); // input girilcek durumu yaratır ve input girilip enter tuşuna basılana kadar çalışır






} }
