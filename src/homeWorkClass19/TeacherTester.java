package homeWorkClass19;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name="Rony";
        teacher.teacherId=123456;
        teacher.teach();
        teacher.listen();
        teacher.quiz();
        teacher.homeWork();
        System.out.println(teacher.name+" "+teacher.teacherId);

        MathTeacher mathT=new MathTeacher();
        mathT.name="Bob";
        mathT.teacherId=234567;
        mathT.teachMath=true;
        mathT.equations();
        mathT.teach();
        mathT.listen();
        mathT.quiz();
        mathT.homeWork();
        System.out.println(mathT.name+" "+mathT.teacherId);

        ChemistryTeacher chemT=new ChemistryTeacher();
        chemT.name="Alisa";
        chemT.teacherId=678945;
        chemT.teachChemistry=true;
        chemT.experiments();
        chemT.teach();
        chemT.listen();
        chemT.quiz();
        chemT.homeWork();
        System.out.println(chemT.name+" "+chemT.teacherId);

        PianoTeacher pianoT=new PianoTeacher();
        pianoT.name="Mary";
        pianoT.teacherId=345879;
        pianoT.playPiano=true;
        pianoT.PlayPiano();
        pianoT.teach();
        pianoT.listen();
        pianoT.quiz();
        pianoT.homeWork();
        System.out.println(pianoT.name+" "+pianoT.teacherId);





    }
}