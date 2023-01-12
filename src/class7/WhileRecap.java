package class7;

public class WhileRecap {
    public static void main(String[] args) {

        int num = 10;
        while (num < 20) {
            System.out.println(num < 20);
            if (num < 15) {
                System.out.println("number is still less than 15");
            } else {
                System.out.println("Number is greater than 15 now");
            }
            System.out.println(num);
            num++;

        }
    }
}
