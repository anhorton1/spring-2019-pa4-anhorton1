package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        String menuChoice = getMenuChoice(keyboard);
        while (!menuChoice.equals("4")) {
            if (menuChoice.equals("1")) {
                encodeFile();
            } else if (menuChoice.equals("2")) {
                decodeFile();
            } else if (menuChoice.equals("3")) {
                displayWordCount();
            } else {
                System.out.println("You did not make a valid choice. Please try again."); //Error checking for invalid menu choice
            }
            menuChoice = getMenuChoice(keyboard);
            System.out.println();
        }
    }

    public static String getMenuChoice(Scanner keyboard) {
        System.out.println("Please press 1 to Encode a File.");
        System.out.println("Please press 2 to Decode a File.");
        System.out.println("Please press 3 to Display Word Count.");
        System.out.println("Please press 4 to Exit.");
        String choice = keyboard.next();
        return choice;
    }

    public static void encodeFile(String fileName) throws IOException {
        System.out.println("Please enter the file name you would like to encode: ");

        File file = new File(fileName);
        Scanner inFile = new Scanner(file);

        while (inFile.hasNext()){
            String fileInput = inFile.nextLine();

            System.out.println(fileInput);

        }

    }

    public static void decodeFile() {

    }

    public static void displayWordCount() {
        System.out.println("Which file name would you like to display the word count for?");
        System.out.println();

        System.out.println();
    }
}
