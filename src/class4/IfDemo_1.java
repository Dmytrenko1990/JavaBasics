package class4;

public class IfDemo_1 {
    public static void main(String[] args) {
        int money = 15000;
        if (money > 1000) {
            System.out.println("Lets buy an Iphone");
        }
        if (money > 2000) {
            System.out.println("Lets also buy a Macbook");
        }
        String name = "Sardar";
        //equals metod is only used for non-primitives data type
        if (name.equals("Sardar")) {
            System.out.println("I love football");
        }
    }
}
