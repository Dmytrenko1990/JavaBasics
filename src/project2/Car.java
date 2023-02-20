package project2;
/*Create a Class Car that would have the
        following fields: carPrice and color and method
        calculateSalePrice() which should be returning
        a price of the car.
        Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
        implementation of calculateSalePrice() method
        in which returned price is calculated as
        following: if weight>2000 then returned price
        car should include 10% discount, otherwise 20%
        discount.
        The Sedan class has field as length and also
        does it is own implementation of
        calculateSalePrice(): if length of sedan is >20
        feet then returned car price should include 5%
        discount, otherwise 10% discount*/
public abstract class Car {
    double carPrice;
    String color;
    abstract double calculateSalePrice();
    Car(double carPrice){
        this.carPrice=carPrice;
    }
}
class Sedan extends Car{
    double length;

    Sedan(double carPrice,double length) {
        super(carPrice);
        this.length=length;
    }
    @Override
    double calculateSalePrice() {
        if(length>20){return carPrice*0.95;}
        else{return carPrice*0.9;}
    }
}
class Truck extends Car{
    double weight;
    Truck(double carPrice,double weight) {
        super(carPrice);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
        if(weight>2000){return carPrice*0.9;}
        else {return carPrice*0.8;}
    }
}
class CarTester{
    public static void main(String[] args) {
        Car[]cars={new Sedan(30000,18),new Truck(50000,2400)};
        for(Car car:cars){
            System.out.println(car.calculateSalePrice());
        }
    }
}
