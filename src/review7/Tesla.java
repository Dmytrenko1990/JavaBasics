package review7;

public class Tesla extends Car {
    String type;
    boolean autoPilot;
    public Tesla(String make, String model,int year,int horsePower,String type,boolean autoPilot){
        super(make, model, year, horsePower);
        this.type=type;
        this.autoPilot=autoPilot;
    }
    public void haveAutoPilot(){
        System.out.println(make+" have auto pilot "+autoPilot);
    }
    void drive(int speed,String destination){
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }
    public void start(){
        System.out.println(make+" starts automatically");
    }

}
