package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="Send it to support chanel.More java";
        String newStr=str.substring(26);
        System.out.println(newStr);
        //we can specify starting and ending point
        System.out.println(str.substring(0,26));
    }
}
