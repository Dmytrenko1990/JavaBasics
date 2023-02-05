package class18;

public class Car2 extends Car {
    void startFromPhone() {
        System.out.println("Car starting from the phone");
    }

    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.brand="Audi";
        car2.model="S8";
        car2.moveForward();
        car2.moveBack();
        car2.startFromPhone();
    }
}