package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {
        MethodPractice mp = new MethodPractice();
        boolean isEven= mp.isEven(15);
        System.out.println(isEven);
        System.out.println(mp.isEven(100));  //another way

        boolean isEven100= mp.isEven(100);
        System.out.println(isEven100);

        boolean isEven12= mp.isEven(12);
        System.out.println(isEven12);

        boolean isEven20= mp.isEven(20);
        System.out.println(isEven20);


    }
}