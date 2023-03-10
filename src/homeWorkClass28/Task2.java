package homeWorkClass28;

import java.util.ArrayList;
import java.util.Iterator;

/*Create an arraylist of cars and retrieve all the values using 3 different ways.*/
public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Porsche");
        cars.add("LandRover");
        for(String car:cars){
            System.out.print(car+" ");
        }
        System.out.println();
        int i=0;
        while(i<cars.size()){
            System.out.print(cars.get(i)+" ");
            i++;
        }
        System.out.println();
       /* Iterator<String> iter = cars.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }*/
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
