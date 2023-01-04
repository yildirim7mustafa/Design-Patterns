public class EFTManager {
    void SendEFT(Customer fromCustomer, Customer toCustomer, double eftAmount){
        if(ControlManager.CheckHasEnoughCashInBankAccount(fromCustomer,eftAmount)){
            fromCustomer.cashAmount -= eftAmount;
            System.out.println("EFT" + toCustomer.getCustomerNumber() + " has sended");
        }else{
            System.out.println("unsuccessfull");
        }
    }
}
