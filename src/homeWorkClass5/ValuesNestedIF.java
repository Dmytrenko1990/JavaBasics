package homeWorkClass5;

import java.util.Scanner;

public class ValuesNestedIF {
    public static void main(String[] args) {
        /*Write a program to find largest number among three numbers
        using nested if provided by a user (numbers must be distinct)*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        int largestNum;
        if (num1>num2){
            if (num1>num3){
               largestNum=num1;
                System.out.println(largestNum);
            }
        }
        if (num2>num1){
            if(num2>num3){
                largestNum=num2;
                System.out.println(largestNum);
            }
        }
        if (num3>num1){
            if(num3>num2){
                largestNum=num3;
                System.out.println(largestNum);
            }
        }

    }
}
