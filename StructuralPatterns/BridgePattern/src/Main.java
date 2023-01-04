public class Main {
    public static void main(String[] args) {
        UI darkMac = new MacUI();
        System.out.println(darkMac.show(new DarkThema()));

        UI lightWin = new WinUI();
        System.out.println(lightWin.show(new LightThema()));

        UI greyLinux = new LinuxUI();
        System.out.println(greyLinux.show(new GreyThema()));


    }
}