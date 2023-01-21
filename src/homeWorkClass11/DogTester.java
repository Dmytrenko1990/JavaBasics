package homeWorkClass11;

public class DogTester {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Rex";
        dog1.breed="Bulldog";
        dog1.color="White";
        dog1.age=2;
        dog1.eat();

        Dog dog2=new Dog();
        dog2.name="Max";
        dog2.breed="Husky";
        dog2.color="Grey";
        dog2.age=4;
        dog2.walk();

        Dog dog3=new Dog();
        dog3.name="Jack";
        dog3.breed="Labrador";
        dog3.color="Brown";
        dog3.age=3;
        dog3.friendly();
    }
}
