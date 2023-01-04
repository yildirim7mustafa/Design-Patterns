public class CreditManager {
    public void UseCredit(Customer customer){
        if(ControlManager.CheckCanUseCredit(customer.getIdNo()))
            System.out.println("Credit accepted");
        else
            System.out.println("Credit decline");
    }
}
