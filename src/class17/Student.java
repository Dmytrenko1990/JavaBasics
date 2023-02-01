package class17;

public class Student {
    String id;
    String name;
    int age;
    double weight;

  /*  Student(String studentId, String studentName, int studentAge) {
        id = studentId;
        name = studentName;
        age = studentAge;
    }
*/
    public Student(String studentId, String studentName, int studentAge, double studentWeight) {
        id = studentId;
        name = studentName;
        age = studentAge;
        weight = studentWeight;
    }

    public Student(String john, String studentName) {
    }

    void printInfo() {
        System.out.println("id " + id + " name " + name + " age " + age + " weight " + weight);
    }

}
