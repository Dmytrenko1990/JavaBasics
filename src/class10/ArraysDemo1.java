package class10;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        System.out.println(arr[4]);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
          //enhanced/foreach for loop
          //when ever possible use below loop
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
