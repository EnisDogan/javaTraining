package org.example;

public class ls_10_kuruyemisOrnegi {
    public static void main(String[] args) {

        /*
        bir kuruyemisci toptancidan;
        12 kilo leblebi, kilosu 3,5 tl den,
        25 kilo findik, kilosu 15,7 tl den
        40 kilo badem, kilosu 22 tl den almistir

        bu ürünleri satarken,
        --> leblebinin kilosunu %50 fazlasina,
        --> finfigin kilosunu %40 fazlasina,
        --> bademin ise kilosunu %60 fazlasina satmistir

        kuruyermisci o gun kazandigi para ile dükkanin kirasini odemek istemektedir.

        kira tutari: 500 tl

        kazandigi pa<ra 500 tl den yuksek ise kirayi ödeyebilsin, degilse odeyemesin...

         */
        //fiyatlar
        double leblebi = 3.5;
        double findik = 15.7;
        double badem = 22;

        double maliyeTutar =(leblebi * 12) + (findik * 25) + (badem * 40);

        double satisTutar = ((leblebi * 1.5) * 12) + ((findik * 1.4) * 25) +((badem * 1.6) * 40);

        double karTutar = satisTutar - maliyeTutar;

        if(karTutar > 500){
            System.out.println("Kirayi Ödeyebilirsiniz (:");
        }
        else {
            System.out.println("Kirayi odemek icin yeteri kadar paraniz yok ):");
        }

    }
}
