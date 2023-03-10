package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> fruits=new TreeSet<>();
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Apple");
        System.out.println(fruits);

    }
}
