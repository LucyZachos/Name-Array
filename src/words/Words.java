package words;

import java.util.Scanner;

public class Words {
    //Variables declared and initialized
    public static int count = 0;
    public static int a = 20;
    public static int nothing = 0;

    //Method to determine how many elements in the array have more than 4 characters
    public static String howManyWords(String[] studentNames) {

        for (String studentName : studentNames) {
            if (studentName.length() > 4) {
                count++;
            }
        }
        // If the above count equals zero, print the output
        if (count == 0) {
            //Print the output
            System.out.println("No words with more than five characters was found");
        }else{
            return String.valueOf(count);
        }
    return("");
    }

    //Method to return the array
    public static void showWords(String[] studentNames) {
        for (String names : studentNames) {
            System.out.println(names);
        }
    }
    //Main method
    public static void main(String[] args) {
        //Array is declared
        String[] studentNames = new String[a];
        //Collect user input
        Scanner input = new Scanner(System.in);
        //Print the output
        System.out.println("Please enter the names of the students: \n");
        String sentence = input.nextLine();
        for (int i = 0; i < a; i++) {
            studentNames[i] = input.next();
        }
        //Print the output
        System.out.println("\nStudent names:");
        //Call method showWords
        showWords(studentNames);
        //Print the output
        System.out.println("\nTotal number of student names with more than 4 characters:");
        //Call method howManyWords
        System.out.println(howManyWords(studentNames));
    }
}

