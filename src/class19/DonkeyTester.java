package class19;

public class DonkeyTester {
    public static void main(String[] args) {
      /* Donkey donkey=new Donkey();  // default constructor creates by the compiler
                       // when a programmer does not create one*/
        Donkey donkey=new Donkey("Pepper",3);// the moment YOU create constructor compiler does not give only DEFAULT consrtuctor
        donkey.print();
        //Donkey's name is null age is 0 and weight 0.0
    }
}
