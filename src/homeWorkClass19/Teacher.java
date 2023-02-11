package homeWorkClass19;

/*Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
        Create 3 subclasses MathTeacher, ChemistryTeacher and
        PianoTeacher that would have it their own features and behaviour.
        Test all 4 classes*/
public class Teacher {
    public String name;
    public int teacherId;

    public void teach() {
        System.out.println("Teacher can teach");
    }

    public void listen() {
        System.out.println("Teacher can listen");
    }

    public void quiz() {
        System.out.println("Teacher make quiz");
    }

    public void homeWork() {
        System.out.println("Teacher give homework");
    }
}

class MathTeacher extends Teacher {
    boolean teachMath;
    void equations() {
        System.out.println("Teacher solving equations");
    }
}

class ChemistryTeacher extends Teacher {
    boolean teachChemistry;
    void experiments() {
        System.out.println("Teacher making chemistry experiments");
    }

}

class PianoTeacher extends Teacher {
    boolean playPiano;
    void PlayPiano() {
        System.out.println("Teacher playing on piano");
    }
}
