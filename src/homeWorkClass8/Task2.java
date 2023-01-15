package homeWorkClass8;

import java.util.Scanner;
import java.util.SortedMap;

public class Task2 {
    /*Create a program that will be asking user to apply for a credit card 10 times.
    As soon you get an “yes” from a user program should stop asking.*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        for (int i=0;i<10;i++){
        System.out.println("Would you like to apply for a credit card?(yes/no)");
        String answer=scan.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            break;
        }


        }

    }
}
