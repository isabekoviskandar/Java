import java.util.Scanner;

public class Calculator {

    public static void basic_calculator() {
        Scanner scanner = new Scanner(System.in);

        char symbol;
        double num1;
        double num2;

        double result;

        System.err.print("Enter the symbol: (+ , - , / , * , % , ^): ");
        symbol = scanner.next().charAt(0);

        switch (symbol) {
            case '+':
                System.err.print("Enter the number 1: ");
                num1 = scanner.nextInt();

                System.err.print("Enter ther number 2: ");
                num2 = scanner.nextInt();

                result = num1 + num2;

                System.err.println("The result is: " + result);
                break;
            case '-':
                System.err.print("Enter the number 1: ");
                num1 = scanner.nextInt();

                System.err.print("Enter ther number 2: ");
                num2 = scanner.nextInt();

                result = num1 - num2;

                System.err.println("The result is: " + result);
                break;
            case '*':
                System.err.print("Enter the number 1: ");
                num1 = scanner.nextInt();

                System.err.print("Enter ther number 2: ");
                num2 = scanner.nextInt();

                result = num1 * num2;

                System.err.println("The result is: " + result);
                break;
            case '/':
                System.err.print("Enter the number 1: ");
                num1 = scanner.nextInt();

                System.err.print("Enter ther number 2: ");
                num2 = scanner.nextInt();
                if (num2 == 0) {
                    System.err.println("Sorry 0 divion error try again!!");
                } else {
                    result = num1 / num2;
                    System.err.println("The result is: " + result);
                }
                break;
            case '%':
                System.err.print("Enter the number 1: ");
                num1 = scanner.nextInt();

                System.err.print("Enter ther number 2: ");
                num2 = scanner.nextInt();

                result = num1 % num2;

                System.err.println("The result is: " + result);
                break;
            case '^':
                System.err.print("Enter the number 1: ");
                num1 = scanner.nextInt();

                System.err.print("Enter ther number 2: ");
                num2 = scanner.nextInt();

                result = Math.pow(num1, num2);

                System.err.println("The result is: " + result);
                break;

            default:
                System.err.println("Please enter the correct operation!!");
                break;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        basic_calculator();
    }

}