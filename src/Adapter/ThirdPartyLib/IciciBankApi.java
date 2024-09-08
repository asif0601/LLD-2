package Adapter.ThirdPartyLib;

public class IciciBankApi {

    public int getAccountBalance(int accNumber){
        return 1000;
    }
    public boolean transferSomeMoney(String from , String to){
        try{
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
