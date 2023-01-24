package class12;

public class PhoneTester {
    public static void main(String[] args) {
        Phone Samsung = new Phone();
        Samsung.brand = "Samsung";
        Samsung.colour = "Black";
        Samsung.model = "S22Ultra";
        Samsung.ScreenSize = 6.9;
        Samsung.Functions = "Touch";
        Samsung.PriceRange = 1200;

        Samsung.VoiceTone();
        Samsung.Vibration();
        Samsung.RingTone();


        Phone IPhone = new Phone();
        IPhone.model = "14Pro";
        IPhone.brand = "Apple";
        IPhone.colour = "Silver";
        IPhone.Functions = "Touch";
        IPhone.ScreenSize = 6.7;
        IPhone.PriceRange = 1600;

        IPhone.RingTone();
        IPhone.Vibration();
        IPhone.VoiceTone();
    }
    }
