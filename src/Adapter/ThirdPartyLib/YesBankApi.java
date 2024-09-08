package Adapter.ThirdPartyLib;

public class YesBankApi {

    public int getBalance(int accNumber){
        return 100;
    }

    public boolean moneyTransfer(String from ,String to){
        return true;
    }
}
