package project1;

import java.util.Arrays;

public class Task8 {
    /*Write a Java Program to print the first 10 numbers of Fibonacci series.*/
    public static void main(String[] args) {
        //int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        int[]arr=new int[10];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i< arr.length;i++) {
            arr[i]=arr[i-1]+arr[i-2];
            }
            System.out.println(Arrays.toString(arr));
        }

}
