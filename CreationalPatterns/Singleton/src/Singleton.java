public class Singleton {

    private static Singleton instance = null;
    private Singleton() {
        System.out.println("singleton init()...");
    }

    private static Object lock = new Object();

    public static Singleton instance(){
        if(instance == null){
            synchronized (lock){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printThis(){
        System.out.println(this);
    }

}
