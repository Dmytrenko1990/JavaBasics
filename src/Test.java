public class Test {
        String make;
        String model;
        int numOfDoors;
        int topSpeed;
        double price;

        Test(String make, String model, int numOfDoors, int topSpeed, double price) {
            this.make=make;
            this.model=model;
            this.numOfDoors=numOfDoors;
            this.topSpeed=topSpeed;
            this.price=price;
        }

        Test(String make, String model,int topSpeed, double price) {
            this.make=make;
            this.model=model;
            numOfDoors=4;
            this.topSpeed=topSpeed;
            this.price=price;
        }
        Test( int numOfDoors, int topSpeed, double price) {
            make="unknown";
            model="unknown";
            this.numOfDoors=numOfDoors;
            this.topSpeed=topSpeed;
            this.price=price;
        }
        Test(String make, String model, int numOfDoors) {
            this.make=make;
            this.model=model;
            this.numOfDoors=numOfDoors;
            topSpeed=90;
            price=0;
        }
        void display(){
            System.out.println(make+" "+model+" "+numOfDoors+" "+topSpeed+" "+price);
        }
    }
    class Ma{
        public static void main(String[] args) {
            Test car1=new Test("Toyota","Prius",4,120,30000);
            car1.display();
            Test car2=new Test("Toyota","Prius",120,30000);
            car2.display();
            Test car3=new Test(4,120,30000);
            car3.display();
            Test car4=new Test("Toyota","Prius",4);
            car4.display();
        }

    }
