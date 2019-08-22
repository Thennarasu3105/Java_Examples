package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]){
        int k = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        for(int i=1;i<=rows;i++,k=0){
            for(int space=1;space<=rows-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
