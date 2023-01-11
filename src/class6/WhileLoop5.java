package class6;

public class WhileLoop5 {
    public static void main(String[] args) {
        /*int num=1;
        boolean flag=true;
        while(flag){
            System.out.println(num);
            if(num>3){
                flag=false;
            }
            num++;
        }*/
        int num=2;
        while(num<10){
            if(num%2==0) {
                System.out.println("Even "+num);
            }
            num++;
        }
    }
}
