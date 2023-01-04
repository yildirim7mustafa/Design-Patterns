public class Facade {
    private EFTManager eftManager;
    private CreditManager creditManager;

    public Facade() {
        this.eftManager = new EFTManager();
        this.creditManager = new CreditManager();
    }

    public void SendEFT(Customer fromCustomer,Customer toCustomer, double amount){
        eftManager.SendEFT(fromCustomer,toCustomer,amount);
    }

    public void UseCredit(Customer customer){
        creditManager.UseCredit(customer);
    }
}
