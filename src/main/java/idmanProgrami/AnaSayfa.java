package idmanProgrami;

import java.util.Scanner;

public class AnaSayfa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idman Programina Hos Geldiniz...");

        String idmanlar = "Gecerli Hareketler... \n"
                            + "Burpee\n"
                            + "Pushup(Sinav)\n"
                            + "Situp(Mekik)\n"
                            + "Squat";

        System.out.println(idmanlar);

        System.out.println("Bir idman olusturunuz...");

        System.out.println("Burpee sayisi : ");
        int burpee =scanner.nextInt();
        System.out.println("Pushup sayisi : ");
        int pushup =scanner.nextInt();
        System.out.println("Situp sayisi : ");
        int situp =scanner.nextInt();
        System.out.println("Squat sayisi : ");
        int squat =scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("Idmaniniz basliyor......");

        while (idman.idmanBittiMi() == false){
            System.out.print("Hareket Türü(Burpee, Pushup, Situp, Squat)");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kac adet yapacaksiniz? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
        }

        System.out.println("Programiniz bitti......");

    }
}
