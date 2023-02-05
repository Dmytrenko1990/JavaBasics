package class19;

public class Test {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNumber=7265447;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        //ba.transfer(); methods defind in child class not available to the parents
        System.out.println("---creating Object from checking account----");
        Checking check=new Checking();
        //features from parent
        check.accountNumber=5767;
        check.money=780;
        //features from checking class itself
        check.interest=0;

        check.deposit();  //from parent
        check.transfer();  //from child

        System.out.println("---creating Object from Savings account----");
        Savings save=new Savings();
        save.accountNumber=34625476;
        save.money=5738;
        save.profit=100;
        //save.interest=0; siblings features not available
        save.deposit();//from parent
        save.takeProfit();//comes from saving
        //save.transfer(); not available
    }
}

class SuperSavings extends Savings{
    void superSaving(){
        System.out.println("Super saving methods from SuperSaving class");
    }

}
