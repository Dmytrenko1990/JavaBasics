package class13;
/*Write a program that reads two people's first
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

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String dadName="Daniel";
        String momName="Mary";
        String expectation="Boy";
        String firstHalf="";
        String secondHalf="";
        if(expectation.equalsIgnoreCase("boy")){
            firstHalf=dadName.substring(0,dadName.length()/2);
            secondHalf=momName.substring(momName.length()/2);
;        }
        else{
            firstHalf=momName.substring(0,momName.length()/2);
            secondHalf=momName.substring(momName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);
    }
}
