package homeWorkClass17;
/*Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
        and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
        3 - from different class inside different package  and observe result.*/

public class Task3 {
    String name;
    int bYear;
    double weight;
    Task3(String perName){
        name=perName;

    }
    private Task3(int perBYear){
        bYear=perBYear;
    }
    protected Task3(String perName,int perBYear){
        name=perName;
        bYear=perBYear;
    }
    public Task3(double perWeight){
        weight=perWeight;
    }

    public static void main(String[] args) {
        Task3 task3Def=new Task3("John");
        Task3 task3Private=new Task3(1990);
        Task3 task3Prot=new Task3("John",1992);
        Task3 task3Pub=new Task3(190.0);
    }

}


