package review7;

public class Methods {
    //user defined: with return type and without
    //                with parameters and without
    void hello(){
        System.out.println("Hello");
    }
    void sayHello(String name){
        System.out.println("Hello"+name);
    }
        //create method that returns the largest number between two given num
    int findLargest(int num1,int num2){
        if (num1>num2){
            return num1;}
        else {return num2;}
    }
    //create a method that returns an average value of 2 decimal num
    double avr(double num1,double num2){
        return ((num1+num2)/2);
    }
    //returns revers string from given string
    String revStr(String str){
        StringBuilder sb=new StringBuilder(str);
       return sb.reverse().toString();
    }
    // create a method that will return min value from given array
    static int minVal(int[]arr){
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<min){
            min=arr[i];
            }
        }return min;
    }
    public static void main(String[] args) {
        String name="Mohammed";
        int characters=name.length();
        System.out.println(characters);
        Methods obj =new Methods();
        obj.sayHello(name);

        System.out.println(obj.findLargest(100,200));
        System.out.println(obj.avr(10,30));
        System.out.println(obj.revStr("Hello"));

        int[]arr={10,23,56,34};
        Methods.minVal(arr);
        int minimum=minVal(arr);
        System.out.println("Minimum number= "+minimum);


    }
}
