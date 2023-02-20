package class26;

public interface TrustTable {
    /*public static final*/ int age=10;// constants
    String color="Red";
   /* public abstract*/ int trust();
   static void method1(){
       System.out.println("Hello world");
   }
   default void method2(){

   }
   private  void method3(){

   }
}
class BankOfAmerica implements TrustTable{
    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustTable.method1();
        System.out.println(TrustTable.age);
    }
}
