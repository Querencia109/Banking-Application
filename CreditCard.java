package BankingApplication;

public class CreditCard extends Compute{
    CreditCard() {
        super.balance = 1000;
    }
    
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        super.amount = in.nextDouble();
        
        if(super.amount >= 500 && (super.balance + super.amount) <= 10000) {
            super.balance += super.amount;
            System.out.println("\nPhp"+super.amount+" deposited in account.\n");
        }
        else if(super.amount < 500 && (super.balance + super.amount) <= 10000) {
            System.out.println("\nDeposit a minimum of Php500.0.\n");
        }
        else {
            System.out.println("\nCannot exceed limit.\n");
        }
    }
}
