package class25;

public class WashableTester {
    public static void main(String[] args) {
    WashAble[] washables={new SmartWatch(),new Inverter(),new Phone()};
    for(WashAble w:washables){
        w.wash();
    }
    }
}
