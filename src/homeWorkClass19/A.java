package homeWorkClass19;
/*Write program to inherit class A that has method printF which is
        static and call or reuse that method into class B*/

public class A {
    static void printF() {
        System.out.println("Calling method F from class A");

    }
}
class ClassB extends A {
    void printInfo(){
        System.out.println("Syntax is great");
    }
}

