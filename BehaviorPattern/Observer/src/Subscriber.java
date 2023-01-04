public class Subscriber implements Observer{

    private String subscriber;
    private Subject magazine;

    public Subscriber(Subject magazine, String subscriber) {
        this.subscriber = subscriber;
        this.magazine = magazine;
        magazine.registerObserver(this);
    }


    @Override
    public void update(String magazine) {
        System.out.println("Sayin " + subscriber + " derginiz geldi.Bugünün dergisi "+magazine+".");
    }
}
