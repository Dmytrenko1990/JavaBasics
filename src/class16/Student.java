package class16;

public class Student {
    String name;
    String id;
    static String schoolName;
    int age;
    double weight;

    void printName() {
        int SSI=12345678;
        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printStudentInfo() {
      //  System.out.println(name); Can't access here
        System.out.println(schoolName);
    }
}