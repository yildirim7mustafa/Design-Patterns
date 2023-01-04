public class BMW extends CarFactory{
    @Override
    public void createAuto() {
        getCarList().add(new Z4(170));
    }
}
