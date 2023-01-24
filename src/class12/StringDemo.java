package class12;

public class StringDemo {
    public static void main(String[] args) {
        String str=new String("Java");
        //another way of creating an object ofString class a shorter way
        //mostky this is how we create the objects of String class
        String strObj2="Java";
        System.out.println(strObj2.length());
        String str1="Banana ";
        int len=str1.length();
        System.out.println(len);
        String name="Rafik";
        if(name.length()>10){
            System.out.println("Name can't be less then 6 letters");

        }
    }
}
