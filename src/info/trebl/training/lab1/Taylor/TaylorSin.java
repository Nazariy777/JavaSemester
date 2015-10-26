package info.trebl.training.lab1.Taylor;

/**
 * Created by kibernetuk.com on 26.10.2015.
 */
public class TaylorSin {
    public static void main(String[] args) {
        int i;
        double x = Math.PI / 6;
        double sum1 = 0;
        double sum2 = 0;
        long fact = 1;
        double nominator = 1;
        for (i = 1; i < 20; i++) ;
        {
            fact = fact * 2 * i * (2 * i + i);
            nominator = nominator * x * x;
            if (i % 2 == 0){
                sum2 = sum2 + nominator / fact;
            } else {
                sum1 = sum1 + nominator / fact;
            }
        }
        double result = x + sum2 - sum1;
        System.out.println(result);
        System.out.println(Math.sin(x));
    }
}
