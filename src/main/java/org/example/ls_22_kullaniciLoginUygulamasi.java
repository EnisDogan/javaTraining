package org.example;

import java.util.Scanner;

public class ls_22_kullaniciLoginUygulamasi {

    static boolean aktif = true;
    static int hakSayisi = 3;

    public static void main(String[] args) {
        // kullanici uygulamaya giris yapabilsin, 3 hakki olsun
        //3 hakkini doldurduktan sonra hesabini disable yapalim, dogru giris yapabilir ise sisteme giris yapsin



        Scanner scanner = new Scanner(System.in);

        if (aktif){

            if (hakSayisi > 0){

                while (aktif){
                    System.out.println("kullanici adiniz :");
                    String username = scanner.nextLine();

                    System.out.println("Sifreniz :");
                    String password = scanner.nextLine();

                    boolean sonuc = login(username, password);
                    if (sonuc){
                        System.out.println("Uygulamaya basarili bir sekilde giris yaptiniz");
                        break;
                    }else {

                    }
                }
                if (aktif == false){
                    System.out.println("Hak sayiniz dolmustur");
                }

            }else {
                System.out.println("Hak sayiniz dolmustur, hesabiniz donduruldu");
            }

        } else {
            System.out.println("hesabiniz aktif degildir, lütfen admin ile iletisime geciniz");
        }

    }

    public static boolean login(String username, String password){
        // ebrar ----- 123
        if (username.equals("ebrar") && password.equals("123")){
            return true;
        }else {
            hakSayisi--;
            System.out.println("Kullanici adi ve sifreniz yanlis");
            if (hakSayisi==0){
                aktif = false;
            }
            return false;
        }
    }
}
