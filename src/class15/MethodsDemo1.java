package class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scanner.nextInt();
        System.out.println("You enter"+num);

        Methods methods=new Methods();
        methods.doSomeThings();
      //  int num2=methods.doSomeThings();
        String str= methods.method2();
    }
}
