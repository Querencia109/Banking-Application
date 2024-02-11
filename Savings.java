package BankingApplication;

public class Savings extends Compute{
    private int limit = 6;
    
    public void withdraw() {
        if(limit >= 4) {
            super.withdraw();
            limit--;
        }
        else if(limit == 3) {
            super.withdraw();
            limit--;
            System.out.println("You have 2 transactions left.\n");
        }
        else if(limit == 2) {
            super.withdraw();
            limit--;
            System.out.println("You have 1 transactions left.\n");
        }
        else if(limit == 1) {
            super.withdraw();
            limit--;
            System.out.println("You have no transactions left for today.");
            System.out.println("Any more withdrawals will come with an additional fee.\n");
        }
        else if(limit <= 0) {
            System.out.print("Enter amount to withdraw: ");
            super.amount = in.nextDouble();
            if(super.balance > 0 && super.amount <= super.balance) {
                super.balance -= (super.amount + 20);
                System.out.println("\nPhp"+super.amount+" withdrawn from account with an additional Php20.0 fee.\n");
            }
            else
                System.out.println("\nNot enough points in balance.\n");
        }
    }
}
