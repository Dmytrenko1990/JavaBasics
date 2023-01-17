package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        String name="Slava";
        String name2="Safi";
        String name3="Jason";
        String name4="Nabi";
        String name5="Anees";

        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};
        System.out.println(name2);
        System.out.println(names[1]);
        System.out.println(names[5]);
        //System.out.println(names[500]);   error because there is no name on index 500
        //System.out.println(names[-5]);    error (index can not be nagative)
    for(int i=0; i< names.length;i++){
        System.out.println(names[i]);
    }
    }

}
