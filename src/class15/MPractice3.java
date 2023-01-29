package class15;

public class MPractice3 {
    //create a method that takes an array of int sum all the elements from Array and return the sum
    int arrSum(int[]arr){
      // int[]arr={10,20,30};
        int sum=0;
        for (int num:arr) {
            sum+=num;
        }
        return sum;
    }
}
