package homeWorkClass28;

import java.util.ArrayList;

/*Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.*/
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("Fanta");
        drinks.add("Mojito");
        drinks.add("Sprite");
        drinks.add("Sunkist");
        for (int i = 0; i <drinks.size(); i++) {
            String drink=drinks.get(i);
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
