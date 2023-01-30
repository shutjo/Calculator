import java.io.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        double input1, input2, result;
        char operation;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Enter first number: ");
        input1 = inputUser.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operation = inputUser.next().charAt(0);

        System.out.print("Enter second number: ");
        input2 = inputUser.nextDouble();

        switch (operation) {
            case '+':
                result = input1 + input2;
                break;
            case '-':
                result = input1 - input2;
                break;
            case '*':
                result = input1 * input2;
                break;
            case '/':
                result = input1 / input2;
                break;
            default:
                System.err.println("Invalid operator!");
                return;
        }
        System.out.println("The result is: " + result);

        FileWriter fileInput = new FileWriter("result.txt", true);
        fileInput.write(result + " " );
        System.out.println();
        fileInput.close();
        System.out.println("Result saved to file");
    }
}
