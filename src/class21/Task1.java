package class21;
/*Create 1 class in which create a methods that will calculate the area of
        Rectangle
        Square*/
public class Task1 {
   void calculateArea(double lenght,double width){
        System.out.println("Area of rectangle "+lenght*width);
   }
    void calculateArea(double side){
        System.out.println("Area of rectangle "+side*side);
    }


    public static void main(String[] args) {
        Task1 task1=new Task1();
        task1.calculateArea(10);
        task1.calculateArea(10,20);

    }
}
