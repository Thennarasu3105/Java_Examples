package Basics;
import java.util.Scanner;

public class Banking {
    private String name;
    private String accountNumber;
    private double amount;

    public double getAmount() {
        return amount;
    }

    Scanner input = new Scanner(System.in);
    void list(){
        System.out.println("1.Create account");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
    }


    void create(String name,String accountNumber,double amount){
        this.name = name;
        this.accountNumber = accountNumber;
        this.amount = amount;
        System.out.println("Account created!");
    }

    void withdraw(double amt){

        if(amt <= amount){
            amount -= amt;
        }
        else{
            System.out.println("Insufficient balance");
            //break;
        }
        System.out.println("you withdraw " + amt + " from your account.");
    }

    void deposit(double amt){
        if(amt > 0){
            amount += amt;
        }
        else{
            System.out.println("Invalid amount");
            //break;
        }
        System.out.println("you deposit " + amt + " from your account.");
    }
}
