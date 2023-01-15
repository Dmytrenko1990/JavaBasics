package class8;

public class NestedLoops2 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
