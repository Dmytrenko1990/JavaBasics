package class20;

public class Child1 extends  Parent{
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.hello();
        Parent.buy();
        Child1.buy();// right way
        c1.buy();// not a right way to call. Right way to call through class name
        //c1.money(); has private access modifier
        c1.name="Gulzhanar";
        Child1.lastName="Berik";

    }

}
