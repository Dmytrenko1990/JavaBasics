package homeWorkClass4;

public class Mortgage {
    public static void main(String[] args) {
        double rate, price;
        rate = 4.6;
        price = 100000;
        if (rate > 4.5) {
            System.out.println("You will not buy house");
        } else {
            if (price > 200000) {
                System.out.println("You will take a loan");
            } else {
                System.out.println("You will pay cash");
            }
        }

    }
}

