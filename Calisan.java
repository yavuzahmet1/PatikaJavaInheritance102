public class Calisan {
    private String adSoyadi;
    private String telefon;
    private String eposta;

    public Calisan(String adSoyadi, String telefon, String eposta) {
        this.adSoyadi = adSoyadi;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getAdSoyadi() {
        return adSoyadi;
    }

    public void setAdSoyadi(String adSoyadi) {
        this.adSoyadi = adSoyadi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris() {
        System.out.println(this.adSoyadi + " üniversiyete giriş yaptı! ");
    }

    public void cıkıs() {
        System.out.println(this.adSoyadi + " üniversiteden çıkış yaptı!");
    }

    public void yemekhane() {
        System.out.println(this.adSoyadi + " yemekhaneye girdi!");
    }
}
