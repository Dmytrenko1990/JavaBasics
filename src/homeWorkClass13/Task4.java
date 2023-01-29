package homeWorkClass13;
//How would you reverse a String word by word? for example
// input=>This is sentence i want to reverse
// output=>sihT si ecnetnes i tnaw ot esrever

public class Task4 {
    public static void main(String[] args) {
        /*StringBuilder sb= new StringBuilder("This is sentence i want to reverse");
        System.out.println(sb.reverse());
        String str=sb.toString();//converting a StringBuilder to String so that we can call method from String
        str.split()*/
        String str="This is sentence i want to reverse";
        String[]arr=str.split(" ");
        /*for(String word:arr){
         for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
            System.out.println(" ");
        }*/
       /* for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }*/
        for (String word:arr) {
            System.out.println(new StringBuilder(word).reverse() + " ");
        }
    }
}