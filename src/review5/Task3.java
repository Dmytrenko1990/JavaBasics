package review5;

public class Task3 {
    public static void main(String[] args) {
        int[][]array={
                {1,2,3},
                {11,12,13},
                {20,21,22},
                {100,101}
        };
        int sum=0;
        for(int[]arr:array){
            for (int num:arr){
              sum+=sum;
                System.out.println("Total = "+sum);
            }
    }
    }
}
