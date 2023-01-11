package homeWorkClass5;

import java.util.Scanner;

public class Values {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three distinct double values");
        double val1=input.nextDouble();
        double val2= input.nextDouble();
        double val3= input.nextDouble();
        if (val1>val2 && val1>val3){
            System.out.println("The largest value is "+val1);
        }
        else if (val2>val1 && val2>val3){
            System.out.println("The largest value is "+val2);
        }
        else if(val3>val1 && val3>val2){
            System.out.println("The largest value is "+ val3);
        }
        else {
            System.out.println("You enter not distinct value");
        }


    }
}
