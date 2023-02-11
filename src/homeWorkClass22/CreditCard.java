package homeWorkClass22;

public class CreditCard {
    double balance;
    double interest;
    double calculateInterest(double balance){
        interest=7.0;
        return (balance*interest/100);
    }
}
class Visa extends CreditCard{
}
class AX extends CreditCard{
    double calculateInterest(double balance){
        interest=8.0;
        return (balance*interest/100);
}
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        System.out.println(creditCard.calculateInterest(10000));
        Visa visa=new Visa();
        System.out.println(visa.calculateInterest(10000));
        AX ax=new AX();
        System.out.println(ax.calculateInterest(10000));
    }
}

