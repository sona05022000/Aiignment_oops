package Oops_Assignment;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits + creditLimit;
    }
}

class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits + fixedDepositAmount;
    }
}

public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> accounts) {
        int total = 0;
        for (Integer account : accounts) {
            total += account;
        }
        return total;
    }

    public int getCash() {
        return 0;
    }


    public static void main(String[] args) {
        ArrayList<Integer> accounts = new ArrayList<>();
        CurrentAccount currentAccount = new CurrentAccount();
        SavingsAccount savingsAccount = new SavingsAccount();

        accounts.add(currentAccount.totalDeposits + currentAccount.creditLimit);
        accounts.add(savingsAccount.totalDeposits + savingsAccount.fixedDepositAmount);

        Assignment2Q3 bank = new Assignment2Q3();
        int totalCash = bank.totalCashInBank(accounts);
        System.out.println("Total cash in the bank: " + totalCash);
    }}
 