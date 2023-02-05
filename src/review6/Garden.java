package review6;

public class Garden {
    public static void main(String[] args) {
        Flower flower1=new Flower();
        //accessing variable of Flower class
        System.out.println(Flower.pretty);
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false;
        System.out.println("Hibiscus pretty? "+flower1.pretty);
        //System.out.println(flower1.pretty); not the right way to access static var
        //flower1.size=error- since variable not created
        //accessing methods of Flowers class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("Creating second object of flower class");
        Flower flower2=new Flower();
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;
        flower2.price=18;
        flower2.bloom();
        flower2.grow();
        flower2.smell();
        //flower2.stinks error
        Flower flower3=new Flower();


    }
}
