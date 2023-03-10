package homeWorkClass28;

import java.util.ArrayList;

/*Create an arrayList of words. Remove every word that ends with “e”.*/
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("Box");
        words.add("Apple");
        words.add("Java");
        words.add("Complete");
        words.add("Task");

        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);
    }
}
