public class Main {
    public static void main(String[] args) {

        for (int i = 0; i< 10; i++){
            Singleton.instance().printThis();
            //every instance call gets same object.that was my porpuse.Not create new object for every call
        }
    }
}