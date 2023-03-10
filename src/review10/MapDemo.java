package review10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Double> grocery=new HashMap();
        //var grocery=new HashMap<String,Double>(); Another way
        //to store values in the map
        grocery.put("Milk",5.99);
        grocery.put("Eggs",6.50);
        grocery.put("Bread",2.99);
        grocery.put("Tea",4.99);
        grocery.put("Cucumber",2.49);
        grocery.put("Eggs",7.49);
        grocery.put("Tomato",2.49);

        double teaPrice=grocery.get("Tea");
        System.out.println(teaPrice);

        int size=grocery.size();
        System.out.println("Number of entry objects= "+size);

        Map<String,Double>lmap=new LinkedHashMap<>();
        lmap.put("Milk",5.99);
        lmap.put("Eggs",6.50);
        lmap.put("Bread",2.99);
        lmap.put("Tea",4.99);
        lmap.put("Cucumber",2.49);
        lmap.put("Eggs",7.49);
        lmap.put("Tomato",2.49);
        System.out.println("Order is preserved "+lmap);

        Map<String,Double>tmap=new TreeMap<>();
        tmap.putAll(grocery);
        tmap.putAll(lmap);
        System.out.println(tmap.size());
    }
}
