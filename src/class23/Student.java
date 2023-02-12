package class23;
/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
        Define common behavior within parent class and override some of the methods in child classes
        Define some methods specific to child classes
        Write example of achieving run time polymorphism*/

public class Student {
    public void study() {
        System.out.println("Studying.......");
    }
    public void doHomework() {
        System.out.println("Solving homework");
    }

    public void practice() {
        System.out.println("practicing the skills");
    }

}

class SyntaxStudent extends Student {
    @Override
    public void study() {
        System.out.println("Syntax students must study Programming");
    }

    @Override
    public void doHomework() {
        System.out.println("Syntax students must solve the homework before net class");
    }

    @Override
    public void practice() {
        System.out.println("Syntax students must practice Repls");
    }
}
    class CollegeStudent extends Student {
        @Override
        public void practice() {
            System.out.println("Collage students must practice to get good grades");
        }
    }
    class SchoolStudent extends Student{

    }