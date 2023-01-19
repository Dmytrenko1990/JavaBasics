package project1;

import java.util.Scanner;

public class Task2 {
    /*Using Scanner create an array of countries. When an array is
    created, retrieve all values from it and while retrieving
    those values print capital for each country.
    (use 2 different loops).*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       // String country= scan.nextLine();
        String[]arrOfCountries=new String[5];
        for(int i=0;i<5;i++){
            arrOfCountries[i]= scan.nextLine();
        }


    }
}
