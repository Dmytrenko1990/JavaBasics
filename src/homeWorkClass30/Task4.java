package homeWorkClass30;
/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.*/

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task4 {
    public static void main(String[] args) {
        LinkedHashSet<String>words=new LinkedHashSet<>();
        words.add("Hello");
        words.add("World");
        words.add("from");
        words.add("Java");
        String newString="";
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String word=iterator.next();
            newString=newString+word;
            }
        System.out.println(newString);
        }
    }

