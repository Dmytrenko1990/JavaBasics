package review5;

public class TwoDArray {
    public static void main(String[] args) {
        int[][]array={
            {1,2,3},
            {11,12,13},
            {20,21,22},
                {100,101}
        };
        //getting all values from 2D array using regular for loop
        for (int row = 0;row < array.length; row++) {
            for (int col = 0; col <array[row].length ; col++) {
                //I want to print values only from odd rows
                if (row % 2 != 0) {
                    System.out.print(array[row][col]+" ");
                }
            }
            System.out.println();
        }
        
        //getting all values from 2D array using enhands forLoop
        for(int[] arr:array){
            for(int element:arr){
                if(element%2==0){
                System.out.print(element+" ");
            }
            }
            //
            
            System.out.println();
        }

        int numberOfArrays=array.length;
        System.out.println(numberOfArrays);
        int numberOfElementsIn1Array=array[0].length;
        System.out.println(numberOfElementsIn1Array);

        int numberOfElementsIn4Array=array[3].length;
        System.out.println(numberOfElementsIn4Array);
    }
}
