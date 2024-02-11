package BankingApplication;

import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Objects of the Class
        CreditCard cc = new CreditCard();
        Current cu = new Current();
        Menu m = new Menu();
        Privileged p = new Privileged();
        Savings s = new Savings();
        
        //Start of Bank Account Creation
        m.sayIntro(); 
        if(m.input == 'Y') { //Account Creation
            do {
                m.createAcc();
            }while(m.account != 5);
        }
        else { 
            System.out.println("Get out of here!\nThere are people waiting in line!");
            return;
        }
        
        //Start of Banking Menu
        do {  
        m.displayApplications();
        if(m.choice1 == 1 && m.save == true) { //Savings
            do {
                m.displayActions();
                if(m.choice2 == 1) { //Deposit
                    s.deposit();
                }
                else if(m.choice2 == 2) { //Withdraw
                    s.withdraw();
                }
                else if(m.choice2 == 3) { //Check Balance
                    s.checkBalance();
                }
            }while(m.choice2 != 4);
        }
        else if(m.choice1 == 2 && m.curr == true) { //Current
            do {
                m.displayActions();
                if(m.choice2 == 1) { //Deposit
                    cu.deposit();
                }
                else if(m.choice2 == 2) { //Withdraw
                    cu.overdraw();
                }
                else if(m.choice2 == 3) { //Check Balance
                    cu.checkBalance();
                }
            }while(m.choice2 != 4);
        }
        else if(m.choice1 == 3 && m.priv == true) { //Privileged
            do {
                m.displayActions();
                if(m.choice2 == 1) { //Deposit
                    p.deposit();
                    p.privileged();
                }
                else if(m.choice2 == 2) { //Withdraw
                    p.withdraw();
                }
                else if(m.choice2 == 3) { //Check Balance
                    p.checkBalance();
                }
            }while(m.choice2 != 4);
        }
        else if(m.choice1 == 4 && m.cred == true) { //Credit Card
            do {
                m.displayActions();
                if(m.choice2 == 1) { //Deposit
                    cc.deposit();
                }
                else if(m.choice2 == 2) { //Withdraw
                    cc.withdraw();
                }
                else if(m.choice2 == 3) { //Check Balance
                    cc.checkBalance();
                }
            }while(m.choice2 != 4);
        }
        else if(m.choice1 == 5) { //Go Back
            do {
                m.createAcc();
            }while(m.account != 5);
        }
        else if(m.choice1 != 6 && (m.save == false || m.curr == false || m.priv == false || m.cred == false)) { //Accessing An Application Without Account
                System.out.println("You have no account for that :<\n");
        }
        }while(m.choice1 != 6); //Close of Display Applications
    }    
}