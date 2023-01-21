package project1;

public class Task9 {
    /*Maximum and minimum number in the array?*/
    public static void main(String[] args) {
        int arr[]={2,4,67,8,12,3,45,98};
        int max=0;
        int min=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                 max=arr[i];
            } else if(arr[i]<arr[i+1])
            {min=arr[i];}
        }
        System.out.println("Maximum number of array is: "+max);
        System.out.println(min);

    }
}
