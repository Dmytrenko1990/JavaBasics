package review7;

public class Car {
    String make,model;
    int year,horsePower;
        public Car(String name,String model){
            this.make=make;
            this.model=model;
        }
        public Car(String make,String model,int year,int horsePower){
            this(make,model);  //make call to the current class constructor
            this.year=year;
            this.horsePower=horsePower;  //accessing current class instance variables
        }
        public void start(){
            System.out.println(make+" starts");
        }
    public void drive(int speed){
        System.out.println(make+" drives with speed "+speed);
        }
        //Same class have 2 or more methods with the same name= Method Overloading
    // 1. by using different number of parameters
    // 2. by using different type of parameters
    // 3. sequence
        void drive(String destination){
            System.out.println(make+" drives to "+destination);
        }
}
