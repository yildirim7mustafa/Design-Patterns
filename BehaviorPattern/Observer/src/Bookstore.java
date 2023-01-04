public class Bookstore implements Observer{

    private Subject magazine;

    public Bookstore(Subject magazine) {
        this.magazine = magazine;
        magazine.registerObserver(this);
    }

    @Override
    public void update(String magazine) {
        System.out.println("Mağazamız bugün "+magazine+" dergisini güncelliyor.");
    }
}
