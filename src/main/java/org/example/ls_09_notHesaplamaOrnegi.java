package org.example;

import java.util.Scanner;

public class ls_09_notHesaplamaOrnegi {
    public static void main(String[] args) {

        //vize1 %30 ---- vize2 %30 ---- final %40
        //gecme notu 60

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adinizi Giriniz :");
        String isim = scanner.nextLine();

        System.out.println("Soyisminizi Giriniz :");
        String soyisim = scanner.nextLine();

        System.out.println("Dersi Giriniz :");
        String dersIsmi = scanner.nextLine();

        System.out.println("1. Vize Nounuzu Giriniz :");
        double vize1 = scanner.nextDouble();

        System.out.println("2. Vize Nounuzu Giriniz :");
        double vize2 = scanner.nextDouble();

        System.out.println("Final Notnu Giriniz :");
        double finalNot = scanner.nextDouble();

        double sonuc = (vize1 * 0.3) + (vize2 * 0.3) + (finalNot * 0.4);

        if(sonuc >= 60){
            System.out.println(isim + " " + soyisim + " adli ögrenci " + dersIsmi + " dersinden " + sonuc + " ortalama ile gecmistir.");
        }
        else{
            System.out.println("Dersten kaldiniz :/");
        }



    }
}
