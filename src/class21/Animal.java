package class21;

public class Animal {
    String name;
    String color="black";
}
class Cat extends Animal{
    String color="white";
    int age=18;
    double weight;
    void printColor(){
        String color="Blue";
       // System.out.println(color); //  refers to local var => blue
       // System.out.println(this.color);  //refers to instance var => white
        System.out.println(super.color);  //refers to parent var => black
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.printColor();
    }
}
