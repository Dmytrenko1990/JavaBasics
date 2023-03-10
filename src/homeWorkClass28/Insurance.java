package homeWorkClass28;

import java.util.ArrayList;
import java.util.Iterator;

/*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has
it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.*/
public abstract class Insurance {
    String insuranceName;

    public abstract void getQuote();

    public abstract void cancelInsurance();

    Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
}
class Car extends Insurance{
    String carModel;

    public Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Quote for your: "+carModel);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Insurance "+insuranceName+" for your "+carModel+" will be canceled after 30 days");
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("You will get quote from "+insuranceName+" for your "+petType);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Insurance "+insuranceName+" for your "+petType+" will be canceled after 3 month");
    }
}
class Health extends Insurance{
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Quote for you from "+insuranceName);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Insurance "+insuranceName+" you can cancel after 6 month");
    }

}
class Test {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("StateFarm", "Mercedes"));
        insurances.add(new Pet("Pets Best", "German Shepherd"));
        insurances.add(new Health("Florida Blue"));


        for (int i = 0; i < insurances.size(); i++) {
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
        }
        System.out.println("/////////////////////");
        for (Insurance insurance : insurances) {
            insurance.getQuote();
        }
        for (Insurance insurance : insurances) {
            insurance.cancelInsurance();
        }
        System.out.println("////////////////");
        Iterator<Insurance> iterator = insurances.iterator();
        while (iterator.hasNext()) {
            Insurance insurance = iterator.next();
            insurance.getQuote();
        }
    }
}

