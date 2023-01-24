package class12;

public class CarTester {
    public static void main(String[] args) {
        //Create the object of the class
        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="I7";
        bmw.year=2023;
        bmw.color="grey";
        bmw.moveForward();
        bmw.applyBrakes();

        Car audi=new Car();
        audi.make="Audi";
        audi.model="RS8";
        audi.year=2022;
        audi.color="black";
        audi.moveForward();
    }
}
