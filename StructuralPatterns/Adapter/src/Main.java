import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IO io = new BatchAdapter(new BatchIO());
        io.copy("root/usr", "root/libs");
        io.createFolder("root/usr/bin");


    }
}