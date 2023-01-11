package homeWorkClass5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter the first number");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        num2 = sc.nextDouble();
        System.out.println("Enter operator(+;-;*;/)");
        char operation = sc.next().charAt(0);
        double result;
        switch (operation) {
            case '+':
                result=num1+num2;
                System.out.println(result);
                break;
            case '-':
                result=num1-num2;
                System.out.println(result);
                break;
            case '*':
                result=num1*num2;
                System.out.println(result);
                break;
            case '/':
                result=num1/num2;
                System.out.println(result);
                break;

        }

    }
}