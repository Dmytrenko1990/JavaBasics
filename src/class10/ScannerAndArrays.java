package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter 5 numbers");
        int[]arr=new int[5];
        //below code manualy store numbers in the array
        /*arr[0]=12;
        arr[1]=27;
        arr[2]=6;
        arr[3]=55;
        arr[4]=13;*/
        //below code take the numbers from user and store in the array it is good
        //but a lot of code
       /* arr[0]= scan.nextInt();
        arr[1]=scan.nextInt();
        arr[2]=scan.nextInt();
        arr[3]=scan.nextInt();
        arr[4]=scan.nextInt();*/
        //below code uses a normal for loop to ask user for numbers and store them in the array
        for(int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    }
}
