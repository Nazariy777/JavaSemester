package info.trebl.training.lab1.Taylor;

/**
 * Created by kibernetuk.com on 26.10.2015.
 */
public class NaturalLogarithm {
    public static void main(String[] args){
        int i;
        double x = 10;
        double nominator = 1;
        double result = 1;
        double denominator = 1;
        {
            for (i = 3; i < 20; i++);
            nominator = nominator * Math.pow(-1, i) * Math.pow(x, i + 1);
            denominator = denominator * (i + 1);
            result = result * x + nominator/denominator;


        }
        System.out.println(result);
    }
}
