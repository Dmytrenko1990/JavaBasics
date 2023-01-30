package class16;
/*Create a Class called SyntaxEmployee:
        Create three  variables  empID , salary and set the CEO to “Sumair”
        Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
        Print out the eID , salary and  CEO for each of the objects*/
public class SyntaxEmployee {
    String empID;
    int salary;
    static String ceo="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID="123455";
        emp1.salary=120000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID="345677";
        emp2.salary=110000;


        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(ceo);
    }

}
