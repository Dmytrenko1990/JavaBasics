package homeWorkClass15;
//Create a method that will take 2 parameters as a numbers and prints which number is larger.
public class Task1 {
    int largerNum(int num1,int num2){
        if(num1>num2){
            return num1;}
        else{return num2;}
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        System.out.println(task1.largerNum(10,20)+" is larger number");
    }
}
