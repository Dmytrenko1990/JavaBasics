package project1;

public class Task4 {
    /*Create a 2D array or integer type where you will store
    odd and even numbers. Develop a program which will identify/
    print the even numbers only.*/
    public static void main(String[] args) {
    int[][]arr={{11,6,8,77},
            {5,56,32},
            {17,8,54,9}};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]%2==0){
                System.out.println(arr[i][j]);
            }
        }
        }
    }
}
