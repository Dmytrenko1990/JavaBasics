package class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        //does not allow duplicates and retains insertion order
        LinkedHashSet<String>fruits=new LinkedHashSet<>();
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Apple");
        System.out.println(fruits);
    }
}
