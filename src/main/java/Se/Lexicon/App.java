package Se.Lexicon;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    //Scanner for keyboard input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuScan();
    }

    private static void printMenu() {
        // Simple Menu
        System.out.println("............................................");
        System.out.println("...../ Simple Calculator v0.2b /............");
        System.out.println("............................................");
        System.out.println("...../ 1. Preform a sinple calculation    /.");
        System.out.println("...../ 2. Preform Addition using Array    /.");
        System.out.println("...../ 3. Preform Subtraction using Array /.");
        System.out.println("...../ 3. Terminate program     /...........");
        System.out.println("............................................");
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
                case '4':
                    System.out.println("Goodbye!");
                    scanner.close();
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
                if (selection1 == 0) {
                    System.out.println("Multiplication by zero is always zero");
                    menuScan();
                    break;
                } else if (selection2 == 0) {
                    System.out.println("Multiplication by zero is always zero");
                    menuScan();
                    break;
                }
                else
                    displayResult(calcResult);
                    break;
            case '/':
                calcResult = division(selection1, selection2);
                if (selection1 == 0) {
                    System.out.println("Division by zero is not allowed");
                    menuScan();
                    break;
                } else if (selection2 == 0) {
                    System.out.println("Division by zero is not allowed");
                    menuScan();
                    break;
                }
                else
                    displayResult(calcResult);
                    break;
            default:
                System.out.println("I don't recognize that operator you used");
                menuScan();
                break;
        }
    }

    //Display the Result
    private static void displayResult(double result) {

        System.out.println("The answer is: " + result);
    }
    //Growing the array by 1
    public static double[] addArray(double[] array) {
        return Arrays.copyOf(array, (array.length + 1));
    }

    //Mathematic Operators
    public static double addition(double selection1, double selection2) {
        return selection1 + selection2;
    }

    public static double subtraction(double selection1, double selection2) {
        return selection1 - selection2;
    }

    public static double multiplication(double selection1, double selection2) {
        return selection1 * selection2;
    }

    public static double division(double selection1, double selection2) {
        return selection1 / selection2;
    }

    //Overloaded addition method set to accept array
    public static double addition(double[] array1) {
        double sum = 0;
        for (double i : array1)
            sum += i;
        return sum;
    }

    //Overloaded subtraction method set to accept array
    public static double subtraction(double[] array1) {
        double diff = array1[0];
        for (double i : array1)
            diff -=i;
        return diff;
    }
}







