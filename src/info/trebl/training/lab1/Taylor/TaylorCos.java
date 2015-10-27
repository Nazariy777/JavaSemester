package info.trebl.training.lab1.Taylor;

/**
 * Created by kibernetuk.com on 26.10.2015.
 */
public class TaylorCos{

    public static void main(String[] args) {

        double precision = 0.0001;

        double x = Math.PI / 4;
        double sum = 1;

        double prevChiselnik = 1;
        double prevZnaminnik = 2;

        for (int n = 1; ; n++){

            prevChiselnik = prevChiselnik * x * x;
            prevZnaminnik = prevZnaminnik * (2 * n - 1) * (2 * n);
            double dodanok = prevChiselnik / prevZnaminnik;
            if (Math.abs(dodanok) <= precision){
                break;
            }

            if (n % 2 == 0) {
                sum = sum + dodanok;
            } else {
                sum = sum - dodanok;
            }
        }

        System.out.println(sum);
    }
}
