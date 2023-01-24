package project1;

public class Task10 {
    public static void main(String[] args) {
        int arr[] = {90, 10, 67, 767, 12, 670, 45, 98};
        int max;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }

        }
        System.out.println("The second largest number is: " + arr[arr.length-2]);
    }
}

