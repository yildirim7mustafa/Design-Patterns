public class Main {
    public static void main(String[] args) {

        Magazine magazine = new Magazine();


        Subscriber mustafa = new Subscriber(magazine, "mustafa yildirim");
        Subscriber mert = new Subscriber(magazine, "mert samur");
        Subscriber dogukan = new Subscriber(magazine, "dogukan polatel");
        Bookstore bookstore = new Bookstore(magazine);

        magazine.setMagazine("Uykusuz");

        magazine.setMagazine("Kaybedenler Kulübü");



    }
}