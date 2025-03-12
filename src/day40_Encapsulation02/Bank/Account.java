package day40_Encapsulation02.Bank;

import java.util.ArrayList;
import java.util.Arrays;

public class Account {

    private String accountType;
    private String accountNumber;
    private double balance;  //bakiye

    private boolean acilabilirMi;


    private static ArrayList<String> types = new ArrayList<>(Arrays.asList("Tl", "Euro", "Dolar"));

    public Account(String accountType, String accountNumber, double balance) {

        /* this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
        */
        acilabilirMi = false;
        setAccountType(accountType);
        setAccountNumber(accountNumber);
        setBalance(balance);

    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if (accountType != null && types.contains(accountType)) {
            this.accountType = accountType;
            acilabilirMi = true;
        } else {
            System.out.println(accountType + " türünde bir hesap bankamızda olmadığından açamazsınız.");
            System.out.println("Açabileceğiniz hesap türleri : " + types);
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (acilabilirMi) {
            this.accountNumber = accountNumber;
        }


    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (acilabilirMi && balance >= 100) {
            this.balance += balance;
        }

    }

    public void deposit(double miktar) {
        if (miktar > 0) {
            this.balance += miktar;
        }
    }

    public void withdraw(double miktar) {
        if (miktar > 0 && miktar <= balance) {
            this.balance -= miktar;
        }
    }

/*
    public  ArrayList<String> getTypes() {
        return types;
    }*/

    public ArrayList<String> getTypes() {
        return new ArrayList<>(types);
    }

    public static void setTypes(ArrayList<String> types) {
        Account.types = types;
    }

    @Override
    public String toString() {
        String str = "";
        str += "\nAccount Type     : " + getAccountType() + "\n";
        str += "Account Number   : " + getAccountNumber() + "\n";
        str += "Account Balance  : " + getBalance() + "\n";
        return str;

    }
}
