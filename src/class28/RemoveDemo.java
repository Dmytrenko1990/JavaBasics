package class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedMap;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Lava");
        words.add("Computer");

        var name="hgfhg";
        var c='s';
        var f=12.5;

        /*Iterator<String>iterator= words.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }
*/
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);
    }
}
