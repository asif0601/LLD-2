package Adapter.BankAdapter;

import Adapter.BankApi;
import Adapter.ThirdPartyLib.IciciBankApi;

public class IciciBankAdapter implements BankApi {

    private IciciBankApi iciciBankApi = new IciciBankApi();
    @Override
    public int getBalance(int accNumber) {
        return iciciBankApi.getAccountBalance(10);
    }

    @Override
    public boolean sendMoneyToBank(int from, int to) {
        try{
            iciciBankApi.transferSomeMoney(Integer.toString(from), Integer.toString(to));
            return true;
        }catch(Exception e){
            return false;
        }

    }
}
