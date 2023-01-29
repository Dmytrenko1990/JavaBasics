package homeWorkClass13;

public class Task2 {
    //Create a String that should be combination of letters, numbers and special characters.
    //Find out ow many Alphanumerical(abdAZ284) characters are there in String.
    public static void main(String[] args) {
        String str="Ahf^%#yA456+&HK4324JH&(*6YBNbvs";
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length()+ " Alphanumerical characters are there in String");

    }
}
