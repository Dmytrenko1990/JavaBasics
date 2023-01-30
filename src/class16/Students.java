package class16;
/*
Create a Class called Students
        Create three  variables  Name , ID  and  numberOfStudents
        Create three objects of the Students Class
        Set the value for  studentName , studentID and increment  the numberOfStudents for each object
        Print out  total number of students
*/
public class Students {
    String name;
    String ID;
    static int numberOfStudents;


    public static void main(String[] args) {
        Students nezir=new Students();
        nezir.name="Nezir";
        nezir.ID="123456";
        nezir.numberOfStudents++;


        Students tom=new Students();
        tom.name="Tom";
        tom.ID="467898";
        tom.numberOfStudents++;

        System.out.println(nezir.name);
        System.out.println(nezir.ID);
        System.out.println(numberOfStudents);



    }
}