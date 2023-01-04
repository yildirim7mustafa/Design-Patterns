public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        orderManager.createOrder("Audi","A6","piano black", 240);
        orderManager.printOrder();
    }
}