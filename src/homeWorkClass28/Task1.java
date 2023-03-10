package homeWorkClass28;

import java.util.ArrayList;

public class Task1 {
    /*Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Sam");
        names.add("Sarah");
        names.add("Mat");
        names.add("Katy");
        names.add("Gene");
        System.out.println("Is arrayList names empty? - "+names.isEmpty());
        System.out.println("Is specific name 'Mat' is present in arrayList: "+names.contains("Mat"));
        System.out.println("Size of arrayList is:"+names.size());
        for(String name:names){
        System.out.print(name+" ");
        }
    }
}
