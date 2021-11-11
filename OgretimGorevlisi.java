public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;
    public OgretimGorevlisi(String adSoyadi, String telefon, String eposta, String bolum, String unvan,String kapiNo) {
        super(adSoyadi, telefon, eposta, bolum, unvan);
        this.kapiNo=kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void senatoToplanti(){
        System.out.println(this.getAdSoyadi()+" toplantıya katılacak");
    }

    public void sinavYap(){
        System.out.println(this.getAdSoyadi()+" sınavları yapıyor");
    }
}
