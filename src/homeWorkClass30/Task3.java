package homeWorkClass30;

import java.util.*;

/*
Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
        John Smith=$100000
*/
public class Task3 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Mark Baker", 85000.0);
        map.put("Bob Kelley", 97000.0);
        map.put("John Smith", 100000.0);
        map.put("Sarah Lopez", 92000.0);

        Map.Entry<String,Double> maxSalary = null;
        for(Map.Entry<String,Double> person:map.entrySet()) {
            if (maxSalary == null || person.getValue() > maxSalary.getValue()) {
                maxSalary = person;
            }
        } System.out.println(maxSalary);}
}

