package Variable_Inputs;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of text: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int inputInteger = scanner.nextInt();
        System.out.println("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        System.out.println("Enter a boolean value: ");
        boolean inputBoolean = scanner.nextBoolean();

        System.out.println("You entered: " + inputString);
        System.out.println("You entered: " + inputInteger);
        System.out.println("You entered: " + inputDouble);
        System.out.println("You entered: " + inputBoolean);
    }
}
