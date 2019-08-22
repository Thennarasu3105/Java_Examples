package Array;

public class StandardDeviation {

    public static double AverageOfArray(double[] numarray){
        double sum = 0,SD = 0;
        for(double num: numarray){
            sum += num;
        }
        double mean = sum /numarray.length;
        //System.out.format("%.4f",mean);

        for(double num: numarray){
             SD += Math.pow(num-mean,2);
        }
        return Math.sqrt(SD/numarray.length);
    }
    public static void main(String args[]){
        double[] numarray = {1,2,3,4,5,6,7,8,9,10};
        System.out.format("%.4f\n",AverageOfArray(numarray));

    }
}
