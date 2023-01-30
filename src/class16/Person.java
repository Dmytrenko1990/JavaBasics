package class16;

public class Person {
    private double bankBalance=12500000;
    String address="Street 123"; //default access level is applied
    public String name="John Snow";

    private void printPhonePassword(){
        System.out.println("password is 123");
    }
    void printSSN(){
        System.out.println("123456");
    }
    void printTikTokAccount(){
        System.out.println("user123");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();
    }
}
