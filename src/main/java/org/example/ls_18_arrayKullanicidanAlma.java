package org.example;

import java.util.Scanner;

public class ls_18_arrayKullanicidanAlma {
    public static void main(String[] args) {
        //dizinin elemanlarini kullanicidan alma

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizin kac elemanli olsun :");
        int diziUzunluk = scanner.nextInt();
        scanner.nextLine();

        String [] isimler = new String[diziUzunluk];

        for (int i = 0; i < isimler.length; i++){

            System.out.println("Dizinin " + (i) +". index degerini giriniz : ");
            isimler[i] = scanner.nextLine();
        }

        for (int i = 0; i < isimler.length; i++){
            System.out.println(isimler[i]);
        }
    }
}
