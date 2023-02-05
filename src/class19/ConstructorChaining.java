package class19;

public class ConstructorChaining {
    ConstructorChaining(){
        System.out.println("I am non argument constructor");
    }
    ConstructorChaining(String str){
        this();// making a call to non argument constructor
                //->ALWAYS must be on first line
        System.out.println(str);
    }
    ConstructorChaining(String str,int number){
        this(str);
        System.out.println("This is constructor with int parameter"+number);
    }

    public static void main(String[] args) {
        ConstructorChaining obj=new ConstructorChaining("hello",10);
        System.out.println("--- End of the code ---");
    }
}
