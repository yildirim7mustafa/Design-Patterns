public class Main {
    public static void main(String[] args) {
        CompositeDealers genelMudurluk = new CompositeDealers();
        CompositeDealers ankaraBolgesi = new CompositeDealers();
        CompositeDealers sivasBolgesi = new CompositeDealers();
        CompositeDealers icAnadoluBolgesi = new CompositeDealers();


        CompositeDealers ankara1 = new CompositeDealers();
        CompositeDealers ankara2 = new CompositeDealers();
        CompositeDealers sivas1 = new CompositeDealers();

        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());

        ankara2.add(new WorkingPerson());
        ankara2.add(new WorkingPerson());

        sivas1.add(new WorkingPerson());

        ankaraBolgesi.add(ankara1);
        ankaraBolgesi.add(ankara2);

        sivasBolgesi.add(sivas1);

        icAnadoluBolgesi.add(ankaraBolgesi);
        icAnadoluBolgesi.add(sivasBolgesi);

        genelMudurluk.add(icAnadoluBolgesi);
        ankara1.add(sivas1);

        System.out.println("ankara1 coast :" + ankara1.getCost());
        System.out.println("ankara2 coast :" + ankara2.getCost());
        System.out.println("Ankara bolgesi coast :"+ ankaraBolgesi.getCost());

        System.out.println("sivas1 coast :" + sivas1.getCost());
        System.out.println("sivas bolgesi coast :"+ sivasBolgesi.getCost());

        System.out.println("İc anadolu bolgesi coast :" + icAnadoluBolgesi.getCost());
        System.out.println("Genel Mudurluk coast :" + genelMudurluk.getCost());


    }
}