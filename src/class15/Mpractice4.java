package class15;

public class Mpractice4 {
    // create method that takes two num as parameters and return larger num
    int largerNum(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Mpractice4 mp4=new Mpractice4();
        System.out.println(mp4.largerNum(2,3));
    }
}
