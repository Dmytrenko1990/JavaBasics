package class12;

public class PlaneTester {
    public static void main(String[] args) {
        Plane airbus=new Plane();
        airbus.make="Airbus";
        airbus.model="A320";
        airbus.year=2010;
        airbus.takeOff();

        Plane boeing=new Plane();
        boeing.make="Boeing";
        boeing.model="767";
        boeing.year=2002;
        boeing.landing();

    }
}
