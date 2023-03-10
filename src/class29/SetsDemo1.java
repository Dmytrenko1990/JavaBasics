package class29;


import java.util.HashSet;


public class SetsDemo1 {
    public static void main(String[] args) {
        //HashSet does not allow duplicate values and it does not maintain insertion order
        HashSet<String>fruits=new HashSet<>();
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println(fruits);



    }
}
