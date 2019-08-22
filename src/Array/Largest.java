package Array;

public class Largest {
    public static void main(String args[]){
        int largest = 0;
        int[] numarray = {3,9,1,23,6,8,73};
        for(int num: numarray){
            if(largest < num)
                largest = num;
        }
        System.out.println(largest);
    }
}
