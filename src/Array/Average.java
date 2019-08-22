package Array;
import java.util.*;

public class Average {
    public static  void main(String[] args){
        double sum=0.0,avg;
        double[] data = {45.3,67.5,-45.6,20.34,33.0,45.6};
        for(int i=0;i<data.length;i++){
            sum += data[i];
        }
        avg = sum/data.length;
        System.out.println(String.format("avg of %d numbers is %.2f",data.length,avg));
    }
}
