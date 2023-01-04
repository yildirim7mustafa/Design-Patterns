public class ControlManager {
    public static boolean CheckHasEnoughCashInBankAccount(Customer customer, double amount){
        if(customer.getCashAmount() >= amount)
            return true;
        else
            return false;
    }

    public static boolean CheckCanUseCredit(String idNo){
        return true;
    }
}
