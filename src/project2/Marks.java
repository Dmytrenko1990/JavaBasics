package project2;
/*We have to calculate the average of marks
        obtained in three subjects by student A and by
        student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
        the average percentage of marks. Provide
        implementation of abstract method in classes
        'A' and 'B'. The constructor of student A takes the
        marks in three subjects as its parameters and
        the marks in four subjects as its parameters for
        student B. Test your code*/
public abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks{
    int subj1,subj2,subj3;
    A(int subj1,int subj2,int subj3){
        this.subj1=subj1;
        this.subj2=subj2;
        this.subj3=subj3;
    }
    @Override
    double getPercentage() {
        return ((subj1+subj2+subj3)/3);
    }
}
class B extends Marks{
    int subj1,subj2,subj3,subj4;
    B(int subj1,int subj2,int subj3,int subj4){
        this.subj1=subj1;
        this.subj2=subj2;
        this.subj3=subj3;
        this.subj4=subj4;
        }
    @Override
    double getPercentage() {
        return ((subj1+subj2+subj3+subj4)/4);
    }
}
class MarksTester {
    public static void main(String[] args) {
      Marks[]students={new A(80,85,90),new B(92,80,87,78)};
      for(Marks student:students){
          System.out.println(student.getPercentage());
      }
    }
}
