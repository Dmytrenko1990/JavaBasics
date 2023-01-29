package homeWorkClass15;

import java.util.Scanner;

//Create a method that will print whether given String is palindrome or not.
public class Task3 {
    boolean isPalindrome(String str){
        String revStr="";
        for (int i =str.length()-1; i>=0 ; i--) {
           revStr+=str.charAt(i);
        }
        if(str.equals(revStr)){

        return true;
    }else{
        return false;}
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scan.nextLine();
        Task3 task3=new Task3();
        System.out.println(task3.isPalindrome(str));

    }
}
