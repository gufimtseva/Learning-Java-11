import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

        System.out.println("Student: " + studentFirstName + " " + studentLastName);
        System.out.println("Age: " + studentAge);
        System.out.println("Initials: " + studentFirstInitial + ", " + studentLastInitial);
        System.out.println("Student has perfect attendance: " + hasPerfectAttendance);

        System.out.println("\n" + studentFirstName + " has a GPA of " + studentGPA);
        
        // Updating the GPA with the inputted value
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println("According to input data, " + studentFirstName + " has a GPA of " + studentGPA);

        // Automatically calculate a student's GPA, given a series of grades
        System.out.println("\n" + "Put student's grades for Math, Science and English to automatically GPA calculating:");
        Scanner inputMathGrade = new Scanner(System.in);
        Scanner inputScienceGrade = new Scanner(System.in);
        Scanner inputEngGrade = new Scanner(System.in);
        studentGPA = (inputMathGrade.nextDouble() + inputScienceGrade.nextDouble() + inputEngGrade.nextDouble()) / 3;
        System.out.println("According to calculating, " + studentFirstName + " has a GPA of " + studentGPA);
    }
    
}
