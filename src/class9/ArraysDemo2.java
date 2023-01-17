package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 10 20 30 45 50
        int sum=0;
        int [] numbers={10,20,30,45,50};
        for (int i=0;i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
            sum=sum+numbers[i];

        }
        System.out.println(sum);
    }
}
