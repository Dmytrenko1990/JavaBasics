package homeWorkClass5;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your scores: 1-quiz; 2-mid term; 3-final score");
        int quiz= input.nextInt();
        int midTerm= input.nextInt();
        int finalScore= input.nextInt();
        int average=(quiz+midTerm+finalScore)/3;
        if (average>=90){
            System.out.println("Your grade is 'A'");
        }
        else if (average>=70 && average<90){
            System.out.println("Your grade is 'B'");
        }
        else if (average>=50 && average<70){
            System.out.println("Your grade is 'C'");
        }
        else if (average<50){
            System.out.println("Your grade is 'E'");
        }
    }
}
