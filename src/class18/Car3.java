package class18;

public class Car3 extends Car{
    void parkAutomatically(){
        System.out.println("Car is parked");
    }

    public static void main(String[] args) {
        Car3 car3 = new Car3();
        car3.parkAutomatically();
        car3.moveForward();
        car3.moveBack();
    }
}
