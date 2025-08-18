package yeniHoca.methodlar;

public class methodsOverload {

    public static void toplama(String a, String b){
        System.out.println(a + " " + b);
    }

    public static void toplama (int a, int b){
        System.out.println("Toplamlari = " + (a + b));
    }
    public static void toplama(int a, int b, int c){
        System.out.println("Toplamlari = " + (a + b + c));
    }

    public static void main(String[] args) {

    }

}
