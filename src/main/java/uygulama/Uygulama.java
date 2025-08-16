package uygulama;

public class Uygulama {
    public static void main(String[] args) {

        Hesap h1 = new Hesap();
        Hesap h2 = new Hesap();

        System.out.println("Başlangıçta:");
        System.out.println("h1.staticVar = " + Hesap.staticVar + ", h1.instanceVar = " + h1.instanceVar);
        System.out.println("h2.staticVar = " + Hesap.staticVar + ", h2.instanceVar = " + h2.instanceVar);

        System.out.println("\n--- h1 üzerinde değişiklik yapıyoruz ---");
        Hesap.aNewStatic();   // static değişkeni değiştirdi
        h1.aNewInstance();    // h1’in instance değişkenini değiştirdi

        System.out.println("h1.staticVar = " + Hesap.staticVar + ", h1.instanceVar = " + h1.instanceVar);
        System.out.println("h2.staticVar = " + Hesap.staticVar + ", h2.instanceVar = " + h2.instanceVar);

        System.out.println("\n--- h2 üzerinde değişiklik yapıyoruz ---");
        Hesap.aNewStatic();   // yine static değişkeni değiştirdi
        h2.aNewInstance();    // sadece h2’nin instance değişkenini değiştirdi

        System.out.println("h1.staticVar = " + Hesap.staticVar + ", h1.instanceVar = " + h1.instanceVar);
        System.out.println("h2.staticVar = " + Hesap.staticVar + ", h2.instanceVar = " + h2.instanceVar);
    }
}

