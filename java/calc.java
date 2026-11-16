import java.util.Scanner;

public class calc {
    public static void main (String[] args) {


   
    double num1 , num2;
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your numbers: ");
    num1 = scan.nextFloat();
    num2 = scan.nextFloat();

    System.out.println("Enter an operation (+, -, *, /): ");
    char op = scan.next().charAt(0);

    double result;
    switch (op) {
        case '+':
            result = num1 + num2;
            break;

        case '-':
            result = num1 - num2;
            break;

        case '*':
            result = num1 * num2;
            break;

        case '/':
            if (num2 == 0) {
                System.out.println("Division by zero is not allowed");
                return;
            }
            result = num1 / num2;
            break;

        default:
            System.out.println("Invalid Input");
            return;
    }

    System.out.println("The final Result: ");
    System.out.println(num1 + " " + op + " " + num2 + " = " + result);


    
}
}
