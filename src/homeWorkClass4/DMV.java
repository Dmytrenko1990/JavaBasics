package homeWorkClass4;

import java.util.Scanner;

public class DMV {
    /*You are DMV representative and you need to ask customer their age.
     If they are 18 and older you will issue a driver licence to them, otherwise
     you will offer them to get a learners permit.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How old are you?");
        int age= input.nextInt();
        //System.out.println(a);
        if (age>=18){
            System.out.println("You will get driver licence");
        }
        else{
            System.out.println("You will get learner permit");
        }
    }
}
