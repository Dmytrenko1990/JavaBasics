package homeWorkClass12;
/*Create a String and print it in reverse order (Sunday → yadnuS).*/
public class Task2 {
    public static void main(String[] args) {
        String str="Monday";
        for (int i =str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));

        }
    }
}
