package homeWorkClass9;

public class Task5 {
    public static void main(String[] args) {
        int[]num=new int[5];
        num[0]=4;
        num[1]=1;
        num[2]=18;
        num[3]=7;
        num[4]=12;
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println(sum);

    }
}
