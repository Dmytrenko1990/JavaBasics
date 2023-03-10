package homeWorkClass29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.*/
public class Task1 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Germany");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Japan");
        System.out.println(countries);
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
