import java.util.ArrayList;

public abstract class CarFactory {

    private ArrayList<Car> carList = new ArrayList<Car>();

    public CarFactory(){
        this.createAuto();
    }

    public abstract void createAuto();

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
}
