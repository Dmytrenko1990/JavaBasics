package review9;

import java.util.ArrayList;

public class ArrayListDemo {
    //The Integer class wraps a value of primitive type int in an object
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();

        //to store values inside an arrayList
        alist.add(12);
        alist.add(13);
        alist.add(14);
        //how to find size of arrayList
        int size=alist.size();
        System.out.println("The size of alist is "+size);
        //to access values
        int firstElement=alist.get(0);
        System.out.println(firstElement);
        //replacing  value of first element
        alist.set(0,120);
        firstElement=alist.get(0);
        alist.get(firstElement);
        //remove element
        alist.remove(2);
        System.out.println(alist);
    }
}
