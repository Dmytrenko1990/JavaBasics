package homeWorkClass30;
/*Create a map of Best Buy store. Place
        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.*/

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer,String>store=new HashMap<>();
        store.put(7664847,"Printer HP");
        store.put(6754632,"Samsung75'-LED 4K");
        store.put(2390451,"MacBook Pro M2");
        store.put(8756123,"Iphone14 ProMax");
        store.put(7345638,"LG 83' 4K OLED");

        for(Map.Entry<Integer, String> item:store.entrySet()){
            System.out.println(item.getKey()+" = "+item.getValue());
        }


    }
}
