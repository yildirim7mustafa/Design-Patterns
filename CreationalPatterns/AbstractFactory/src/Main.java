import Entity.Component;
import Entity.WinTable;

public class Main {
    public static void main(String[] args) {

        //testing

        OSXFactory osxFactory = new OSXFactory();
        osxFactory.createButton().paint();
        osxFactory.createList().paint();
        osxFactory.createTable().paint();

        System.out.println();

       WinFactory winFactory = new WinFactory();
       winFactory.createButton().paint();
       winFactory.createList().paint();
       winFactory.createTable().paint();
    }
}