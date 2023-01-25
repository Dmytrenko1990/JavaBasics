package HomeWorkClass13;

public class Task2 {
    //Create a String that should be combination of letters, numbers and special characters.
    //Find out ow many Alphanumerical(abdAZ284) characters are there in String.
    public static void main(String[] args) {
        String str="Ahf^%#yA456+&HK4324JH&(*6YBNbvs";
        String updatedStr=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(updatedStr);
        int count=0;
        for (int i = 0; i < updatedStr.length() ; i++) {
            count++;
        }
        System.out.println(count+ "Alphanumerical characters are there in String");

    }
}
