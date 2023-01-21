package project1;

import java.util.Arrays;

public class Class8 {
    /*Write a Java Program to print the first 10 numbers of Fibonacci series.*/
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        int[]arr1=new int[10];
        for (int i=1;i< arr1.length;i++){
            arr1[i]=arr[i]+arr[i+1];
        }
        System.out.println(Arrays.toString(arr1));

    }
}
