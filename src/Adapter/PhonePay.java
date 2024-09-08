package Adapter;

import Adapter.BankAdapter.IciciBankAdapter;
import Adapter.BankAdapter.YesBankAdapter;

public class PhonePay {
    public static void main(String[] args) {
        BankApi bankApi = new IciciBankAdapter();
        int number = bankApi.getBalance(123);
        bankApi.sendMoneyToBank(1,2);
        System.out.println(number);
    }
}
