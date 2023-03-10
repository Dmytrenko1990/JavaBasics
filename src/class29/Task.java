package class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        HashSet<String>names=new HashSet<>(aList);
        System.out.println(names);

    }
}
