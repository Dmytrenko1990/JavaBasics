package review8;

import review7.Car;
import review7.Tesla;

public class CarTest {
    public static void main(String[] args) {
        Bmw bmw=new Bmw("BMW","X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake();  //comes from BMW which is subclass

        Car car=new Car("SomeCar","SomeModel");
        car.start();
        car.drive(90);

        Tesla tesla=new Tesla("Tesla","model S",2022,350,"electric",true);
        tesla.start();    //overrided from Tesla class is executed
        tesla.drive(90);  //comes from Parent class
        tesla.haveAutoPilot();  //comes from Tesla class
        //Runtime polymorphism archived through method overriding
        //casting: widening and narrowing-used with primitives
        //    upcasting and downcasting- use with non primitives
        Car bmw1=new Bmw("Bmw","X5");  //upcasting
        bmw1.start();
        bmw1.drive(100);
    }
}
