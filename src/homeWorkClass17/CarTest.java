package homeWorkClass17;

public class CarTest {
    public static void main(String[] args) {


        Car car1=new Car("BMW","M5","black",2022);
        car1.printInfo();
        Car car2=new Car("Mercedes","S550","silver",2023);
        car2.printInfo();
        Car car3=new Car("Audi","S8","white",2021);
        car3.printInfo();
        

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
        Car toyota=new Car();
        toyota.name="Toyota";
        toyota.model="Camry";
        toyota.color="red";
        toyota.year=2020;
        toyota.printInfo();

    }
}
