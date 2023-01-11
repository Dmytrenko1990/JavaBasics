package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*scan is just a variable like we create primitive variable
        = => assigning operator
        System.in=> tells the computer we want to read the data from keyboard
         */
      /*  System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are " + age + " years old");
        System.out.println("Please enter your weight");
        double weight= scan.nextDouble();
        System.out.println("Your weight is " +weight+ "kgs");
        System.out.println("Are you hungry");
        boolean hungry= scan.nextBoolean();
        System.out.println("Hungry "+hungry);

       */

        /*System.out.println("Please Enter your gender");
        char gender= scan.next().charAt(0);
        System.out.println("You gender is "+gender);*/

        System.out.println("Enter your name");
        String name= scan.next();  // when you have to taken only one word as input
        System.out.println("Your name is "+ name);

        scan.nextLine(); // Trick to make nextLine method to work after we have used
        //any another method from Scanner class

        System.out.println("Enter your full name");
        String fullName= scan.nextLine();
        System.out.println("Your name is "+ fullName);
        scan.close();



    }
}
