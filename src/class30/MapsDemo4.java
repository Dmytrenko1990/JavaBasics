package class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.0);
        makeup.put("Blush-on",12.2);
        //to get all the keys we can use keySet Method from Map Interface
        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

        for(String s:allKeys){
            System.out.println(s);
        }
        System.out.println("//////////////////////");
        //delete all the entries from the map for which the size of key is greater than 7
        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);
        }
    }

