package homeWorkClass4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double res;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        double a=input.nextDouble();
        System.out.println("Enter the second number");
        double b=input.nextDouble();
        System.out.println("Enter arithmetic operation");
        char operation=input.next().charAt(0);
        if (operation=='+'){
            res=a+b;
            System.out.println(res);
        } else if (operation=='-') {
            res=a-b;
            System.out.println(res);
        } else if (operation=='*') {
            res=a*b;
            System.out.println(res);
        } else if (operation=='/') {
            res=a/b;
            System.out.println(res);


        }

    }
}
