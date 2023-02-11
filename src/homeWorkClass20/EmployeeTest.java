package homeWorkClass20;

public class EmployeeTest {
    public static void main(String[] args) {
        FullTimeEmployees fTime=new FullTimeEmployees("John","Snow",2321,41);
        fTime.workedHours();
        PartTimeEmployees pTime=new PartTimeEmployees("Sam","Kelley",1241,3);
        pTime.workedDays();
    }

}
