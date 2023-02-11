package homeWorkClass20;
/*
Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
        Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
        Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!
*/
public class Employee {
    String name;
    String lastName;
    int employeeID;

    Employee(String name, String lastName, int employeeID) {
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    void displayEmployee() {
        System.out.println(name + " " + lastName + " has employee Id: " + employeeID);
    }
}
class FullTimeEmployees extends Employee{
    double amountOfHours;
    FullTimeEmployees(String name, String lastName,int employeeID,double amountOfHours){
        super(name,lastName,employeeID);
        this.amountOfHours=amountOfHours;
    }
    void workedHours(){
        System.out.println(name+" "+lastName+" with employee ID: "+employeeID+" worked "+amountOfHours+" hours");
    }
}
class PartTimeEmployees extends Employee{
    int numOfWorkedDays;
    PartTimeEmployees(String name,String lastName,int employeeID,int numOfWorkedDays){
        super(name,lastName,employeeID);
        this.numOfWorkedDays=numOfWorkedDays;
    }
    void workedDays(){
        System.out.println(name+" "+lastName+" "+" with employee ID: "+employeeID+" worked "+numOfWorkedDays+" days");
    }
}
/*class Tester extends FullTimeEmployees{
    double rate;


}
    */

