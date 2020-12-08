import java.util.Scanner;

public class Switchcalculator {
    

  public static void main(String[] args) {
    // double a;
    // double b;
    double result;

    Scanner mths = new Scanner(System.in);
    System.out.print("Enter two numbers");

    double a = mths.nextDouble();
    double b = mths.nextDouble();

    System.out.print("Enter an operator (+,-,*,/) ");
    char oprtr = mths.next().charAt(0);

    

    switch (oprtr) {
      case '+':
        result = a + b;
        break;

      case '-':
        result = a - b;
        break;

      case '*':
        result = a * b;
        break;

      case '/':
        result =a / b;
        break;

      default:
        System.out.printf("sorry!!! operator is not correct");
        return;
    }

    System.out.println(a + " " + oprtr + " " + b + " = " + result);
  }
}


