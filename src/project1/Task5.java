package project1;

public class Task5 {
   /* Create a 2D array of integers. Develop a program which will
    calculate the sum of  even and odd numbers for that array.*/
   public static void main(String[] args) {
       int[][]arr={{23,4,7,12},
               {56,7,23,9},
               {4,45,2,11}};
       int sumOfOdd=0;
       int sumOfEven=0;
       for(int i=0;i< arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]%2!=0){
                   sumOfOdd=sumOfOdd+arr[i][j];
               }
               else {sumOfEven=sumOfEven+arr[i][j];}
           }
       }
       System.out.println("The sum of odd numbers from array is: "+sumOfOdd);
       System.out.println("The sum of even numbers from array is: "+sumOfEven);

   }
}
