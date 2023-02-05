package homeWorkClass19;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name="Rony";
        teacher.teacherId=123456;
        teacher.Teach();
        teacher.Listen();
        teacher.Quiz();
        teacher.HomeWork();
      //  System.out.println(teacher.name+" "+teacher.teacherId);

        MathTeacher mathT=new MathTeacher();
        mathT.name="Bob";
        mathT.teacherId=234567;
        mathT.teachMath=true;
        mathT.Equations();
        mathT.Teach();
        mathT.Listen();
        mathT.Quiz();
        mathT.HomeWork();

        ChemistryTeacher chemT=new ChemistryTeacher();
        chemT.name="Alisa";
        chemT.teacherId=678945;
        chemT.teachChemistry=true;
        chemT.Experiments();
        chemT.Teach();
        chemT.Listen();
        chemT.Quiz();
        chemT.HomeWork();

        PianoTeacher pianoT=new PianoTeacher();
        pianoT.name="Mary";
        pianoT.teacherId=345879;
        pianoT.playPiano=true;
        pianoT.PlayPiano();
        pianoT.Teach();
        pianoT.Listen();
        pianoT.Quiz();
        pianoT.Quiz();





    }
}