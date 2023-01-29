package homeWorkClass15;

public class TestTask3 {
    String Palindrome(String str){
        String revStr="";

        for (int j = str.length()-1; j >= 0; j--) {
            revStr =revStr+ str.charAt(j);

            if (str.toLowerCase().equals(revStr.toLowerCase())) {
                return str + " is Palindrome";
            }

        }
        return str + " is not Palindrome";
    }

    public static void main(String[] args) {
        TestTask3 test1=new TestTask3();
        System.out.println(test1.Palindrome("aabaa"));

    }
}
