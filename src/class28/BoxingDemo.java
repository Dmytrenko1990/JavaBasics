package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer=new Integer(10);
        int number=integer;//it is auto unboxing
        int number2=integer.intValue();//unboxing

        double d=12.3;
        Double wrapperD=new Double(d); //boxing
        Double wrapper=d;//autoBoxing

        Float f=12.3f;
        ArrayList<Double>arrayList=new ArrayList<>();
        arrayList.add(12.3);

    }
}
