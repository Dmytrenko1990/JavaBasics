package homeWorkClass4;

import java.util.Scanner;

public class LoanSpec {
    /*You are a loan specialist and you need to ask user what is the amount of loan is needed.
    If loan is less or equal to 200,000 then you would lend the money otherwise
    you would reject the client.
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is the amount of loan do you need?");
        int loan=input.nextInt();
        if (loan<=200000){
            System.out.println("You are approved");
        }
        else{
            System.out.println("You are rejected");
        }

    }
}
