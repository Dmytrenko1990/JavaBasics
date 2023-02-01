package class17;

public class DogTester {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    public static void main(String[] args) {
        Dog shepard=new Dog("Jack","Shepard","black",5,30);
        shepard.printInfo();
        Dog bulldog=new Dog("Rex","Bulldog","white",3,27);
        bulldog.printInfo();
        Dog husky=new Dog("Max","Husky","white",4,31);
        husky.printInfo();
        Dog poodle=new Dog("Chaki","Poodle","grey",2,7);
        poodle.printInfo();
        Dog labrador=new Dog("Brown","Labrador","brown",4,28);
        labrador.printInfo();

    }
}
