package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    //LinkedList 14ms
    //ArrayList 916ms
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i <100000 ; i++) {
            numbers.add(0,"Test Data");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);


    }
}
