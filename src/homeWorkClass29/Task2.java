package homeWorkClass29;

import java.util.LinkedHashSet;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
*/
public class Task2 {
    public static void main(String[] args) {
        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("Kyiv");
        cities.add("Amsterdam");
        cities.add("Denver");
        cities.add("Tampa");
        cities.add("Alanya");
        cities.add("Paris");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);

        }

        }
