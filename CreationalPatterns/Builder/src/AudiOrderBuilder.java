public class AudiOrderBuilder extends OrderBuilder{

    public AudiOrderBuilder() {
    }

    @Override
    public void setBrand(String brand) {
        getCar().setBrand(new Brand(brand));
    }

    @Override
    public void setModel(String model) {
        getCar().setModel(new Model(model));
    }

    @Override
    public void setColor(String color) {
        getCar().setColor(color);
    }

    @Override
    public void setHorsePower(int hp) {
        getCar().setHorsePower(hp);
    }
}
