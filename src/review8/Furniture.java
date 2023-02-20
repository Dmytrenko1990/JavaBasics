package review8;

public class Furniture {
    public void assemble(){
        System.out.println("Furniture needs to be assembled");
    }
    public void comfort(){  //overriden
        System.out.println("Furniture needs to be comfortable");
    }
    private void use(){
        System.out.println("Furniture is used by humans");
    }
    public  static void breaks(){
        System.out.println("Furniture breaks");
    }
}
class Chair extends Furniture{
    //we can not override static methods
    public static void breaks(){
        System.out.println("Chair can break too");
    }
    //we are not overriding method use we redeclearing
    private void use(){
        System.out.println("Furniture is used by humans to seat");
    }

    @Override
    public void comfort() {  //overriding
        System.out.println("Not every chair is comfortable");
    }
    protected void loveSeat(){
        System.out.println("This is a best chair");
    }
}
class Table extends Furniture{
    @Override
    public void comfort() {
        System.out.println("Table can't be comfortable");
    }
    protected void buildTable(){
        System.out.println("We can build a table");
    }
    void buildTable(String material){             //overloading
        System.out.println("We build table from "+material);
    }
}
