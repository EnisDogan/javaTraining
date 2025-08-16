package org.example;

public class ls_17_arrays {
    public static void main(String[] args) {

        //dizi olusturma -- deger atama -- yazdirma

        String [] isimDizisi = {"Ali", "Veli", "Enes", "Yakup", "Bilal", "Oguz"};
        System.out.println("Dizinin Elemanlari");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < isimDizisi.length; i++){

            System.out.println(isimDizisi[i]);

        }

        int[] sayilar = new int[6];
        sayilar[0] = 15;
        sayilar[1] = 14;
        sayilar[2] = 13;
        sayilar[3] = 12;
        sayilar[4] = 11;
        sayilar[5] = 10;

        for (int i = 0; i < sayilar.length; i++){
            System.out.println(sayilar[i]);
        }

    }
}
