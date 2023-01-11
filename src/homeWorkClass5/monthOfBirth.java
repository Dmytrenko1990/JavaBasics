package homeWorkClass5;

import java.util.Scanner;

public class monthOfBirth {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please, enter yours birth month");
        String birthMonth=input.nextLine();
        String season;
        if (birthMonth.equals("December") || birthMonth.equals("January") || birthMonth.equals("February")){
            season="Winter";
        }
        else if (birthMonth.equals("March") || birthMonth.equals("April")|| birthMonth.equals("May")){
            season="Spring";
        } else if (birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")) {
            season="Summer";
        } else if (birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November")) {
            season="Fall";
        }
        else {
          season="Invalid month";
        }
               System.out.println("You were born in the "+ season);

    }



}
