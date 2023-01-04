public class Ipad implements Tablet{

    private String model;
    private String brand;

    public Ipad(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
