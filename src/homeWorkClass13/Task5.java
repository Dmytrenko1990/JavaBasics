package homeWorkClass13;

public class Task5 {
    /*How would you check if String is palindrome or not? aba=> true
    Abbc =>false*/
    public static void main(String[] args) {
      String str="acbca";
        String reverseStr=new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            System.out.println(str+" is a palindrome");
        }

    }
}
