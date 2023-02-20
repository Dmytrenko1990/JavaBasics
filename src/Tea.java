public abstract class Tea{
    String teaType;
    public Tea(String teaType){
        this.teaType=teaType;
    }
    public abstract void addSugar();
}

 class LemonTea extends Tea{
    public LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    public void addSugar() {
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class T{
    public static void main(String[] args) {
        LemonTea lemonTea=new LemonTea("Lemon Tea");
        lemonTea.addSugar();
    }

}




