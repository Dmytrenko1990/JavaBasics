package homeWorkClass19;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Tundra";
        car.year=2021;
        car.moveForward();

        TypeOfCar type = new TypeOfCar();
        type.brand="Toyota";
        type.model="Tacoma";
        type.year=2022;
        type.moveForward();
        type.numOfPassengers=5;
        type.type="truck";
        type.track();

        Features features=new Features();
        features.brand="Mercedes";
        features.model="GLE 350";
        features.type="SUV";
        features.carPlay=true;
        features.cruiseControl=true;
        features.audioSystem();
    }
}