package project1;

import java.util.Scanner;

public class Task7 {
    //Write a java program to check whether a given number is prime or not?
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scan.nextInt();
        int n=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                n++;
            }

        }
        if(n>2){
            System.out.println("Your number is not prime");
        }else System.out.println("Your number is prime");
    }
}
