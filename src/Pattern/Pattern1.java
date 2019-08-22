package Pattern;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char alphabet = 'A';
        System.out.print("Enter number of Rows: ");
        char rows = input.next().charAt(0);
        for(int i=1; i<=(rows-'A'+1);i++){
            for(int j=1;j <= i;j++){
                System.out.print(alphabet + " ");
                //alphabet++;
            }
            alphabet++;
            System.out.println(" ");
        }
    }
}
