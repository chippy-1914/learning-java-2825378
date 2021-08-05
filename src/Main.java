import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        String question = "What do you think my name is ?";
        String choiceOne = "Surabhi";
        String choiceTwo = "Nora";
        String choiceThree = "Chippy";

        String correctAnswer = choiceOne;
        Scanner input=new Scanner(System.in);
        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("A)"+choiceOne+"\n"+"B)"+choiceTwo+"\n"+"C)"+choiceThree);
        // Have the user input an answer
        System.out.println("Write your answer");
        // Retrieve the user's input
        String answer=input.nextLine();
        // If the user's input matches the correctAnswer...
        if(answer.equals(correctAnswer)){ 
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Congratulation dear!");
            
        }
       
        // If the user's input does not match the correctAnswer...
        else{
  // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Sorry, you have given wrong answer. The correct answer is "+correctAnswer);
        }
      

    }

}
