public class Main {
    public static void main(String[] args) {

        Strateji stratejYilbasi = new StratejiYilbasi();

        stratejYilbasi.kampanyaCagir(new YilbasiKampanya());
        stratejYilbasi.duzenSec(new YilbasiDuzen());
        stratejYilbasi.cagir();

    }
}