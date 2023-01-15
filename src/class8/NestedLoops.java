package class8;

public class NestedLoops {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){   //outer loop
            for (int j=0;j<5;j++){      //inner loop
                System.out.println(j);
            }
            System.out.println("********************");
        }
    }
}
