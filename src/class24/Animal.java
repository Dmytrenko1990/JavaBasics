package class24;

public abstract class Animal {
    abstract void speak();

    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff wuff");
    }

    @Override
    void eat() {
        System.out.println("Dog eat meat");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow meow");
    }

    @Override
    void eat() {
        System.out.println("Cat eat fish");
    }
}
class Horse extends Animal{
    @Override
    void speak() {
        System.out.println("IHaaaooooo");
    }

    @Override
    void eat() {
        System.out.println("Horse eat grass");
    }
}