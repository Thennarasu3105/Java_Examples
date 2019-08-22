package Basics;
import java.util.Scanner;

public class BankApp extends Banking{
    static String ifsc = "SBIN0004890";

    public static void main(String args[]){
        System.out.println("1.Banking");
        System.out.println("2.Enquiry");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Selection: ");
        int selection = input.nextInt();

        switch(selection){
            case 1:
                //Banking.list();
                Banking person = new Banking();
                person.list();
                person.create("Thennarasu R","32724150809",500);
                person.withdraw(500);
                person.deposit(10000);
                System.out.println(person.getAmount());
        }


    }
}
