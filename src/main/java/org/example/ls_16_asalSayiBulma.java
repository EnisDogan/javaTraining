package org.example;

import java.util.Scanner;

public class ls_16_asalSayiBulma {
    public static void main(String[] args) {
        //asal sayi bulam ornegi
        //kendine ve sadece kendine bölünebilen sayilar asal sayilardir, ornegin 1, 2, 3, 5, 7, 11, 13 ....

        Scanner scanner = new Scanner(System.in);
        boolean asalMi = false;

        System.out.println("*************ASAL SAYI BULMA UYGULAMASI*************");
        System.out.println("Lütfen bir sayi giriniz");

        int sayi = scanner.nextInt();

        for (int i = 2; i < sayi; i++){

            if (sayi % i == 0){

                asalMi = false;
                break;

            }
            else {
                asalMi = true;
            }

        }
        if (asalMi){
            System.out.println("Girdiginiz " + sayi + " sayisi asaldir");
        }
        else {
            System.out.println("Girdiginiz " + sayi + " sayisi asal degildir");
        }

    }
}
