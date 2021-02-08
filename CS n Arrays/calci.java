      0import java.util.Scanner;

public class calci {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = s.nextDouble();
        System.out.print("Enter second number:");
        num2 = s.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = s.next().charAt(0);

        s.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}