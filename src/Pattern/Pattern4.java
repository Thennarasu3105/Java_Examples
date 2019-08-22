package Pattern;

import java.util.*;

public class Pattern4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enetr number of rows: ");
        int n = input.nextInt();
        int k=1;
        for(int i=0;i<n;++i){
            for(int space=1;space < n-i;++space ){
                System.out.print("  ");
            }
            for(int j=0;j<=i;++j){
                if(j==0 || i==0){
                    k = 1;
                }
                else{
                    k = k*(i-j+1)/j;
                }
                System.out.printf("%4d",k);
            }
            System.out.println(" ");
        }
    }
}
