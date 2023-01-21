package homeWorkClass11;

public class Task5 {
   /* Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
    Develop a program which will identify/print the even numbers only.*/
   public static void main(String[] args) {
       int [][]numbers={{3,24,6,45},
               {7,11,33,18},
               {15,21,8,4}};
       for(int i=0;i<numbers.length;i++) {
           for (int j = 0; j < numbers[i].length; j++) {
               if(numbers[i][j]%2==0){
                   System.out.print(numbers[i][j]+" ");
               }
           }
       }
       }
}
