package homeWorkClass19;
/*Write program for multilevel inheritance where class C inherits from class B
        and Class B inherits from Class A.*/

public class Car {
    String brand;
    String model;
    int year;
    void moveForward(){
        System.out.println("Car is moving");
    }
}
class TypeOfCar extends Car{
    String type;
    int numOfPassengers;
    void track(){
        System.out.println("Can carry cargo");
    }
}
class Features extends TypeOfCar{
    boolean cruiseControl;
    boolean carPlay;
    void audioSystem(){
        System.out.println("High quality sound of music");
    }
}