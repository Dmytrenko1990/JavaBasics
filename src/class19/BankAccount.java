package class19;

public class BankAccount {  // parent class or super class or base class
    long accountNumber;
    double money;
    void deposit(){
        System.out.println("Deposit");
    }
}
class Checking extends BankAccount{  //child class or sub class or derived class
    double interest;
    void transfer(){
        System.out.println("transfer method from checking");
    }
}
class Savings extends BankAccount{
    double profit;
    void takeProfit(){
        System.out.println("transfer method from Saving class");

        //finish creating SuperSavings object and see what feature available to that class
    }
}
