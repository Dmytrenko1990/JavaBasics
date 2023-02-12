package homeWorkClass23;
/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
        Define common behavior within and some fields in parent class and override some of the methods in child classes
        Define some methods specific to child classes
        Create objects of child classes and store them into array. Loop through each object and execute available methods.
*/
public class Computer {
    public void turnOn(){
        System.out.println("Computer turning ON");
    }
    public void turnOff(){
        System.out.println("Computer turning Off");
    }
    public void connectToInternet(){
        System.out.println("Computer connecting to internet");
    }
    public void printFile(){
        System.out.println("Computer send file for Printing.......");
    }
}
class Apple extends Computer{
    @Override
    public void turnOn() {
        System.out.println("Apple turning ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Apple turning Off");
    }
    public void performance(){
        System.out.println("Apple has high performance");
    }
}
class Lenovo extends Computer{
    @Override
    public void connectToInternet() {
        System.out.println("Lenovo connecting to internet");
    }
    public void screen(){
        System.out.println("Lenovo has an average display quality ");
    }
    }

class HP extends Computer{
    @Override
    public void printFile() {
        System.out.println("HP send file for Printing.......");
    }
    public void durability(){
        System.out.println("HP computer are not durable");
    }
}
class Dell extends Computer {
    public void price() {
        System.out.println("Dell is budget computer");

    }
}