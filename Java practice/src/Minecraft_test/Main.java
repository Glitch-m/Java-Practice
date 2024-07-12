package Minecraft_test;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static <TheMinecraftGame> void main(String[] args) {
        /* Task
         *
         *  Create a custom class and connect it to the main class
         *  Make sure that when you Run the code you can make a Java collection, interfaces & Polymorphism classes
         *  Create a custom statement within these classes and complete the code of the other classes for the main class to work.
         *
         *  primary objective is to make a Java collection with a proper name. The name we will use for this class will be called "The_minecraft_Game"
         *  The Second class that supports the first class will be called "The_Minecraft_Config"
         *
         *  The "The_minecraft_Config" Class will be used to set up print out statements for the main class. By the time we finish the Code
         *  The main class will have a code that says "The_Minecraft_Game game = new The_minecraft_Game"
         *  Hopefully This will succeed.
         *
         * */

        // ----------------------------------------------------------------
        // Create a command that connects to the Other classes

        System.out.println("Welcome to the Minecraft Mini Game");
        System.out.println("Which Options Would you like to select");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();

        choice = new Choice() {
            case 1:
                TestYourKnowledge = new TestYourKnowledge();
                break;
        };

    }
}