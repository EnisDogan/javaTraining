package uygulama;

public class Hesap {

    // Static değişken (tüm nesneler tarafından paylaşılır)
    public static int staticVar = 0;

    // Instance değişken (her nesne kendi kopyasına sahip)
    public int instanceVar = 0;

    public static void topla(){
        System.out.println("toplama : " + (3 + 5));
    }

    public static int cikartma(int a, int b){
        return a - b;
    }

    public static int carpma(){
        return 4 * 6;
    }

    public int bolme(int a, int b){
        return a / b;
    }

    public static void aNewStatic(){
        staticVar += 15; // static değişkeni 5 artır
    }

    public void aNewInstance(){
        instanceVar += 5; // instance değişkeni 5 artır
    }
}
