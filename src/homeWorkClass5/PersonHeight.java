package homeWorkClass5;

import java.util.Scanner;

public class PersonHeight {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please, enter tour height");
        double height= input.nextDouble();
        if (height<60){
            System.out.println("You are short");
        }
        else if(height>=60 && height<=72){
            System.out.println("You have medium height");
        }else {
            System.out.println("You are tall");
        }
        Scanner close;
    }
}
