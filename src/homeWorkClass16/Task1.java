package homeWorkClass16;

public class Task1 {
    /*Create a method that will accept an array as parameters and will return
    a sum of all elements from that array. Method should be visibly only within
        same package and accessible by the creating an instance of the class.*/
    int sumOfArray(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
            }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int[]array={2,7,4,5};
        System.out.println(task1.sumOfArray(array));
    }
}
