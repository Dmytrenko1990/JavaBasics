package homeWorkClass11;

import java.util.Arrays;

public class Task2 {
    /*Create 2D array of cars : american, german, korean, italian.
    Then retrieve all values from that array using 2 different loops*/

    public static void main(String[] args) {
        String[][] cars = new String[4][];
        String[] american = {"Ford", "GMC", "Dodge", "Chevrolet"};
        String[] german = {"Mercedes", "BMW", "Audi", "VW"};
        String[] korean = {"Kia", "Hyundai", "Genesis"};
        String[] italian = {"Maserati", "Alfa Romeo", "Ferrari", "Lamborghini"};
        cars[0] = american;
        cars[1] = german;
        cars[2] = korean;
        cars[3] = italian;
      /*  String cars[][]={{"american", "german", "korean", "italian"},
                {"Ford","Mercedes","Kia","Ferrari"}};*/
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println( "******************************");
        for (String[]arr : cars) {
            for(String x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}