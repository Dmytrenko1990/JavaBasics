package homeWorkClass17;
   /* Write a java class that will have a constructor: one with parameters and second without any parameters.
        Create a separate Test class where you will execute both of the constructors 1 by 1.*/
public class Car {
    String name;
    String model;
    String color;
    int year;

    Car(String carName,String carModel,String carColor,int carYear) {
        name = carName;
        model=carModel;
        color=carColor;
        year=carYear;
    }
    Car(){
    }
    void printInfo(){
        System.out.println(name+" "+model+" "+color+" "+year);
    }
       public void foo(String a,String b){}
}