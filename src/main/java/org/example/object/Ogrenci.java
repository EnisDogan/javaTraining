package org.example.object;

import java.sql.SQLOutput;

public class Ogrenci {

    private Long id;
    private String ad;
    private String soyad;
    public String numara;

    public static void numaraYazdir(){
//        System.out.println("Numara :" + numara);
    }

    public void ogrenciBilgileri(){

        System.out.println("ID : " + getId());
        System.out.println("AD : " + getAd());
        System.out.println("SOYAD : " + getSoyad());
        numaraYazdir();

    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
