package review3;

import java.net.Socket;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=4){
            System.out.println("Hello");
            i++;
        }
        Scanner scn=new Scanner(System.in);
        System.out.println("Are you tired?");
        boolean tired= scn.hasNextBoolean();
        while(!tired){
            System.out.println("This is great");
            System.out.println("Lets study Java");
            System.out.println("Are you tired?");
            tired=scn.nextBoolean();
        }

    }
}
