package homeWorkClass15;
/*
Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
        score > 90 - A
        score >80 - B
        score >70 - C
        score > 50 - D
        anything else - F
*/
public class Student {
    char gradeScore(int score){
        if(score>90){
            return 'A';}
        if(score>80&&score<=90){
            return 'B';}
        if(score>70&&score<=80){
            return 'C';}
        if(score>50&&score<=70){
            return 'D';}
        else{return 'D';}
    }
}
