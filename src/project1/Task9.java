package project1;

public class Task9 {
    /*Maximum and minimum number in the array?*/
    public static void main(String[] args) {
        int arr[]={90,10,67,767,12,3,45,98};
        int max=0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number of array is: "+max);
        int min=max;
        for (int j=0;j<arr.length;j++){
            if(arr[j]<min)
            {min=arr[j];}
        }

        System.out.println("Minimum number of array is: "+min);

    }
}
