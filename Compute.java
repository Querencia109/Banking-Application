package BankingApplication;

import java.util.*;

public class Compute {
    Scanner in = new Scanner(System.in);
    protected double balance, amount;
    
    //Input Deposit
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        amount = in.nextDouble();
        setDeposit(amount);
    }
    
    //Input Withdraw
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        amount = in.nextDouble();
        setWithdraw(amount);
    }
            
    //Computation of Deposit
    public void setDeposit(double amount) { 
        if(amount >= 0) {
            this.balance += amount;
            System.out.println("\nPhp"+amount+" deposited in account.\n");
        }
        else {
            System.out.println("Invalid input.\n");
        }
    }
    
    //Computation of Withdraw
    public void setWithdraw(double amount) {
        if(balance > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("\nPhp"+amount+" withdrawn from account.\n");
        }
        else if(amount < 0) {
            System.out.println("Invalid input.\n");
        }
        else
            System.out.println("\nNot enough funds in account.\n");
    }
    
    //Checking of Balance
    public void checkBalance() {
        System.out.println("Current balance: Php"+balance+"\n");
    }
}
