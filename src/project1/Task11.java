package project1;

public class Task11 {
   /* Write a program to print out duplicate elements from an Array of Strings?*/
   public static void main(String[] args) {
       String[]arr={"Hello","Hi","Good morning","Hi","Hey","Hello","Hi"};
       int size= arr.length;
       for(int i=0;i<size;i++){
           for(int j=i+1;j<size;j++){
               if(arr[i].equalsIgnoreCase(arr[j])){
                   System.out.println(arr[i]);
                   break;
               }
           }
       }
   }
}
