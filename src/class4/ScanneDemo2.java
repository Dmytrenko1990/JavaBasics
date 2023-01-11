package class4;

import java.util.Scanner;

public class ScanneDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("Your age "+age+" years old");
    }
}
