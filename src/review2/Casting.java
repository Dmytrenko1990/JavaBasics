package review2;

public class Casting {
    public static void main(String[] args) {
        /*Casting-convert 1 datatype into another
        1.Widening/implicit/automatic
        (byte->short->int->long->float->double)
        2.Narrowing/explicit/manual
        (double->float->long->int->short->byte)
         */
        //Widening
        double d=5;
        System.out.println(d); //5.0
        //Narrowing
        int i=(int)5.0;
        System.out.println(i);   //5

        int num=128;
        byte b=(byte)num;
        System.out.println(b);

    }
}
