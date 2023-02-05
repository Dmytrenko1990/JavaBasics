package class19;

public class Donkey {
    String name;
    int age;
    double weight;
   /* Donkey(){
        System.out.println("This is non argument constructor");
    }*/
   /* Donkey(String dokeyName,int donkeyAge){
        name=dokeyName;
        age=donkeyAge;*/
   Donkey(String name,int age){
       this.name=name; //left is instance var
       this.age=age;

    }
    void print(){
        System.out.println("Donkey name is "+name+" age is "+age+" and weight "+weight);
    }
}
