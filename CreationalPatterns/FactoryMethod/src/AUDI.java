public class AUDI extends CarFactory {
    @Override
    public void createAuto() {
        getCarList().add(new A4(156));
        getCarList().add(new R8(560));
    }
}

