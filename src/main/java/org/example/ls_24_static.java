package org.example;

import org.example.object.Ogrenci;

public class ls_24_static {
    public static void main(String[] args) {

        //Ogrenci ogrenci = new Ogrenci();
        //ogrenci.numara = "123456789";

//        Ogrenci.numara = "123456789";
//
//        System.out.println("Numaraniz : " +  Ogrenci.numara);
//        Ogrenci.numara = "1234567889";
//       Ogrenci.numaraYazdir();
//
//        Ogrenci ogrenci = new Ogrenci();
//        ogrenci.ogrenciBilgileri();

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setId(5L);
        ogrenci1.setAd("Sky");
        ogrenci1.setSoyad("Walker");
        ogrenci1.numara = "11111111111";
        System.out.println(ogrenci1.numara);
        System.out.println(ogrenci1.getAd());
        System.out.println("-------------------------------");

        Ogrenci ogrenci2 = new Ogrenci();
        System.out.println(ogrenci2.numara);
        System.out.println(ogrenci2.getAd());




    }
}
