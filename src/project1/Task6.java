package project1;

public class Task6 {
    //Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {
        int a=3;
        int b=7;
        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println(a);
        System.out.println(b);
    }
}
