public class Main {
    public static void main(String[] args) {
       Facade facade = new Facade();

       Customer customer1 = new Customer();
       customer1.setIdNo("123456");
       customer1.setCustomerNumber(555444);
       customer1.setFullName("Mehmet Aydın");
       customer1.setCashAmount(7895.6);

        Customer customer2 = new Customer();
        customer2.setIdNo("456789");
        customer2.setCustomerNumber(444222);
        customer2.setFullName("Lionel Messi");
        customer2.setCashAmount(99999.6);

        facade.SendEFT(customer1,customer2,5);
        facade.UseCredit(customer2);



    }
}