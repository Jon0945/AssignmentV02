package Se.Lexicon;

import java.util.Scanner;

public class App {
    //Scanner for keyboard input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuScan();
    }

    private static void printMenu() {
        // Clears the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Simple Menu
        System.out.println(".....................................");
        System.out.println("...../ Simple Calculator v0.1b /.....");
        System.out.println(".....................................");
        System.out.println("...../ 1. Preform a calculation /....");
        System.out.println("...../ 2. Terminate program     /....");
        System.out.println(".....................................");
        System.out.println();
        System.out.print("Make your choice: ");
    }

    private static void menuScan() {

        //Menu choice selector
        boolean KeepGoing = true;

        while (KeepGoing) {
            printMenu();
            char userInput = scanner.next().charAt(0);
            switch (userInput) {
                case '1':
                    calcInput();
                    break;
                case '2':
                    System.out.println("Goodbye!");
                    KeepGoing = false;
                    break;
                default:
                    System.out.println("That's not a valid menu choice");
                    break;
            }
        }
    }

    private static void calcInput() {

        //Asks for user input
        double calcResult;
        System.out.print("Enter Input 1: ");
        double selection1 = scanner.nextDouble();
        System.out.print("Enter Operator: ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter Input 2: ");
        double selection2 = scanner.nextDouble();
        switch (operator) {
            case '+':
                calcResult = addition(selection1, selection2);
                displayResult(calcResult);
                break;
            case '-':
                calcResult = subtraction(selection1, selection2);
                displayResult(calcResult);
                break;
            case '*':
                calcResult = multiplication(selection1, selection2);
                displayResult(calcResult);
                break;
            case '/':
                calcResult = division(selection1, selection2);
                displayResult(calcResult);
                break;
            default:
                System.out.println("I don't recognize the operator you used");
                menuScan();
                break;
        }
    }

    //Display the Result
    private static void displayResult(double result) {

        System.out.println("The answer is: "+ result);
    }

    //Mathematic Operators
    private static double addition(double selection1, double selection2) {
        return selection1 + selection2;
    }

    private static double subtraction(double selection1, double selection2) {
        return selection1 - selection2;
    }

    private static double multiplication(double selection1, double selection2) {
        return selection1 * selection2;
    }

    private static double division(double selection1, double selection2) {
        return selection1 / selection2;
    }
}