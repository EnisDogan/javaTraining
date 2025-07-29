package org.example;

import java.sql.SQLOutput;

public class ls_03_shortVeriTipi {
    public static void main(String[] args) {

        // -32768 ile 32767 arasi degerler alir. 2 byte boyutundadir
        short sayi = 15000;
        System.out.println(sayi);

        // 9 basamaga kadar cikabien sayilari belirtir. 4 byte boyutundadir
        int sayi1 = 123456789;
        System.out.println(sayi1);

        // cok buyuk basamakli sayilari belirtmek icin kullanilir. 8 byte
        /*
        long maxDeger = Long.MAX_VALUE;
        long minDeger = Long.MIN_VALUE;

        System.out.println(maxDeger);

        //long deger tipi ni manuel yazmak gerekir

        long a = 12345678909876543L;
        System.out.println(a);
        */

        //float ondalikli sayi tanimlar. double floatdan daha büyük(17 basamak)

        float ondalik_sayi = 2.7f;
        double ondaliksayi2 = 1.1234567;
        System.out.println(ondaliksayi2);

        //boolean ya evet dir yada hayir
        //true, evet, basarili
        //false, hayir, basarisiz

        boolean sonuc = 5 > 2;
        System.out.println(sonuc);

        //char karakter tanimlamada kullanilir, tek tirnak ('') ile kullanilir

        char karakter = '?';
        System.out.println(karakter);

        //string metinsel ifadeler icin kullaniir. cift tirnak icinde yazilir ("")
        String metin = "abcdefghjklmnoprstuvyz " + "helleluyah";
        System.out.println(metin);
    }
}
