package HomeWorkClass13;
//How would you reverse a String word by word? for example
// input=>This is sentence i want to reverse
// output=>sihT si ecnetnes i tnaw ot esrever

public class Task4 {
    public static void main(String[] args) {
        String str = "This is sentence i want to reverse";
        StringBuilder sb= new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}