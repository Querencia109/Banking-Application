package BankingApplication;

public class Privileged extends Compute{
    private double points;
    
    public void privileged(){
        points += (amount * 0.05);
        
        System.out.println("You have earned "+points+" points.");
        System.out.println("You can use points to buy anything in any partnered convenience store.\n");
    }
}
