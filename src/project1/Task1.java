package project1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Using Scanner create an array of integer values.
        After the array is created, calculate the sum of
        all stored elements in that array.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int arrSize= scan.nextInt();
        System.out.println("Please enter elements of array");
        int[]arr=new int[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i]= scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of all array elements is: "+sum);
    }
}
