package homeWorkClass30;

import java.util.ArrayList;

/*Create a collection of integers in which you can keep duplicates.
        Write a logic to find sum of all integers*/
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(4);
        int sum=0;
        for(Integer x:numbers){
           sum=sum+x;
        }
        System.out.println("Sum of all elements is: "+sum);
    }
}
