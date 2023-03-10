package class30;

import org.apache.poi.hmef.attribute.MAPIStringAttribute;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        Map<String, Double> fruit = new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Orange",2.99);
        fruit.put("Banana",4.99);
        fruit.put("Kiwi",0.99);
        fruit.put("Apple",3.99);
        System.out.println(fruit);
        fruit.put(null,null);
        System.out.println(fruit);

        HashMap<String,Double>makeup=new HashMap<>();
        makeup.put("lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.0);
        makeup.put("Blush-on",12.2);

        HashMap<String,Double>groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);

    }
}
