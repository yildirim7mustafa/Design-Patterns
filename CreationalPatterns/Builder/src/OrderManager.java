public class OrderManager {
    private OrderBuilder builder;

    public Car createOrder(String brand,String model,String color, int horsePower){
        if(brand.equals("Ford"))
            builder = new FordOrderBuilder();
        else if(brand.equals("Audi"))
            builder = new AudiOrderBuilder();

        this.builder.setBrand(brand);
        this.builder.setModel(model);
        this.builder.setColor(color);
        this.builder.setHorsePower(horsePower);
        return this.builder.getCar();
    }

    public void printOrder(){
        System.out.println("Brand: " + this.builder.getCar().getBrand());
        System.out.println("Model: " + this.builder.getCar().getModel());
        System.out.println("Color: " + this.builder.getCar().getColor());
        System.out.println("HorsePower: " + this.builder.getCar().getHorsePower());
    }
}
