package class9;

import java.util.Scanner;

public class Task3 {
    /*  Write a program that reads a range of integers (start and end point),
      provided by a user and then from that range prints the sum
      of the even and odd integers.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers starting and ending point");
        int start = scan.nextInt();
        int end = scan.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i; //evenSum=evenSum+1

            } else {
                oddSum += i; //oddSum=oddSum+1
            }
            }
        System.out.println("Sum of even numbers "+evenSum);
        System.out.println("Sum of odd numbers "+oddSum);
    }
}
