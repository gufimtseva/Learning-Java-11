import java.util.Scanner;

public class MultipleChoise {
    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "EARTH"; 
        String choiceTwo = "JUPITER"; 
        String choiceThree = "SATURN";

        String correctAnswer = choiceTwo;

        boolean askAgain = true;

        while(askAgain) {
            // Print statement asking the question
            System.out.println(question);
            // Print statement giving the answer choices
            System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + " or " + choiceThree);

            // Have the user input an answer
            Scanner input = new Scanner(System.in);
            // Retrieve the user's input
            String userAnswer = input.next();

            // If the user's input matches the correctAnswer...
            // then the user is correct and we want to print out a congrats message to the user
            if(userAnswer.toUpperCase().equals(correctAnswer)) {
                askAgain = false;
                System.out.println("Congratulations! The correct answer is " + correctAnswer);
            } else {
            // If the user's input don't matches the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is wrong
            System.out.println("Sorry, your choice is wrong. Let's try once again!" + "\n");
            }
        }
    }
}
