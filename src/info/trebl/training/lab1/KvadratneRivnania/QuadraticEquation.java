package info.trebl.training.lab1.KvadratneRivnania;

/**
 * Created by kibernetuk.com on 26.10.2015.
 */
public class QuadraticEquation {
    public static void main(String[] args){
        double a = 2;
        double b = 6;
        double c = 4;
        double d = b * b - 4 * a * c;
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
