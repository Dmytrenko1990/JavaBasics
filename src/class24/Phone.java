package class24;

public abstract class Phone {
    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();
}
class IPhone extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Iphotos to browse the pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("FaceId to unlock the Phone");
    }

    @Override
    void sendText() {
        System.out.println("Lets use the Imessage to send the text");
    }
}
class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Gallery app to brow the pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Using fingerPrint sensor or camera");
    }

    @Override
    void sendText() {
        System.out.println("Messages app to send the message");
    }
}

