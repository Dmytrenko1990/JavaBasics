package class16;
/*
Create a method that will accept an array as parameters and will return
        a sum of all elements from that array. Method should be visibly only within same package
        and accessible by the creating an instance of the class.
*/
public class HWTask1 {
   /* return type= int
    name=>SumArrayElements
    parameters=>int[]arr
    access modifier=default   */
    int sumArrayElements(int [] arr){
        int sum = 0;
        for (int num:arr) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]arr={10,25,35,45};
        HWTask1 task1=new HWTask1();
        System.out.println(task1.sumArrayElements(arr));
    }

}
