package class20;

public class SuperClass {
    SuperClass(){
        System.out.println("I am a constructor from parent class");
    }
}
class SubClass extends  SuperClass {
    SubClass() {
        super();//makes a call to the parent class
        System.out.println("I am a child constructor");
    }
}
