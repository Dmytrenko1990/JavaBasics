package review8;

public class Store {
    public static void main(String[] args) {
        Furniture chair=new Chair();  //upcasting
        chair.assemble();  //from furniture (Parent) class
        chair.comfort();   //from furniture (Parent) class   runtime polymorphism

        Furniture table=new Table();
        table.assemble(); //runtime polymorphism
        table.comfort();

        Table tbl=new Table();
        tbl.assemble();
        tbl.buildTable();
        tbl.comfort();
        tbl.buildTable("Wood");

        Chair.breaks();
        Furniture.breaks();
        //proof that method breaks is not overriden
        chair.breaks();// since we are not overriding method breaks will be executed from parent
                        // this is also not the right way to call static method
    }
}
