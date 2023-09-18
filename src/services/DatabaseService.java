package services;

import perbankan.Bank;

public class DatabaseService {
    private static Bank bank;
    
    public static Bank getBank() {
        if (bank == null)
            bank = new Bank();
        return bank;
    }
}
