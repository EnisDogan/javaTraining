package yeniHoca.methodlar;

public class parametreliMetodlar {
    public static void toplama(int a, int b, int c){
        System.out.println("Genel Toplam = " + (a + b + c));
    }
    public static void selamlama(String isim){
        System.out.println("Selamlar... " + isim);
    }

    public static void main(String[] args) {
        // selamlama("Enis");
        toplama(1, 3, 5);
    }
}
