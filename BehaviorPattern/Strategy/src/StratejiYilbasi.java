public class StratejiYilbasi implements Strateji{

    private Duzen duzen;
    private Kampanya kampanya;

    @Override
    public void duzenSec(Duzen duzen) {
        this.duzen = duzen;
    }

    @Override
    public void kampanyaCagir(Kampanya kampanya) {
        this.kampanya = kampanya;
    }

    @Override
    public void cagir() {
        int kampanyaOrani = kampanya.kampanyaOraniBelirle();
        System.out.println("kampanya oranı "+ kampanyaOrani);
        duzen.goster();
    }
}
