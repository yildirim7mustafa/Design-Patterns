public class Main {
    public static void main(String[] args) {

        Tablet ipad = new Ipad("ipad mini","Apple");
        Tablet galaxy = new Ipad("galaxy tab 3","Samsung");

        ipad.accept(new ThreeGVisitor());
        ipad.accept(new WifiVisitor());

        System.out.println("*************");

        galaxy.accept(new WifiVisitor());
        galaxy.accept(new ThreeGVisitor());





    }
}