package homeWorkClass4;

import java.util.Scanner;

public class Temp {
    /*Create a Java program that will ask user to input city and temperature.
    Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the city?");
        String city= input.nextLine();
        //Scanner temp=new Scanner(System.in);
        System.out.println("What is the temperature?");
        double temp=input.nextDouble();
        //subtract 32 and multiply by .5556
        double celsius=(temp-32)*0.5556;
        System.out.println("The temperature in "+city+" is "+celsius+" celsius");

    }
}
