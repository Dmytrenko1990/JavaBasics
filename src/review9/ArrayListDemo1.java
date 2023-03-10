package review9;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String>computers=new ArrayList<>();
        computers.add("Macbook Pro");
        computers.add("HP");
        computers.add("Lenovo");
        computers.add("DELL");

        System.out.println(computers);
        for (int i = 0; i <computers.size() ; i++) {
            String c=computers.get(i);
            if(c.equals("HP")){
                System.out.println("I have HP");
            }
            System.out.println(c+" ");
        }
        System.out.println("____________");
            for(String comp:computers){
                System.out.println(comp+" ");
            }

    }
}
