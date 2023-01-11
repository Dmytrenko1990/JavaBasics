package class5;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day");
        String day=sc.next();
      //  String day="Sunday";
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class today");
        } else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class enjoy");
        }
        else if(day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual testing class");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review class");

        }
        else{
            System.out.println("Wrong day");
        }
        sc.close();
    }
}
