package class18;

public class Car1 extends Car {
    void cruise(){
        System.out.println("Car going by self");
    }
    public static void main(String[] args) {


        Car1 car1 = new Car1();
        car1.brand="BMW";
        car1.model="M5";
        car1.moveForward();
        car1.moveBack();
        car1.cruise();

    }
}