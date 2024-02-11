package BankingApplication;

import java.util.*;

public class Menu extends Compute{
    Scanner in = new Scanner(System.in);
    protected int choice1, choice2, account;
    protected char input;
    protected boolean save = false, curr = false, priv = false, cred = false;
    
    public void sayIntro() {
        System.out.println("WELCOME TO GOLDGUARD FINANCIAL!");
        System.out.print("\nYou have no account.\nCreate one (Y/N)? ");
        input = in.next().toUpperCase().charAt(0);
        System.out.println("");
    }
    
    public void createAcc() {
        System.out.println("\t= = =ACCOUNT CREATION= = =");
        System.out.println("Choose the type of the account:");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        System.out.println("3. Privileged");
        System.out.println("4. Credit Card");
        System.out.println("\n5. Continue");
        System.out.print("\nEnter choice: ");
        account = in.nextInt();
        
        if(account == 1) {
            save = true;
            System.out.println("\nSavings account created!\n");
        }
        else if(account == 2) {
            curr = true;
            System.out.println("\nCurrent account created!\n");
        }
        else if(account == 3) {
            priv = true;
            System.out.println("\nPrivileged account created!\n");
        }
        else if(account == 4) {
            cred = true;
            System.out.println("\nCredit Card account created!\n");
        }
        else if(account == 5) {
            System.out.println("");
        }
    }
    
    public void displayApplications() {
        System.out.println("\t= = =B A N K= = =");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        System.out.println("3. Privileged");
        System.out.println("4. Credit Card");
        System.out.println("");
        System.out.println("5. Back");
        System.out.println("6. Quit");
        System.out.print("\nEnter Choice: ");
        choice1 = in.nextInt();
        System.out.println("");
    }
    public void displayActions() {
        System.out.println("\t= = =B A N K= = =");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("");
        System.out.println("4. Back");
        System.out.print("\nEnter choice: ");
        choice2 = in.nextInt();
        System.out.println("");
    }
}
