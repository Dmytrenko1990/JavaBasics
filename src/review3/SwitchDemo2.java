package review3;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your favorite browser");
        String browser= scan.nextLine();
        switch (browser.toLowerCase()){
            case "chrome":
                System.out.println("The case executed in "+browser);
                break;
            case "safari":
                System.out.println("The case executed in "+browser);
                break;
            case "microsoft edge":
                System.out.println("The case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown - no execution");

        }
    }
}