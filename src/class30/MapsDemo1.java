package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {
        Map<Integer,String>studentMap=new HashMap<>();
        studentMap.put(1,"Nezir");
        studentMap.put(2,"Anush");
        studentMap.put(3,"Tami F");
        studentMap.put(4,"Aisha");

        System.out.println(studentMap);
        System.out.println(studentMap.get(3));
        System.out.println(studentMap.size());
        System.out.println(studentMap.containsKey(5));
        System.out.println(studentMap.containsValue("Aisha"));
        System.out.println(studentMap.remove(1));
        System.out.println(studentMap);
        System.out.println(studentMap.replace(2,"Asli"));
        System.out.println(studentMap);
    }
}
