package Pattern;

public class Triangle {
    public static void main(String args[]){
        int n = 5;
        for(int i=5;i > 0; i--){
            for(int j=1;j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        for(int i=1;i <= n; i++){
            if(i==1){
                continue;
            }
            for(int j=1;j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
