package yeniHoca.methodlar;

public class AccountTest {
    public static void main(String[] args) {
//        Accaunt accaunt1 = new Accaunt();

        Accaunt accaunt2 = new Accaunt("123456123", 1000.0, "Enis Dogan", "abcde@gmail.com", "1234");

//        accaunt1.setHesapNo("123456789");

        accaunt2.paraYatir(500);

        accaunt2.paraCekme(2500);

    }
}
