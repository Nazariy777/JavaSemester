package info.trebl.training.lab1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kibernetuk.com on 26.10.2015.
 */
public class RandomGame {

    public static void main (String[]args){
        Random r = new Random();

        int number = r.nextInt(150);
        System.out.println("Задане число від 0 до 150,відгадайте його");

        int response;

        Scanner scanner = new Scanner(System.in);

        while(true){
            response = Integer.parseInt(scanner.nextLine());

            if (response == number){
                System.out.println("Число відгадане,молодець");
                break;
            } else if (response < number){
                System.out.println("Це число менше задуманого");
            } else {
                System.out.println("Це число більше задуманого");
            }
        }
    }

}
