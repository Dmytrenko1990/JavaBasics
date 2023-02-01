package homeWorkClass17;
/*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
        Instance variables are being initialized
        Both Constructors are being executed*/
public class Book {
    String name;
    String author;
    int pages;
    double price;
    Book(String bName,String bAuthor){
        name=bName;
        author=bAuthor;
    }
    Book(String bName,double bPrice,int bPages){
        name=bName;
        price=bPrice;
        pages=bPages;

    }
}
