package homeWorkClass8;

import java.util.Scanner;

/*Write a program to ask a user to enter item they want to buy and the price of
  that item. Every time user enters money accumulate the amount and tell
  the user how much is left to pay off. If user give more money program
  should return a change. Whenever a user done with payments program should
  say "Thank you for shopping!"*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What you would like to buy?");
        String item = scan.nextLine();
        System.out.println("What is the price of item?");
        double itemPrice = scan.nextDouble();
        double totalAmount = 0;
        double amountToPay, remaining;
        amountToPay = 0;
        int i = 0;
        while (itemPrice > totalAmount) {
            System.out.println("Please, enter the amount you would like to pay:");
            amountToPay = scan.nextDouble();
            totalAmount = totalAmount + amountToPay;
            remaining = itemPrice - totalAmount;

            i++;
            if (remaining > 0) {
                System.out.println("You should pay: " + remaining);
            } else if (remaining == 0) {
                System.out.println("Thank you for the shopping");
            } else if (remaining < 0) {
                System.out.println("Thank you for the shopping. Your change is:" + remaining);
            }
        }
    }


}
