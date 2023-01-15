package homeWorkClass8;
/*
Write a program that reads a range of integers (start and end point),
provided by a user and then from that range prints the sum
of the even and odd integers.
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please, enter the start of the range");
        int start= scan.nextInt();
        System.out.println("Please, enter the end of the range");
        int end= scan.nextInt();
        int sumEven=0, sumOdd=0;
        for (int i=start; i<=end;i++){
           // System.out.print(i);
            if(i%2==0){
                 sumEven+=i;
            }
            else sumOdd+=i;
        }
        System.out.println("Sum of the even numbers of te range: " +sumEven);
        System.out.println("Sum of the odd numbers of te range: " +sumOdd);

    }
}
