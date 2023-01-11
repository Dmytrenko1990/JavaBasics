package homeWorkClass6;

public class WorkDay {
    public static void main(String[] args) {
        boolean workDay = true;
        int day = 1;
        while (day <= 6) {
           // System.out.println(day+"   I need day off");
            if (day==6){
                System.out.println(day+"    I do not need a day off any more");
            }
            else {
                System.out.println(day+"   I need day off");}
            day++;

        }
    }
}