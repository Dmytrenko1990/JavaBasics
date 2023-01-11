package review2;

public class IfElseIf {
    public static void main(String[] args) {
        //when we have more conditions to test
        /*if(boolean condition){code A}
        else if(boolean condition){code B}
        else if(boolean condition){code c}
         */
        int a = 26;
        if (a > 25) {
            System.out.println("great job");
        } else if (a > 20) {
            System.out.println("good job");
        } else if (a > 10) {
            System.out.println("ok job");
        } else if (a > 5) {
            System.out.println("not good job");
        }
        System.out.println("---------------------------------------------");
        String browser="chrome";
        if(browser.equals("chrome")){
            System.out.println("Test cases executed on Chrome browser");
        }
        else if(browser.equals("Safari")){
            System.out.println("Test cases executed on Safari browser");
        }
        else if(browser.equals("Firefox")){
            System.out.println("Test cases executed on Firefox browser");
        }
        else {   //when none conditions are true, code comes to else block
            System.out.println("Browser is not supported");
        }

    }
}
