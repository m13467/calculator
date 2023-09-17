import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        if (Objects.equals(args[0], "add")) {
            System.out.println(calc.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        } else if (Objects.equals(args[0], "subtract")) {
            System.out.println(calc.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        } else if (Objects.equals(args[0], "multiply")) {
            System.out.println(calc.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        } else if (Objects.equals(args[0], "divide")) {
            System.out.println(calc.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        } else if (Objects.equals(args[0], "binary")) {
            System.out.println(calc.intToBinaryNumber(Integer.parseInt(args[1])));
        } else if (Objects.equals(args[0], "fibonacci")) {
            System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(args[1])));
        } else {
            System.out.println("error");
        }
    }
}
