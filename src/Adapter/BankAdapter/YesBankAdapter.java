package Adapter.BankAdapter;

import Adapter.BankApi;
import Adapter.ThirdPartyLib.YesBankApi;

public class YesBankAdapter implements BankApi {

    private YesBankApi yesBankApi = new YesBankApi();

    @Override
    public int getBalance(int accNumber) {
        try{
            yesBankApi.getBalance(accNumber);
            return 100;
        }catch(Exception e) {
            return 0;
        }
    }

    @Override
    public boolean sendMoneyToBank(int from, int to) {
        try{
            yesBankApi.moneyTransfer(Integer.toString(from), Integer.toString(from));
            return true;
        } catch(Exception e){
            return false;
        }

    }
}
