package homeWorkClass13;

public class Task6 {
    //How would you swap  2 strings without a temporary variable?
    public static void main(String[] args) {
        String str1="Java";
        String str2="Lava";
        System.out.println("Strings berofe swap: 1st String: "+str1+", the 2nd String: "+str2);
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("Strings berofe swap: 1st String: "+str1+", the 2nd String: "+str2);

    }
}
