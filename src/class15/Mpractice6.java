package class15;

public class Mpractice6 {
    String createEmail(String name,String lastName,String emailType){
        String email=name.toLowerCase()+lastName.toLowerCase()+"@"+emailType+".com";
        return email;
    }


}
