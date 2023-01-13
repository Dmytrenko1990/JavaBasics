package review3;

public class LogicalOperators1 {
    public static void main(String[] args) {
        boolean dashboard=true;
        String message="Welcom admin";
        if(dashboard||message.equals("Welcome admin")){
            System.out.println("User is successfully logged in");
            }
        else{
            System.out.println("User is not logged in");
        }
        boolean agreeCheckBox=true;
        if(!agreeCheckBox){
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");
    }
}
