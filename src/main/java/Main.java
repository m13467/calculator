import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter: ");

        // Read a line of text entered by the user
        String temp = scanner.nextLine();

        while (!Objects.equals(temp, "quit")) {
            String[] input = new String[3];
            int position = 0;

            StringBuilder nBuilder = new StringBuilder();
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == ' ') {
                    input[position] = nBuilder.toString();
                    nBuilder = new StringBuilder();
                    position += 1;
                } else {
                    nBuilder.append(temp.charAt(i));
                }
            }

            if (nBuilder.length() > 0) {
                input[position] = nBuilder.toString();
            }

            System.out.println(input[0]);

            Calculator calc = new Calculator();
            if (Objects.equals(input[0], "add")) {
                System.out.println(calc.add(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
            } else if (Objects.equals(input[0], "subtract")) {
                System.out.println(calc.subtract(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
            } else if (Objects.equals(input[0], "multiply")) {
                System.out.println(calc.multiply(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
            } else if (Objects.equals(input[0], "divide")) {
                System.out.println(calc.divide(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
            } else if (Objects.equals(input[0], "binary")) {
                System.out.println(calc.intToBinaryNumber(Integer.parseInt(input[1])));
            } else if (Objects.equals(input[0], "fibonacci")) {
                System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(input[1])));
            } else {
                System.out.println("error");
            }

            // Prompt the user for input
            System.out.print("Enter: ");

            // Read a line of text entered by the user
            temp = scanner.nextLine();
        }
        scanner.close();
    }
}
