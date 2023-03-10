package homeWorkClass28;

import java.util.Iterator;
import java.util.LinkedList;

/*Create a Card class that will have interest rate field and card type
        and a constructor that will initialize the fields.
        Create 3 objects of different card and store them into LinkedList.
        Using for loop/advanced for loop/ iterator access all methods of the class.*/
public class Card {
    double interestRate;
    String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }
    public void printInterest() {
        System.out.println("Interest on card " + cardType + " is " + interestRate +" % ");
    }

    public void printCardType() {
        System.out.println("Your card type is " + cardType);
    }

    public static void main(String[] args) {
        LinkedList<Card>cards=new LinkedList<>();
        cards.add(new Card(4.5,"Wells Fargo"));
        cards.add(new Card(4.7,"Bank of America"));
        cards.add(new Card(4.6,"Regions"));
        for(Card card:cards)
            card.printCardType();
        for (int i = 0; i <cards.size() ; i++) {
            cards.get(i).printInterest();
        }
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            card.printCardType();
        }
    }
}
