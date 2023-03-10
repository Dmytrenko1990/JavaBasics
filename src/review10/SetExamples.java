package review10;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        //Set is collection of unique elements
        Set<String> qaJobs=new HashSet<>();// does not maintain order
        //adding object/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        qaJobs.add("DataBase Tester");

        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println("Removed an element "+qaJobs);
        qaJobs.add("API Tester");
        qaJobs.add("API Tester");

        System.out.println("Added duplicates "+qaJobs);
        //creating an Object and passing collection as a parameter to invoke parametrized constructor
        Set<String>lset=new LinkedHashSet<>(qaJobs);  //maintain the insertion order
        System.out.println("LinkedHashSet= "+lset);

        Set<String>tSet=new TreeSet<>();
        tSet.addAll(qaJobs);
        System.out.println("TreeSet= "+tSet);


    }
}
