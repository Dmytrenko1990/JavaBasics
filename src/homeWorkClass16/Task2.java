package homeWorkClass16;

public class Task2 {
    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.*/
public static String revStr(String str){
    return new StringBuilder(str).reverse().toString();
}

   /* public static void main(String[] args) {
        Task2 task2=new Task2();
        System.out.println(task2.revStr("Syntax"));
    }*/
}
