package InharitenceTest;

public class Yonetici1 extends Calisan1 {
    private int sorumlu_kisi;
    public Yonetici1(String isim, int maas, String departman, int sorumlu_kisi){
        super(isim, maas, departman);

        this.sorumlu_kisi = sorumlu_kisi;
    }
    public void zam_yap(int zam_miktari){
        System.out.println("Calisanlara " + zam_miktari + " TL zam yapildi");
    }
    public void bilgilerigoster(){
        System.out.println("isim :" + getIsim());
        System.out.println("maas :" + getMaas());
        System.out.println("Departman : " + getDepartman());

        System.out.println("Sorumlu kisi sayisi : " + this.sorumlu_kisi);
    }
}
