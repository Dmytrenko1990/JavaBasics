package class4;

public class IfElseIfConditions {
    public static void main(String[] args) {
        int day=5;  //assigning
        if(day==1){   //we compare
            System.out.println("Monday");
        }
        else if (day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if (day==5){
            System.out.println("Friday");
        }else if (day==6){
            System.out.println("Saturday");
        }else if (day==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Please enter a day number between 1 and 7");
        }

    }
}
