package homeWorkClass29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/*Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
         Each student object should have name and studentID. Display name of each student.*/
public class Task3 {
     public static void main(String[] args) {

         //HashSet<Student>students=new HashSet<>();
         Set<Student> students=new HashSet<>();
         students.add(new Student("John Snow",123));
         students.add(new Student("Tim Baker",546));
         students.add(new Student("Rodger Turner",348));
         students.add(new Student("Mike Dunkin",405));

         for (Student student : students) {
             System.out.println(student.getName());
         }
     }
}
    class Student{
        public String name;
        public int studentId;

        public Student(String name, int studentId) {
            this.name = name;
            this.studentId = studentId;
        }
        public String getName(){
            return name;
        }
        public int getStudentId(){
            return studentId;
        }
    }
