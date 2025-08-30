package Ornek;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calisanlar sinifina hos geldiiz.....");
        String islemler = "Islemler....\n"
                            + "1) Yazilim Islemleri\n"
                            + "2) Yönetici Islemleri\n"
                            + "cikis icin q'ya basiniz";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(islemler);
        System.out.println("****************************************************************************");

        while (true){
            System.out.print("Isleminizi seciniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor......");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Enis", "Dogan", 0001, "Phyton, c, Java");
                String yazilimci_islem = "1) format at\n"
                                            + "2) Bilgileri goster\n"
                                            + "Cikis icin q`ya basiniz";
                System.out.println(yazilimci_islem);

                while (true){
                    System.out.println("Islemi seciniz : ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Sistemden cikiliyor");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Isletim sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Gecersiz islem...");
                    }
                }
                
            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Serhat", "Say", 1112, 10);
                String yonetici_islem = "Yonetici islemler\n"
                                        + "1) Zam yap\n"
                                        + "2) Bilgileri goster\n"
                                        + "Cikis icn q'ya basiniz";
                System.out.println(yonetici_islem);

                while (true){
                    System.out.println("Islem Seciniz : ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")){
                        System.out.println("Yonetici islemlerinden cikiliyor...");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Zam Miktari : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    } else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }else {
                        System.out.println("Gecersiz islem....");
                    }
                }
            }
            else {
                System.out.println("Gecersiz islem...");
            }
        }
    }
}
