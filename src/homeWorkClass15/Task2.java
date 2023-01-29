package homeWorkClass15;

import java.util.Scanner;

//Create a method that will take a number and prints whether the number is even or odd.
public class Task2 {
    String evenOrOdd(int num){
        if(num%2==0){
            return "even";
        }else{
            return "odd";}
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        System.out.println(num+" is "+task2.evenOrOdd(num)+" number");
    }
}
