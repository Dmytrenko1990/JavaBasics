package homeWorkClass3;
import java.util.Scanner;

public class ScannerTut {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your first name?");
        String name=scan.next();
        System.out.println(name);
        System.out.println("How old are you?");
        int age= scan.nextInt();
        System.out.println(age);
        System.out.println("What is your senior qoute?");
        String quote=scan.next();
        quote=quote+scan.nextLine();
        System.out.println("Thank you "+name+" you are "+age+" years old ");
        System.out.println("and your senior qoute is "+ quote);
    }
}
