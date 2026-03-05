import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        float number1, number2;
        float addition, subtraction, multiplication, division;

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        number1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        number2 = sc.nextFloat();

        // Arithmetic operations
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;

        // Checking division by zero
        if (number2 != 0) {
            division = number1 / number2;

            // Output
            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                    + number1 + " and " + number2 + " is "
                    + addition + ", " + subtraction + ", "
                    + multiplication + ", and " + division);
        } 
        else {
            System.out.println("Division not possible (cannot divide by zero)");
        }

        sc.close();
    }
}