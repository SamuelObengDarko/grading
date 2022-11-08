import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaration of variables
        String name;
        String subject;
        double testScore;
        String grade;


        //Accept user's name
        System.out.println("Enter your name:");
        name = input.nextLine();

        //Accept user's subject
        System.out.println("Enter subject:");
        subject = input.nextLine();

        //Accept test score of the subject
        System.out.println("Enter your test score:");
        testScore = input.nextDouble();

        //Display grade with the conditions in the if statement
        if(testScore<60) {
            System.out.println("Hello, " + name + " your grade for " + subject + " is F");

        }else if(testScore<70) {
            System.out.println("Hello, " + name + " your grade for " + subject + " is D");

        }else if(testScore<80) {
            System.out.println("Hello, " + name + " your grade for " + subject + " is C");

        }else if(testScore<90) {
            System.out.println("Hello, " + name + " your grade for " + subject + " is B");

        }else {
            System.out.println("Hello, " + name + " your grade for " + subject + " is A");

        }


        //System.out.println("Hello world!");
    }
}