package homeWorkClass15;

import java.util.Scanner;

/*
Create a method that will say Hello in different language based on the country
        that will passed when method is executed
*/
public class Task4 {
    String sayHello(String country) {
        String language;
        switch (country.toLowerCase()) {
            case "usa":
                return "Hello";
            case "spain":
                return "Buenas dias";
            case "Italiy":
                return "Ciao";
            case "france":
                return "Bonjour";
            case "german":
                return "Guten Tag";
            default:
                return "country is unknow";
        }
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.sayHello("Italy"));
    }
}
