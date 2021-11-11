public class Main {

    public static void main(String[] args) {
        Calisan c1 = new Calisan("Ahmet Kara", "234564222", "ahmet@gmail.com");
        c1.giris();

        Akademisyen a1 = new Akademisyen("Ali Maya", "05552345667", "alimaya@gmail.com", "Ziraat", "Okutman");
        a1.giris();
        a1.derseGir();
        System.out.println("****");

        Memur m1 = new Memur("Azra", "054311122233", "azra@gmail.com", "Bilgi işlem", "mesaide");
        m1.calis();

        System.out.println("****");

        OgretimGorevlisi o1=new OgretimGorevlisi("Akın Kaya","05438882345","akınk@gmail.com","Bilgi işlem","Yrd.Doc","A5");
    }
}
