package homeWorkClass19;

/*Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
        Create 3 subclasses MathTeacher, ChemistryTeacher and
        PianoTeacher that would have it their own features and behaviour.
        Test all 4 classes*/
public class Teacher {
    String name;
    int teacherId;

    public void Teach() {
        System.out.println("Teacher can teach");
    }

    public void Listen() {
        System.out.println("Teacher can listen");
    }

    public void Quiz() {
        System.out.println("Teacher make quiz");
    }

    public void HomeWork() {
        System.out.println("Teacher give homework");
    }
}

class MathTeacher extends Teacher {
    boolean teachMath;
    void Equations() {
        System.out.println("Teacher solving equations");
    }
}

class ChemistryTeacher extends Teacher {
    boolean teachChemistry;
    void Experiments() {
        System.out.println("Teacher making chemistry experiments");
    }

}

class PianoTeacher extends Teacher {
    boolean playPiano;
    void PlayPiano() {
        System.out.println("Teacher playing on piano");
    }
}
