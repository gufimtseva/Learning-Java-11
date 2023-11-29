import java.util.Scanner;

public class StudentProfileMain {

    public static void main(String[] args) {
        // student inctances
        StudentProfile studentA = new StudentProfile("Kayla", "Hammon", 
                                                    2024, 3.45, "IT");
        StudentProfile studentB = new StudentProfile("Galina", "Ufimtseva", 
                                                    2012, 4.5, "Computer Science");
        
        // access to Non-static instance variables(attributes)
        System.out.println("The first student: " +  studentA.firstName + " " + studentA.lastName + 
                                " will be graduating in " + studentA.expectedYearToGraduate);
        System.out.println("The second student: " +  studentB.firstName + " " + studentB.lastName + 
                                " will be graduating in " + studentB.expectedYearToGraduate);

        System.out.println("\nWill the studentA graduate one year later? If so, answer yes");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        if(userInput.equals("yes")) {
            // using an inctance method
             System.out.println("New expected year to graduade for StudentA is " + studentA.incrementExpectedGraduationYear());
        } 
    }
}

