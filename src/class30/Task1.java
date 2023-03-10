package class30;

import java.util.*;

/*Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.*/
public class Task1 {
    public static void main(String[] args) {

        Map<String, String> countries = new TreeMap<>();
        countries.put("Germany", "Berlin");
        countries.put("Portugal", "Lisbon");
        countries.put("UK", "London");
        countries.put("France", "Paris");
        countries.put("India", "New Delhi");
        //Set<Map.Entry<String,String>> entrySet=countries.entrySet();
        var entrySet = countries.entrySet();
        for (var entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        var iterator=countries.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
    }