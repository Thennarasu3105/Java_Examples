package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        int k=0;
        for(int i=rows; i>=1;i--,k=0){
            for(int space=1; space <= rows-i;++space){
                System.out.print("  ");
            }
            while(k != 2*i-1){
                System.out.print(i + " ");
                k++;
            }
            System.out.println(" ");
        }


    }
}
