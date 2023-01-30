package homeWorkClass15;
//Create a method that will print whether given String is palindrome or not.
public class Task3Void {
    //return type =>void
    void isPalindrone(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr= st.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+" is palindrome");}
            else{
                System.out.println(str+" is not palindrome");
            }
        }

    public static void main(String[] args) {
        Task3Void task3=new Task3Void();
        //String result=task3.isPalindrone("dad"); ca not assign void methods to variable
        task3.isPalindrone("dad");
    }
    }

