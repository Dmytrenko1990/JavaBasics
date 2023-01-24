package project1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    /*Using Scanner create an array of countries. When an array is
    created, retrieve all values from it and while retrieving
    those values print capital for each country.
    (use 2 different loops).*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[][]arrOfCountries=new String[5][2];
        for(int i=0;i<arrOfCountries.length;i++) {
            for (int j = 0; j < arrOfCountries[i].length; j++) {
                if(j==0){System.out.println("Enter the country: ");
                arrOfCountries[i][j] = scan.nextLine();}
                else{System.out.println("Enter the capital of "+arrOfCountries[i][j-1]);
                arrOfCountries[i][j]= scan.nextLine();
                }
            }

        }
        for(int i=0;i<arrOfCountries.length;i++){
        for(int j=0;j<arrOfCountries[i].length;j++){
        System.out.print(arrOfCountries[i][j]+" ");}
            System.out.println();
        }
        System.out.println("******************************************");
        for (String[] count:arrOfCountries)
             {for(String x:count){
                 System.out.print(x+" ");
             }
                 System.out.println();

        }
        }
        }


