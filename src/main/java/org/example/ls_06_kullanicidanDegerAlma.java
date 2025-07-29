package org.example;

import java.util.Scanner;

public class ls_06_kullanicidanDegerAlma {
    public static void main(String[] args) {

        //kullanicidan nasil deger alinir
        //scanner
        System.out.println("Adinizi giriniz.");
        Scanner scanner = new Scanner(System.in);



        String isim = scanner.nextLine();

        System.out.println("Soyisminizi giriniz.");

        String soyisim = scanner.nextLine();

        System.out.println("adiniz ve soyadiniz: " + isim + " " + soyisim);

    }
}
