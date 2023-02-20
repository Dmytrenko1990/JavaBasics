package class28;

import class26.Dog;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("10");

        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

     /*   ArrayList name=new ArrayList();
        name.add("Zafar");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jackly","Green","unknown"));
       for(Object j:name){
           System.out.println(j);
           ((String)j).trim();//type cast
       }*/
    }
}
