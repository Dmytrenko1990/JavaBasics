package homeWorkClass12;

import java.util.Scanner;

public class Task3 {
    /*   Write a program that reads two people's first
       names and if they expecting boy or girl?
       Based on the input suggests a name for a baby:
       Example Output:
       Mom’s first name? Mary
       Dad’s first name? Daniel
       Boy or Girl? boy
       Suggested baby name: DANRY

       Example Output:
       Mom’s first name? Mary
       Dad’s first name? Daniel
       Boy or Girl? girl
       Suggested baby name: MAIEL*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter dad's first name");
        String dadName = scan.next();
        System.out.println("Enter mom's first name");
        String momName = scan.next();
        System.out.println("Boy or Girl?");
        String gender = scan.next();
        String babyName="";
        if (gender.equalsIgnoreCase("girl")) {
            babyName = dadName.substring(0, dadName.length()/2).toUpperCase() + momName.substring(momName.length()/2).toUpperCase();
        } else if (gender.equalsIgnoreCase("boy")) {
            babyName = momName.substring(0, momName.length()/2).toUpperCase() + dadName.substring(dadName.length()/2).toUpperCase();
        } else {
            System.out.println(babyName+"Other Genders not acceptable");
        }
            System.out.println("Suggested baby name " + babyName);
        }

}