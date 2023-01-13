package review3;

import java.net.Socket;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            System.out.println("Hello "+i);
        }
        for (int i=1; i<=6;i++){
            if(i%2==0){
                System.out.println("even number");
            }
        }
    }
}
