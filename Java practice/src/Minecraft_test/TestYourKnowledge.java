package Minecraft_test;

import java.util.Scanner;

public class TestYourKnowledge {
    public static void main(String[] args) {
       // Make an intro before making an array of questions
       // Create an array list of questions for this Class
       // Make a loop Logic that allows the User to choose whether he/or she wants to requiz themselves or not
       // Make a logic that allows the User to exit this game and back to the main menu

        // Your code here.
        // Intro
        System.out.println("Welcome to the Minecraft test your knowledge game!");
        System.out.println("We will give you a series of Questions to answer to see how much you know about minecraft");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to start the game? (yes/no)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            // Create a command that prints out the questions and answers below
            // Use a loop to ask the questions and check if the answers are correct
            // Keep track of the number of correct answers and print it at the end
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Exiting the game. Thanks for playing!");
        }
    }
}
