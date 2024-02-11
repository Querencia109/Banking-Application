package BankingApplication;

public class Current extends Compute{
    public void overdraw(){
        System.out.print("Enter amount to withdraw: ");
        super.amount = in.nextDouble();
        if(super.balance > 0 && super.amount <= super.balance) {
            super.balance -= super.amount;
            System.out.println("\nPhp"+super.amount+" withdrawn from account.\n");
        }
        else if((super.balance - super.amount) < 0) {
            super.balance -= super.amount;
            System.out.println("\nPhp"+super.amount+" withdrawn from account.");
            System.out.println("You have a debt of Php"+super.balance+".");
            System.out.println("Please pay later.\n");
        }
    }
}
