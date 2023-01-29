package class15;

public class MPractice3Tester {
    //create object of the class that has a method
    //objectname.methodname
    public static void main(String[] args) {
        MPractice3 mp3=new MPractice3();
        int[] arr={10,20,30};
        System.out.println(mp3.arrSum(arr));
        System.out.println(new int[]{10,20,30});// we can put array directly
    }
}
