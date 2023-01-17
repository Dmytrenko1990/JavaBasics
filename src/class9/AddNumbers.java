package class9;

import java.net.Socket;

public class AddNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<10;i++){
            sum=sum+i;  // can also be written like: sum=+i
         }
        System.out.println(sum);
    }
}
