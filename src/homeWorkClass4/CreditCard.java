package homeWorkClass4;

import java.util.Scanner;

public class CreditCard {
    /*Create a Java program that will ask if user has a credit card or not.
    If you user does not have a credit card then offer them. If they do have one ask what is balance
    on the card? If balance of the card is larger than 1000, tell them to pay off immediately,
    otherwise you can tell them that they can spend more.
     */
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have credit card? (please type 'yes' or 'no')");
        String creditCard=input.nextLine();
        if (creditCard.equals("no")){
            System.out.println("We are offering good deal for you!");
        }
        else{
            System.out.println("What is your balance on the card?");
            int balance=input.nextInt();
            if (balance>1000){
                System.out.println("Make payment immediately");
            }
            else{
                System.out.println("You can spend more money");
            }
        }


    }
}
