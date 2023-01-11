package homeWorkClass5;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of day");
        int numOfDay=input.nextInt();
        if (numOfDay>=1 && numOfDay<=5){
            System.out.println("It is a weekday");
        }
        else if (numOfDay==6 || numOfDay==7){
            System.out.println("It is weekend");
        }
        else System.out.println("Invalid day");
    }
}
