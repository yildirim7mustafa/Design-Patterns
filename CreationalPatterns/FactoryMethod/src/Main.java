public class Main {
    public static void main(String[] args) {

        CarFactory bmw = new BMW();
        CarFactory audi = new AUDI();

        for (Car car : bmw.getCarList()) {
            System.out.println(
                    car.getBrand() + " "
                            + car.getModel() + " "
                            + car.getHorsePower()
            );
        }

        for (Car car : audi.getCarList()) {
            System.out.println(
                    car.getBrand() + " "
                            + car.getModel() + " "
                            + car.getHorsePower()
            );
        }
    }
}