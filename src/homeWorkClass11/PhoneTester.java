package homeWorkClass11;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        phone1.brand="Iphone";
        phone1.color="Silver";
        phone1.model="14 proMax";
        phone1.operationSystem="iOS";
        phone1.price=1299;
        phone1.makeCall();

        Phone phone2=new Phone();
        phone2.brand="Pixel";
        phone2.color="White";
        phone2.model="7 PRO";
        phone2.operationSystem="Android";
        phone2.price=499;
        phone2.alarm();

        Phone phone3=new Phone();
        phone3.brand="Samsung";
        phone3.color="Black";
        phone3.model="Galaxy S22";
        phone3.operationSystem="Android";
        phone3.price=649;
        phone3.takePicture();
    }
}
