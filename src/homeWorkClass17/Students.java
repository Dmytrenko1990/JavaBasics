package homeWorkClass17;
       /* Write a java Class Students that have a constructor which takes students name and 3 subject grades.
        Inside your class also have a method to Calculate Average Grade. Test Student class
        for 5 different students with different marks. Your program should print an average mark of each students name.
        NOTE: please use different names for instance and local variables.
*/
public class Students {
    String name;
    double mathGrade;
    double scienceGrade;
    double historyGrade;
    double AvarageGrade;
    Students(String  stName,double stMathGrade,double stScienceGrade,double stHistoryGrade){
        name=stName;
        mathGrade=stMathGrade;
        scienceGrade=stScienceGrade;
        historyGrade=stHistoryGrade;
    }
    void avarageGrade(){
        double avarage=(mathGrade+scienceGrade+historyGrade)/3;
        System.out.println(avarage);

    }
}
