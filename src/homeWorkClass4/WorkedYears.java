package homeWorkClass4;

import java.util.Scanner;

public class WorkedYears {
    /*Write a program to ask user to enter numbers of worked years and annual salary.
    If user worked for more or equals to 5 years than user is eligible for the bonus,
    otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
    otherwise bonus=3000.
     */
    public static void main(String[] args) {
        Scanner inputYears = new Scanner(System.in);
        System.out.println("Enter numbers of worked years");
        int workedYears = inputYears.nextInt();
        Scanner inputSalary=new Scanner(System.in);
        System.out.println("Enter your annual salary");
        int annualSalary=inputSalary.nextInt();
        if (workedYears>=5){
            System.out.println("you are eligible for the bonus");
        }
        else if(annualSalary>50000){
            System.out.println("Your bonus is 5000");
        }
              else {
                    System.out.println("Your bonus is 3000");
                }
            }
        }





