public class LabAsistani extends Asistan{
    public LabAsistani(String adSoyadi, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyadi, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyadi()+" Labaratuvara giriş yapıyor.");
    }

    public void derseGir(){
        System.out.println(this.getAdSoyadi()+" derse giriyor.");
    }
}
