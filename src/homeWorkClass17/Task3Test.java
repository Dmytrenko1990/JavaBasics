package homeWorkClass17;

public class Task3Test {
    public static void main(String[] args) {
        Task3 task3Def=new Task3("John");
       // Task3 task3Private=new Task3(1990);------------error
        Task3 task3Prot=new Task3("John",1992);
        Task3 task3Pub=new Task3(190.0);
    }
}
