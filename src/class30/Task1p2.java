package class30;

import java.util.Map;
import java.util.TreeMap;

public class Task1p2 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("Germany", "Berlin");
        countries.put("Portugal", "Lisbon");
        countries.put("UK", "London");
        countries.put("France", "Paris");
        countries.put("India", "New Delhi");
        var values=countries.values();
        for(var value:values
        ){
            System.out.println(value);
        }
        var iterator=countries.values().iterator();
        while(iterator.hasNext());
        var value=iterator.next();
        System.out.println(value);
    }
}
