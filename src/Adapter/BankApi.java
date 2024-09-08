package Adapter;

public interface BankApi {

    int getBalance(int accNumber);
    boolean sendMoneyToBank(int from, int to);
}
