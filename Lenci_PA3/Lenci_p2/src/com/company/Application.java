package com.company;

public class Application {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        //Monthly interest for 12 months
        for(int i = 0; i < 12; ++i) {
            System.out.println("\nMonth " + i);
            saver1.modifyInterestRate(.04);
            saver1.calculateMonthlyInterest();
            saver2.modifyInterestRate(.04);
            saver2.calculateMonthlyInterest();
        }

        //Monthly interest for next month
        System.out.println("\nInterest for the next month at 5%");
        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();
    }
}
