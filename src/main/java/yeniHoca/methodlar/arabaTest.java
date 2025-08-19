package yeniHoca.methodlar;

public class arabaTest {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.renk = "Kirmizi";
        araba1.kapilar = 4;
        araba1.tekerler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println(araba1.motor);

    }
}
