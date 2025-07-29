package org.example;

import java.util.Scanner;

public class ls_12_atmUygulamasi {
    public static void main(String[] args) {

        /*
        iban 1: IBAN TR1234 567 890 123 456 7890 23 45
        bilalin kullanici adi ve sifrresi: bilal12 --- 123

        iban 2: Iban TR1234 0987 765 654 543 1234 74 64
        silanin kullanici adi ve sifresi: sila12 321

        bakiye icin --> 1
        para cekmek icin --> 2
        farkli hesaba para yatirmak icin --> 3
        uygulamadan cikmak icin --> q tusuna basiniz
         */

        String islemSecenekleri = "Bakiye Görüntüleme --> 1"
                + "Para cekmek --> 2"
                + "Farkli hesaba para yatirmak --> 3"
                + "Cikis icin q'tusuna basiniz";

        Scanner scanner = new Scanner(System.in);

        double bilalBakiye = 2450;
        String bilalIBAN = "TR1234 567 890 123 456 7890 23 45";
        String bilalKullanici = "bilal12";
        String bilalSifre = "123";

        double silaBakiye = 1200;
        String silaIBAN = "TR1234 0987 765 654 543 1234 74 64";
        String silaKullanici = "sila12";
        String silaSifre = "321";

        System.out.println("ATM'ye HOSGELDINIZ.");
        System.out.println("Lütfen Bilgilerinizi giriniz");

        System.out.println("Kullanici Adi :");
        String kullaniciAdi = scanner.nextLine();

        System.out.println("Sifre :");
        String sifre = scanner.nextLine();

        if(kullaniciAdi.equals("bilal12") && sifre.equals("123")){

            System.out.println("Bilal Hisabina giris yapildi");
            System.out.println(islemSecenekleri);

            System.out.printf("Lütfen bir islem seciniz!");
            String secim = scanner.nextLine();

            switch (secim){
                case "1":
                    System.out.println("Bakiyeniz :" + bilalBakiye);
                    break;

                case "2":
                    System.out.println("Cekmek istediginiz tutati giriniz :");
                    int cekilecekTutar = scanner.nextInt();
                    if(bilalBakiye >= cekilecekTutar){

                        bilalBakiye -= cekilecekTutar;

                        System.out.println("Para hesabinizden cekildi");
                        System.out.println("kalan Bakiye : " + bilalBakiye);
                    }

                    else {

                        System.out.println("Bakiyenizden fazla para ckemezsiniz...");

                    }
                    break;

                case "3":
                    System.out.println("ne kadar yatirmak istiyorsunuz :");
                    int yatirilacakTutar = scanner.nextInt();
                    if(yatirilacakTutar <= bilalBakiye){
                        System.out.println("Iban Giriniz :");
                        scanner.nextLine();
                        String yatirilacakIBAN = scanner.nextLine();
                        if(yatirilacakIBAN.equals(silaIBAN)){
                            System.out.println("para silqa adli kisiye yatiriliyor...");
                            bilalBakiye -= yatirilacakTutar;
                            silaBakiye += yatirilacakTutar;

                            System.out.println("Bakiyeniz : " + bilalBakiye);
                            System.out.println("Silanin Bakiye : " + silaBakiye);

                        }
                    }
                    break;

            }

        }
        else if (kullaniciAdi.equals("sila12") && sifre.equals("321")){

            System.out.println("Sila hesabina giris yapildi");
            System.out.println(islemSecenekleri);

        }
        else {

            System.out.println("Kullanici adiniz veya Sifreniz yanlis!!");

        }


    }
}
