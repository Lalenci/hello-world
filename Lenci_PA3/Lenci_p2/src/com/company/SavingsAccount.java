package com.company;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(double balance) {
        savingsBalance = balance;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance += monthlyInterest;
        System.out.println("New savings balance: " + savingsBalance);
    }

    public double getBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
}
