package class7;

public class ForLoops {
    public static void main(String[] args) {
        int i=0;
        while(i<=9){
            System.out.println(i);
            i=i+1;
        }
        for(int a=0;a<=9;a++ ){
            System.out.println(a);
        }
        for(int b=1;b<=20;b++){
            if(b%2==0) {
                System.out.println(b);
            }
        }
    }
}
