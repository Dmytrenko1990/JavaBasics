public class Test {
    static String mixString(String s1,String s2){
        String combinedStr=" ";
        for (int i = 0; i <s1.length() ; i++) {
            combinedStr=combinedStr+Character.toString(s1.charAt(i))+Character.toString(s2.charAt(i));
        }
        return combinedStr;
        }

    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }


}



