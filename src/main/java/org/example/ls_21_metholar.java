package org.example;

public class ls_21_metholar {
    public static void main(String[] args) {
        // parametresiz ve geroye deger döndürmeyen metot tanimlama
        isimYazdir();
        topla (17, 5);
    }

    public static void isimYazdir(){
        System.out.println("Isim");
    }

    public static void topla(int sayi1, int sayi2){
        int sonuc = sayi1 + sayi2;
        System.out.println("Sonuc " + sonuc);
    }

}
