package org.example;

import java.util.Scanner;

public class ls_20_arayAsalSayiBulma {
    public static void main(String[] args) {

        System.out.println("ASAL SAYI BULMA UYGULAMASINA HOS GELDINIZ");
        System.out.println("***********************************************************");

        int asalToplam = 0;
        int asalOlmayanToplam = 0;

        boolean asalMi = false;

        String asalSayilar = "";
        String asalOlmayanSayilar = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin eleman sayisini giriniz");
        int diziUzunluk = scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int [diziUzunluk];

        for(int i = 0; i < sayilar.length; i++){

            System.out.println("Dizinin " + i + "index degerini giriniz ; ");
            sayilar[i] = scanner.nextInt();
            scanner.nextLine();

        }

        for (int sayi : sayilar) {
            for (int j = 2; j < sayi; j++){
                if (sayi % j == 0){
                    asalOlmayanToplam += 1;
                    asalOlmayanSayilar += String.valueOf(sayi) + " ";
                    break;
                } else {
                    asalMi = true;
                }
            }
            if (asalMi){
                asalToplam += 1;
                asalSayilar += String.valueOf(sayi + " ");
                asalMi = false;
            }

        }
        System.out.println("ASAL BILGILERI");
        System.out.println("ASAL TOPLAM = " + asalToplam + "ASAL SAYILAR = " + asalSayilar);
        System.out.println("******************************************************************************");

        System.out.println("ASAL OLMAYAN BILGILERI");
        System.out.println("ASAL OLMAYAN TOPLAM = " + asalOlmayanToplam + "ASAL OLMAYAN SAYILAR = " + asalOlmayanSayilar);

    }
}
