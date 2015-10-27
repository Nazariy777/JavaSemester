package info.trebl.training.lab1.Taylor;

/**
 * Created by kibernetuk.com on 26.10.2015.
 */
public class TaylorSin {

    public static void main(String[] args) {

        double precisition = 0.0001;

        double x = -0.5;
        double sum = 1;

        double prevX = 1;

        while (true){
            prevX = prevX * x;
            if (Math.abs(prevX) <= precisition){
                break;
            }
            sum = sum + prevX;
        }
        System.out.println(sum);
    }
}
