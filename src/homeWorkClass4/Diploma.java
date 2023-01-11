package homeWorkClass4;

public class Diploma {
    public static void main(String[] args) {
        boolean diploma;
        double gpa;
        gpa = 3.2;
        diploma = true;
        if (diploma) {
            System.out.println("Congratulations!!!");

            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have studied harder");
            }

            }
        else System.out.println("You should get degree");

        }
    }

