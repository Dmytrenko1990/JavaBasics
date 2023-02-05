package class19;

public class ThisKeyWord {
    int a,b;
    ThisKeyWord(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void sum(int a,int b) {
        System.out.println("Sum of local variables: " + a + b);
        System.out.println("Sum of instance variables: " + this.a + this.b);
    }
        void hello(){
            System.out.println("helo batch 15");
        }
        void howAreYou(){
            System.out.println("How are you batch 15");
        }
        void greetings(){
         this.hello();  //.this key word refers to the current instance method
         this.howAreYou();  //.this key word refers to the current instance method
        }

    public static void main(String[] args) {
        ThisKeyWord obj=new ThisKeyWord(10,20);
        obj.sum(100,200);
        //------------
        obj.greetings();
    }
}
