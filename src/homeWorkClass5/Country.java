package homeWorkClass5;

import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        /*Ask user to enter their country and capture it.
        Once values are captured print which language user speaks.
        Allow user to enter grade and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        At the end your program should print which grade
        was entered by a user with explanation.
*/
    Scanner input=new Scanner(System.in);
        System.out.println("Please enter the country");
        String country=input.nextLine();
        switch (country.toLowerCase()){
            case "usa":
                System.out.println("english");
                break;
            case "spain":
                System.out.println("spanish");
                break;
            case "ukraine":
                System.out.println("ukrainian");
                break;
            case "brazil":
                System.out.println("portutuguese");
                break;
            case "india":
                System.out.println("hindi");
                break;
        }
    }
}
