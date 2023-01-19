package project1;

public class Task3 {
   // Create a 2D array of integer values. Print the sum of all numbers.
   public static void main(String[] args) {
       int[][]arr={{2,45,34,22},
               {23,18,2,34},
               {11,4,7}};
       int sum=0;
       for (int i=0;i< arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
            sum=sum+arr[i][j];
           }
       }
       System.out.println("The sum of all arrayelements:"+sum);
   }
}
